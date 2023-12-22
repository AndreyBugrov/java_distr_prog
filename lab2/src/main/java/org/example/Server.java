package org.example;
import io.grpc.*;
import grpc.*;

public class Server {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
// Поддерживает большинство языков программирования
    // stub - генерируется, выглядит так же, как клиентское
    // прокси.
    /// То же, что в RMI.
    /// Protocol Buffers - по умолчанию. Использовать его
    /// Бинарный протокол -> меньше размер -> меньше времени
    /// Для написания protobuf файлов язык описания
    // интерфейсов - IDL
    /// IDL
    /// Есть кодогенерация, свои типы данных
    /// package grpc;
    /// syntax = "proto3";

//    package grpc;
//    option java_multiple_files = true;
//    option java_package = "grpc";
//    option java_outer_classname = "EchoServiceProto"; // Класс,
//    // который содержит описание структуры (методов) и типов
//    // данных
//    message EchoRequest{
//        string message = 1; // Поле сообщения и его порядковый
//    // номер (уникален)
//    }
//    message EchoResponse{
//        string message = 1; // Поле сообщения и его порядковый
//        // номер (уникален)
//    }
//    service EchoService{
//        rpc echo(EchoRequest) returns (EchoResponse){}
//    }
//    io.grpc.ManagedChannelBuilder:
//    forAddress(host, port);
//    build() // заканчивает построение соединения
//    // Запуск сервера
//    io.grpc.Server
//    start() // launch server
//    awaitTermination(); // подвесить поток, чтобы main не завершился
//    io.grpc
}