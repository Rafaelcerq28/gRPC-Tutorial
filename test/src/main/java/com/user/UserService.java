package com.user;

import com.test.User.APIResponse;
import com.test.User.Empty;
import com.test.User.LoginRequest;
import com.test.userGrpc.userImplBase;

import io.grpc.stub.StreamObserver;
//extender a class userImplBase (classe gerada dentro do "userGrpc" criado pelo proto)
public class UserService extends userImplBase{

    //ctrl + ponto -> Override/implement methods.. 
    // selecionar os metodos criados no proto (login e logout no caso)
    @Override
    public void login(LoginRequest request, StreamObserver<APIResponse> responseObserver) {
        System.out.println("inside login (test message para saber onde estou)");
        
        //não precisa criar o get e o set, isso é criado a partir do proto (ja ta tudo no LoginRequest)
        //e esse request traz os dados passados para o servidor
        //são os mesmos passados em "message LoginRequest" no proto file
        String username = request.getUsername();
        String password = request.getPassword();

        //é necessário construir um builder para gerar as responses
        APIResponse.Builder response = APIResponse.newBuilder();

        //Depois de pegar os dados do request podemos trabalhar na logica de negocio
        //nesse caso é apenas validar o login do usuario
        if(username.equals(password)){
            //novamente, o response são as mesmas variaveis criadas no proto
            //em message APIResponse
            response.setResponseCode(0).setResponsemessage("SUCCESS");
        }else{
            response.setResponseCode(100).setResponsemessage("INVALID PASSWORD");
        }

        //aqui enviamos a mensagem de volta para o cliente
        responseObserver.onNext(response.build());
        //fecha a chamada
        responseObserver.onCompleted();
    }

    @Override
    public void logout(Empty request, StreamObserver<APIResponse> responseObserver) {
        //crio um builder para gerar as responses
        APIResponse.Builder response = APIResponse.newBuilder();
        //gero a mensagem para a response
        response.setResponseCode(0).setResponsemessage("USER LOGGED OUT");
        
        //envio a mensagem para o cliente
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    

}
