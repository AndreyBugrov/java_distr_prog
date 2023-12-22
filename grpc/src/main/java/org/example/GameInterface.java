package org.example;

import java.util.ArrayList;

public interface GameInterface {
    public boolean win_for_row(int player_num);
    public boolean win_for_column(int player_num);
    public boolean win_for_main_diags() ;
    public boolean win_for_not_main_diags() ;
    public boolean win_check(int player_num) ;
    public void first_move();
    public boolean move(int player_num, int x, int y);
    public int register_player();

    public int get_turn();
    public ArrayList<Integer> get_board();

    public String sayHello();
}
