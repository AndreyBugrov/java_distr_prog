package org.example;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface GameInterface extends Remote {
    public boolean win_for_row(int player_num)throws RemoteException;
    public boolean win_for_column()throws RemoteException;
    public boolean win_for_main_diags()throws RemoteException;
    public boolean win_for_not_main_diags()throws RemoteException;
    public boolean win_check(int player_num)throws RemoteException;
    public void first_move() throws RemoteException;
    public void draw() throws RemoteException;
    public boolean move(int player_num, int x, int y) throws  RemoteException;
    public int register_player() throws RemoteException;

    public void get_symbol(String[] a) throws RemoteException;
    public int get_turn() throws RemoteException;
    public ArrayList<Integer> get_board(int[][] a) throws RemoteException;

    public String sayHello() throws RemoteException;
}
