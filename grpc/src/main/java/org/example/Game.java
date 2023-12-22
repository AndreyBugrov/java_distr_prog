package org.example;

import java.util.ArrayList;

public class Game implements GameInterface{
    public static final int boardSize = 11;
    final int win_num = 3;
    int players = 0;
    int turn = 0;
    public static int[][] board = new int[boardSize][boardSize];
    public static ArrayList<Integer> board_list = new ArrayList<>();
    public final static String[] symbol={"-","X","0"};

    public boolean win_for_row(int player_num) {
        int counter = 0;
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                if (board_list.get(i*boardSize+j) == 1) {
                    counter++;
                    if (counter == win_num) {
                        return true;
                    }
                } else {
                    counter = 0;
                }
            }
        }
        return false;
    }

    public boolean win_for_column(int player_num) {
        int counter = 0;
        for (int j = 0; j < boardSize; j++) {
            for (int i = 0; i < boardSize; i++) {
                if (board_list.get(i*boardSize+j) == 1) {
                    counter++;
                    if (counter == win_num) {
                        return true;
                    }
                } else {
                    counter = 0;
                }
            }
        }
        return false;
    }

    public boolean win_for_main_diags() {
        int base_i = 0, base_j = 0;
        for (base_j = 0; base_j < boardSize - 1; base_j++) {
            int counter = 0;
            for (int i = base_i, j = base_j; i < boardSize; i++, j++) {
                if (board[i][j] == 1) {
                    counter++;
                    if (counter == win_num) {
                        return true;
                    }
                } else {
                    counter = 0;
                }
            }
        }
        base_j = 0;
        for (base_i = 1; base_i < boardSize - 1; base_i++) {
            int counter = 0;
            for (int i = base_i, j = base_j; i < boardSize; i++, j++) {
                if (board[i][j] == 1) {
                    counter++;
                    if (counter == win_num) {
                        return true;
                    }
                } else {
                    counter = 0;
                }
            }
        }
        return false;
    }

    public boolean win_for_not_main_diags() {
        int base_i = 1, base_j = 0;
        for (base_i = 1; base_i < boardSize; base_i++) {
            int counter = 0;
            for (int i = base_i, j = base_j; i >= 0; i--, j++) {
                if (board[i][j] == 1) {
                    counter++;
                    if (counter == win_num) {
                        return true;
                    }
                } else {
                    counter = 0;
                }
            }
        }
        for (base_j = 1; base_j < boardSize; base_j++) {
            int counter = 0;
            for (int i = base_i, j = base_j; j >= 0; i--, j++) {
                if (board[i][j] == 1) {
                    counter++;
                    if (counter == win_num) {
                        return true;
                    }
                } else {
                    counter = 0;
                }
            }
        }
        return false;
    }

    public boolean win_check(int player_num) {
        //return win_for_column() || win_for_row() || win_for_main_diags() || win_for_not_main_diags();
        return win_for_row(player_num) || win_for_column(player_num);
    }

    public void first_move(){
        for(int i=0;i<boardSize;i++){
            for(int j=0;j<boardSize;j++){
                board_list.add(0);
            }
        }
        int middle = boardSize / 2;
        board[middle][middle] = 1;
        System.out.println(middle*boardSize+middle);
        board_list.set(middle*boardSize+middle, 1);
        turn = 2;
    }
    //TODO: Implement draw function
    //TODO: Make drawing for both clients after any change;
    public void draw(){
        for(int i=0;i<boardSize;i++){
            for(int j=0;j<boardSize;j++) {
                System.out.print(symbol[board[i][j]]);
            }
            System.out.print('\n');
        }
    }
    public ArrayList<Integer> get_board(){
        return board_list;
    }
    public void get_symbol(String[] a){
        for(int i=0;i<3;i++){
            a[i]=symbol[i];
        }
    }
    public int get_turn(){
        return turn;
    }
    //TODO: Input to gameInterface
    public boolean move(int player_num, int x, int y) {
        System.out.println(x);
        System.out.println(y);
        System.out.println(board[x-1][y-1]);
        board[x-1][y-1] = player_num;
        board_list.set((x-1)*boardSize+(y-1), player_num);
        draw();
        if(win_check(player_num)){
            return true;
        }
        if(turn==1){
            turn = 2;
        }else{
            turn = 1;
        }
        return false;
    }
    public int register_player(){
        players++;
        return players;
    }

    public String sayHello(){
        String s = "Hello!";
        return s;
    }
}
