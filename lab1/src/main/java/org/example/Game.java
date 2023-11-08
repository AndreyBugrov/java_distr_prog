package org.example;

public class Game implements GameInterface{
    int boardSize = 19;
    int players = 0;
    int turn = 1;
    public boolean win_for_row(){return false;}
    public boolean win_for_column(){return false;}
    public boolean win_for_diag(){return false;}

    public boolean win_check(){
        return win_for_column() || win_for_row() || win_for_diag();
    }
    public void first_move(){}
    public void move(){}
}
