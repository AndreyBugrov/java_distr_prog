package org.example;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.Scanner;

public class Client {
    public static void draw(int[][] board, String[]symbol, int boardSize){
        for(int i=0;i<boardSize;i++){
            for(int j=0;j<boardSize;j++) {
                System.out.print(symbol[board[i][j]]);
            }
            System.out.print('\n');
        }
        System.out.print('\n');
    }
    public static void draw_list(ArrayList<Integer> board_list, String[]symbol, int boardSize){
        for(int i=0;i<boardSize;i++){
            for(int j=0;j<boardSize;j++) {
                System.out.print(symbol[board_list.get(i*boardSize+j)]);
            }
            System.out.print('\n');
        }
        System.out.print('\n');
    }

    public static void main(String[] args) {
        String host = (args.length<1)? null : args[0]; // Если null, то ищем сервис имён на локальной машине.
        int port = 8080;
        try{
            Registry registry = LocateRegistry.getRegistry(host, port); // Подключаемся к уже существующему сервису имён. Новый не запускаем.
            System.out.println("registry: "+host+":"+port);
            GameInterface stub = (GameInterface) registry.lookup("HelloServer"); // ищем объект - клиентское прокси
            System.out.println(stub); // печать клиентского прокси

            int player_num = stub.register_player();
            System.out.println(player_num);

            boolean win = false;
            Scanner in = new Scanner(System.in);
            final int boardSize = 11;
            int[][] board = new int[boardSize][boardSize];
            ArrayList<Integer> board_list = new ArrayList<>();
            String[] symbol = new String[3];
            stub.get_symbol(symbol);
            symbol[0]="-";
            symbol[1]="X";
            symbol[2]="0";
            try{
                int x, y;
                if(player_num==1){
                    stub.first_move();
                    board_list = stub.get_board(board);
                    draw_list(board_list, symbol, boardSize);
                }
                do{
                    while(stub.get_turn()!=player_num){
                        if(stub.win_check(1+player_num%2)){
                            throw new InterruptedException();
                        }
                        ;
                    }
                    board_list = stub.get_board(board);
                    draw_list(board_list, symbol, boardSize);
                    x = in.nextInt();
                    y = in.nextInt();
                    win = stub.move(player_num, x, y);
                    //draw(board, symbol, boardSize);
                    board_list = stub.get_board(board);
                    draw_list(board_list, symbol, boardSize);
                }while(!win);
                System.out.println("Победил игрок номер " + stub.get_turn());
            }catch (Exception e){
                board_list = stub.get_board(board);
                draw_list(board_list, symbol, boardSize);
                System.out.println("Победил игрок номер " + stub.get_turn());
            }

        }catch(Exception e){
            System.err.println("RMIClient exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
