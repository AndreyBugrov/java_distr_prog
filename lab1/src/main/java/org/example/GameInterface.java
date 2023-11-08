package org.example;

public interface GameInterface {
    public boolean win_for_row();
    public boolean win_for_column();
    public boolean win_for_diag();

    public boolean win_check();
    public void first_move();
    public void move();
}
