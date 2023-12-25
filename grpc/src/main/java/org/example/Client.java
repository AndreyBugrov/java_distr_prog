package org.example;
import com.google.protobuf.Empty;
import grpc.connect6.*;
import io.grpc.ManagedChannelBuilder;

import java.nio.channels.Channel;
import java.util.ArrayList;
import java.util.Scanner;

public class Client {
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
        Connect6Grpc.Connect6BlockingStub client = createClient("localhost", 8080);
        int player_num = client.registerPlayer(Empty.newBuilder().build()).getPlayerNum();
        System.out.println(player_num);
        boolean win = false;
        Scanner in = new Scanner(System.in);
        final int boardSize = 11;
        ArrayList<Integer> board_list = new ArrayList<>();
        String[] symbol = new String[3];
        symbol[0]="-";
        symbol[1]="X";
        symbol[2]="0";
        try{
            int x, y;
            if(player_num==1){
                board_list = new ArrayList<>(client.getBoard(Empty.newBuilder().build()).getBoardList());
                draw_list(board_list, symbol, boardSize);
            }
            do{
                while(client.getTurn(Empty.newBuilder().build()).getTurn()!=player_num){
                    if(client.winCheck(PlayerNum.newBuilder().setPlayerNum(1+player_num%2).build()).getStatus()){
                        throw new InterruptedException();
                    }
                    ;
                }
                board_list = new ArrayList<>(client.getBoard(Empty.newBuilder().build()).getBoardList());
                draw_list(board_list, symbol, boardSize);
                x = in.nextInt();
                y = in.nextInt();
                win = client.move(MoveInput.newBuilder().setPlayerNum(player_num).setX(x).setY(y).build()).getStatus();
                board_list = new ArrayList<>(client.getBoard(Empty.newBuilder().build()).getBoardList());
                draw_list(board_list, symbol, boardSize);
            }while(!win);
            System.out.println("Победил игрок номер " + client.getTurn(Empty.newBuilder().build()).getTurn());
        }catch (Exception e){
            board_list = new ArrayList<>(client.getBoard(Empty.newBuilder().build()).getBoardList());
            draw_list(board_list, symbol, boardSize);
            System.out.println("Победил игрок номер " + client.getTurn(Empty.newBuilder().build()).getTurn());
        }
    }
    private static Connect6Grpc.Connect6BlockingStub createClient(String host, int port){
        io.grpc.ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
        //Channel channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
        return Connect6Grpc.newBlockingStub(channel);
    }
}
