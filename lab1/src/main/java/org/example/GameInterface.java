package org.example;

public interface GameInterface {
    public boolean win_for_row();
    public boolean win_for_column();
    public boolean win_for_main_diags();
    public boolean win_for_not_main_diags();

    public boolean win_check();
    public void first_move();
    //public void move(int x_1, int y_1, int x_2, int y_2);
}
