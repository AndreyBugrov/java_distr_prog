package org.example;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) {
        String host = (args.length<1)? null : args[0]; // Если null, то ищем сервис имён на локальной машине.
        int port = 8080;
        try{
            Registry registry = LocateRegistry.getRegistry(host, port); // Подключаемся к уже существующему сервису имён. Новый не запускаем.
            System.out.println("registry: "+host+":"+port);
            GameInterface stub = (GameInterface) registry.lookup("HelloServer"); // ищем объект - клиентское прокси
            System.out.println(stub); // печать клиентского прокси
            String response = stub.sayHello();
            System.out.println("response: "+ response);
            System.out.println(stub.register_player());
            Thread.sleep(5000);
        }catch(Exception e){
            System.err.println("RMIClient exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
