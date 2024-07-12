package com.client;

//import com.google.protobuf.Empty;
import com.test.userGrpc;
import com.test.User.APIResponse;
import com.test.User.LoginRequest;
import com.test.User.Empty;
import com.test.userGrpc.userBlockingStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GRPCClient {
    public static void main(String[] args) {
        //criar um channel, especificar o ip e a porta e usar plainText
        ManagedChannel channel = ManagedChannelBuilder.
                                forAddress("localhost", 9090).
                                usePlaintext().
                                build();

        //usar os stubs gerados a partir dos proto files
        //nesse caso usamos o blockingStub que Creates a new blocking-style stub 
        // that supports unary and streaming output calls on the service
        userBlockingStub userStub = userGrpc.newBlockingStub(channel);          
        
        //chamar a message que faz o login request e passar os parametros contidos na message
        LoginRequest loginRequest = LoginRequest.newBuilder().
                                setUsername("rafael").
                                setPassword("rafael").
                                build();
        //fazendo o request no nossoservidor chamando a api login 
        //na nossa service e armazena em uma response
        APIResponse response = userStub.login(loginRequest);
        System.out.println(response.getResponsemessage());
        
        //testando o metodo logout
        //como o metodo logout não recebe nenhum parametro eu não preciso criar essa linha abaixo
        //Empty logouEmpty = Empty.newBuilder().build();

        //armazeno a resposta do servidor quando faço o logout e imprimo
        response = userStub.logout(null);
        System.out.println(response.getResponsemessage());

    }
}
