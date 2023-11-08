package org.example;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Based extends Remote{
    String sayBased() throws RemoteException;
}
