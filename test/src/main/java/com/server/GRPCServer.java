package com.server;

import java.io.IOException;

import com.user.UserService;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class GRPCServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        //Criando nosso server chamando o server builder e
        // setando uma porta para o servidor e 
        // adicionando o serviço que esse servidor vai iniciar
        Server server = ServerBuilder.
                    forPort(9090).
                    addService(new UserService()).
                    build();  

        //Dando start no servidor (essa parte pede para lançar uma exeção)
        server.start();
        System.out.println("Server started at " + server.getPort());
        
        //isso Waits for the server to become terminated
        server.awaitTermination();
    }


}
