package org.example;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
public class Client {
    public static final String GAME_NAME = "Connect6";
    public static void main(String[] argc){
        String host =  (argc.length<1)? null : argc[0];
        int port = 8080;
        try {
            Registry registry = LocateRegistry.getRegistry(host, port);
            GameInterface gameInterface = (GameInterface) registry.lookup(GAME_NAME);
            System.out.println("registry: "+host+":"+port);
            int player_num = 0;
            do{
j2m
            }while(player_num != 2);
        }catch(Exception e){
            System.err.println("RMIClient exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
