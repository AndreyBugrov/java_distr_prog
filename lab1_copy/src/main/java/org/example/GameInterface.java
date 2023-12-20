package org.example;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GameInterface extends Remote {
    public boolean win_for_row()throws RemoteException;
    public boolean win_for_column()throws RemoteException;
    public boolean win_for_main_diags()throws RemoteException;
    public boolean win_for_not_main_diags()throws RemoteException;
    public boolean win_check()throws RemoteException;
    public void first_move() throws RemoteException;
    public void draw() throws RemoteException;
    public void move(int player_num, int x, int y) throws  RemoteException;
    public int register_player() throws RemoteException;

    public String sayHello() throws RemoteException;
}
