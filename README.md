# gRPC-Tutorial

#### logica do rolê:

1. criar o POM na raiz do projeto
2. [Criar o proto.file](https://github.com/Rafaelcerq28/gRPC-Tutorial/blob/main/test/src/main/resources/user.proto) __(modelo de proto)__ 
3. rodar o mavem para gerar as classes __(stubs)__
4. [Criar o service](https://github.com/Rafaelcerq28/gRPC-Tutorial/blob/main/test/src/main/java/com/user/UserService.java) __(modelo de service)__
5. [Criar o servidor](https://github.com/Rafaelcerq28/gRPC-Tutorial/blob/main/test/src/main/java/com/server/GRPCServer.java) __(modelo de servidor)__ 
6. [Criar o client](https://github.com/Rafaelcerq28/gRPC-Tutorial/blob/main/test/src/main/java/com/client/GRPCClient.java) __(modelo de client)__  

#### para testar:

1. inicializar o __servidor__
2. rodar a classe __client__

---

# gRPC-Tutorial - (English version)

#### Workflow:

1. Create the POM file in the root of the project.
2. [Create the proto file](https://github.com/Rafaelcerq28/gRPC-Tutorial/blob/main/test/src/main/resources/user.proto) __(proto model)__
3. Run Maven to generate the classes __(stubs)__
4. [Create the service](https://github.com/Rafaelcerq28/gRPC-Tutorial/blob/main/test/src/main/java/com/user/UserService.java) __(service model)__
5. [Create the server](https://github.com/Rafaelcerq28/gRPC-Tutorial/blob/main/test/src/main/java/com/server/GRPCServer.java) __(server model)__
6. [Create the client](https://github.com/Rafaelcerq28/gRPC-Tutorial/blob/main/test/src/main/java/com/client/GRPCClient.java) __(client model)__

#### To test:

1. Start the __server__
2. Run the __client__ class
