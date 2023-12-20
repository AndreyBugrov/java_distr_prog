package org.example;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server{
    public static void main(String[] args) {
        try{
            Game obj = new Game(); // создание экземпляра класса
            GameInterface stub = (GameInterface) UnicastRemoteObject.exportObject(obj, 0); // генерирует клиентское прокси типа Hello. Если порт = 0, то порт случайный. Обычно на предприятиях ставят конкретные адреса
            Registry registry = LocateRegistry.createRegistry(8080);// Подключаемся к создаваемому сервису имён (локальный)
            //Registry registry = LocateRegistry.getRegistry(8080) // Если бы существовал какой-то и был предоставлен
            registry.bind("HelloServer", stub); // по имени (строка) кладём клиентское прокси.
            System.out.println("Fine!");
        }catch(Exception e){
            System.err.println("RMIServer exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
