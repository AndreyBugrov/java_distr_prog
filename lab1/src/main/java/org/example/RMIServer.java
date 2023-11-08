package org.example;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;

public class RMIServer extends UnicastRemoteObject implements Based {
    public RMIServer() throws RemoteException{
        super();
    }
    public static void main(String[] args) {
        try{
            RMIServer obj = new RMIServer(); // то же самое
            Registry registry = LocateRegistry.createRegistry(8080);// То же самое
            registry.bind("HelloServer", obj);
            System.out.println("RMIServer ready");
        }catch(Exception e){
            System.err.println("RMIServer exception: " + e.toString());
            e.printStackTrace();
        }
    }

    @Override
    public String sayBased() throws RemoteException {
        return "Based";
    }
}