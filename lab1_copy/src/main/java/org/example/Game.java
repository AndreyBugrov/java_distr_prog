package org.example;

import java.rmi.RemoteException;

public class Game implements GameInterface {
    final int boardSize = 19;
    final int win_num = 6;
    int players = 0;
    int turn = 1;
    int[][] board = new int[boardSize][boardSize];
    final static String[] symbol={"X","0"};

    public boolean win_for_row() {
        int counter = 0;
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
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

    public boolean win_for_column() {
        int counter = 0;
        for (int j = 0; j < boardSize; j++) {
            for (int i = 0; i < boardSize; i++) {
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

    public boolean win_check() {
        return win_for_column() || win_for_row() || win_for_main_diags() || win_for_not_main_diags();
    }

    public void first_move() throws RemoteException {
        int middle = boardSize / 2;
        board[middle][middle] = 1;
    }
    //TODO: Implement draw function
    //TODO: Make drawing for both clients after any change;
    public void draw(){

    }

    //TODO: Input to gameInterface
    public void move(int player_num, int x, int y) {
        board[x-1][y-1] = player_num;
        draw();

    }

//    public void process() {
//        try {
//            first_move();
//        }catch (Exception e){
//
//        }
//        while (win_check()) {
//            move();
//            turn++;
//            turn %= 2;
//        }
//    }
    public int register_player(){
        players++;
        return players-1;
    }

    public String sayHello(){
        String s = "Hello!";
        return s;
    }
}
