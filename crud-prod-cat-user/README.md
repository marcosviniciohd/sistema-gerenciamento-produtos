# Sistema Gerenciamento Produtos, Categorias, Usuários e Permissões para Usuários.

#### Requisitos:
- [x] RF1 - O sistema deve permitir o cadastro de produtos.
- [x] RF2 - O sistema deve permitir o cadastro de categorias.
- [x] RF3 - O sistema deve permitir o cadastro de usuários.
- [x] RF4 - O sistema deve permitir o cadastro de permissões para usuários.
- [x] RF5 - Apenas usuários com permissão de administrador podem cadastrar novos usuários.
- [x] RF6 - Apenas usuários com permissão de administrador podem cadastrar novas permissões.
- [x] RF7 - Apenas usuários com permissão de administrador e operador podem cadastrar novas categorias e inserir novos produtos.
- [x] RF8 - Apenas usuários com permissão de administrador e operador podem alterar categorias e produtos.
- [x] RF9 - Apenas usuários com permissão de administrador e operador podem excluir categorias e produtos.
- [x] RF10 - O sistema deve permitir a associação de produtos a categorias.
- [x] RF11 - O sistema deve permitir a associação de usuários a permissões.

#### Tecnologias utilizadas:
- [x] Java 17
- [x] Spring Boot 2.4.4
- [x] Spring Data JPA
- [x] Spring Security
- [x] Spring Validation
- [x] Spring Actuator
- [x] Spring DevTools
- [x] Aouth2
- [x] Spring Web
- [x] H2 Database (Testes)
- [x] Maven
- [x] Swagger 2
- [x] Postman

#### 1. Descrição da Web API
###### Web API *crud-prod-cat-user* tem como objetivo de fornecer endpoints para expor dados dos produtos cadastrados, categorias e usuários.
#### 2. Descrição dos endpoints
###### Os endpoints são divididos em 3 grupos:
###### 2.1. Produtos
###### 2.2. Categorias
###### 2.3. Usuários

#### 3. Swagger
###### A documentação da API foi feita utilizando o Swagger 2.0. Para acessar a documentação, basta executar o projeto e acessar o endereço: http://localhost:8080/swagger-ui.html

#### 4. Postman
###### As requisições da API foram testadas utilizando o Postman. Para acessar a collection, basta importar o arquivo *crud-prod-cat-user.postman_collection.json* no Postman.

