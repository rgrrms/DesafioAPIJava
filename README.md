# DESAFIO

Uma API Rest desenvolvida com JAVA Spring fazendo a persistência dos dados em um banco MongoDB,
com o auxilio da dependência Spring Boot Starter Data Mongodb

Para criação da API foi utilizado como JVM o JAVA na versão 11.0.5

### Configuração

Para executar a API deve colocar uma URI de acesso ao banco MongoDB no arquivo aplication.properties

Sugiro a utilização do Insominia ou Postman para teste dos EndPoints e de uma IDE como o IntelliJ para facilitar a instalação das dependências 
e execução do programa, porém isso pode ser feito com os comando a seguir para:

Instalar o Gradle

`sudo apt  install gradle` 

### Getting Started

Rodar a aplicação com o Gradle

`gradle run`

Desa forma a aplicação ira subir na porta 8080, podendo ser acessada no link:

`http://localhost:8080/`


### EndPoints

#### GET 
Lista todos os Livros `http://localhost:8080/books`
#### PUT
Faz a reserva `http://localhost:8080/books/{id_book}/reserve`
```
{
	"name": "Uma breve história do tempo",
	"status": "emprestado",
	"client": {
		"id": "<id_client>"
	}
}
```
#### POST
Cadastra um livro `http://localhost:8080/books`
```
{
	"name": "A Arte da Guerra",
	"status": "disponivel"
}
```
#### POST
Cadastra um cliente `http://localhost:8080/client`
```
{
    "name": "Roger"
}
```
#### GET
Retorna os emprestados `http://localhost:8080/client/{id_client}/books`
