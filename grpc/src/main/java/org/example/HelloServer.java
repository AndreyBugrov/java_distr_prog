package org.example;
import grpc.connect6.*;
import io.grpc.ServerBuilder;

import java.io.IOException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

public class HelloServer extends Connect6Grpc.Connect6ImplBase{
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

    public static final int boardSize = 11;
    final int win_num = 3;
    int players = 0;
    int turn = 0;
    public static ArrayList<Integer> board_list = new ArrayList<>();
    public final static String[] symbol={"-","X","0"};
    public static void main(String[] args) {

        io.grpc.Server server = ServerBuilder.forPort(3000).addService(new HelloServer()).build();
        try{
            server.start();
            System.out.println("Cool lab");
            server.awaitTermination();
        }
        catch (IOException e){
            System.out.println(e);
        }
        catch (InterruptedException e){
            System.out.println(e);
        }

    }
    public boolean win_for_row(int player_num) {
        int counter = 0;
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                if (board_list.get(i*boardSize+j) == 1) {
                    counter++;
                    if (counter == win_num) {
                        return true;
                    }
                } else {
                    counter = 0;
                }
            }
        }
        return false;
    }
    public boolean win_for_column(int player_num) {
        int counter = 0;
        for (int j = 0; j < boardSize; j++) {
            for (int i = 0; i < boardSize; i++) {
                if (board_list.get(i*boardSize+j) == 1) {
                    counter++;
                    if (counter == win_num) {
                        return true;
                    }
                } else {
                    counter = 0;
                }
            }
        }
        return false;
    }
    boolean private_win_check(int player_num){
        return win_for_row(player_num) || win_for_column(player_num);
    }

    @Override
    public void move(grpc.connect6.MoveInput request,
                     io.grpc.stub.StreamObserver<grpc.connect6.WinStatus> responseObserver){
        int player_num = request.getPlayerNum();
        int x = request.getX();
        int y = request.getY();
        board_list.set((x-1)*boardSize+(y-1), player_num);
        if(private_win_check(player_num)){
            WinStatus winStatus = WinStatus.newBuilder().setStatus(true).build();
            responseObserver.onNext(winStatus);
            responseObserver.onCompleted();
        }
        if(turn==1){
            turn = 2;
        }else{
            turn = 1;
        }
        WinStatus winStatus = WinStatus.newBuilder().setStatus(false).build();
        responseObserver.onNext(winStatus);
        responseObserver.onCompleted();
    }
    @Override
    public void getBoard(com.google.protobuf.Empty request,
                    io.grpc.stub.StreamObserver<grpc.connect6.Board> responseObserver){
        List<Integer> list = new ArrayList<>(board_list);
        Board board = Board.newBuilder().setBoard(boardSize*boardSize, 0).build();
    }
    @Override
    public void registerPlayer(com.google.protobuf.Empty request,
                               io.grpc.stub.StreamObserver<grpc.connect6.PlayerNum> responseObserver){
        players++;
        if(players==1){
            for(int i=0;i<boardSize;i++){
                for(int j=0;j<boardSize;j++){
                    board_list.add(0);
                }
            }
            int middle = boardSize / 2;
            board_list.set(middle*boardSize+middle, 1);
            System.out.println(middle*boardSize+middle);
            turn = 2;
        }
        PlayerNum playerNum = PlayerNum.newBuilder().setPlayerNum(players).build();
        responseObserver.onNext(playerNum);
        responseObserver.onCompleted();
    }
    @Override
    public void winCheck(grpc.connect6.PlayerNum request,
                         io.grpc.stub.StreamObserver<grpc.connect6.WinStatus> responseObserver){

    }
    @Override
    public void getTurn(com.google.protobuf.Empty request,
                        io.grpc.stub.StreamObserver<grpc.connect6.TurnNum> responseObserver){

    }
}