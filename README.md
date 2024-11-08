# CRUD Pessoa API

Este projeto apresenta uma API simples para o registro e manipulação de informações de uma pessoa. Desenvolvida em Java 17 utilizando o framework Spring Boot, com o gerenciamento de dependências via Maven. O objetivo da aplicação é realizar operações CRUD (Criar, Ler, Atualizar, Deletar) sobre dados de pessoas em um banco de dados.

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot**
- **Maven**
- **Swagger** (para documentação da API)
- **Banco de Dados Relacional** (H2 DATABASE em produção, MySQL disponibilizado docker)

## Funcionalidades

A API oferece os seguintes endpoints:

### 1. Criar uma pessoa
- **Endpoint**: `POST /pessoa`
- **Descrição**: Cria uma nova pessoa no banco de dados.
- **Requisição**: 
  ```json
  {
    "nome": "Alan Turing",
    "email": "Alan@email.com",
    "dataDeNascimento": "23-06-1912"
  }

### 2. Buscar pessoa por ID
- **Endpoint**: `GET /pessoa/{ID}`
- **Descrição**: Retorna uma pessoa pelo ID fornecido.
- Resposta de sucesso:
  ```json
  {
  "id": "UUID-DO-BANCO-DE-DADOS",
  "nome": "Alan Turing",
  "email": "Alan@email.com",
  "dataDeNascimento": "1912-06-23"
  }
  ```
### 3. Atualizar pessoa
- **Endpoint**: `PUT /pessoa/{ID}`
- **Descrição**: Retorna uma pessoa após feita suas alterações.
- Resposta de sucesso:
  ```json
  {
  "nome": "Von Neumann",
  "email": "novoemail@dominio.com",
  "dataDeNascimento": "28-12-1903"
  }
  ```
### 4. Deletar pessoa
- **Endpoint**: `DELETE /pessoa/{ID}`
- **Descrição**: Deleta uma pessoa do banco de dados, identificada pelo seu ID.

### 5. Todas pessoas
- **Endpoint**: `GET /pessoas`
- **Descrição**: Retorna todas as pessoas do banco de dados.

## Instruções para Execução
### Pré-requisitos
- JDK 17 ou superior
- Maven
- IDE de sua escolha compatível com Java (exemplos, Intellij, Eclipse)
- MySQL Server
- Docker Desktop

## Execução via docker
- Acessando o [GitHub do projeto](https://github.com/Herick2D/crudPessoaApi.git), faça o clone do mesmo;
- Abra o projeto em um terminal;
- Digite o comando docker-compose up;
  
 _Obs: Em casos de sistema operacional Windows garanta que você tenha o Docker desktop instalado em sua máquina._

## Execução via IDE
- Acessando o [GitHub do projeto](https://github.com/Herick2D/crudPessoaApi.git), faça o clone do mesmo;
- Abra o projeto com a IDE de sua preferencia;
- Execute o programa

_Obs: Garanta que o server mysql esteja devidamente configurado em seu computador e altere as informações no arquivo application.properties_

## Swagger UI
A documentação interativa da API está disponível através do [Swagger](http://localhost:8080/swagger-ui/index.html), na qual pode ser acessada enquanto a aplicação estiver sendo executada.

## Observações
Esta aplicação foi desenvolvida em um ambiente com prazos estipulados, o que pode ter limitado o tempo para ajustes detalhados e testes extensivos. Portanto, é possível que ocorram bugs ou comportamentos inesperados em alguns cenários. Recomenda-se realizar testes adicionais conforme o ambiente de produção ou uso em grande escala.
