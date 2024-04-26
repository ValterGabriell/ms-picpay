# Desafio PicPay Backend - API de Transferências

## 💻 | Projeto: Desenvolvendo uma API de Transferências baseada no Desafio do PicPay.

Seja bem-vindo! Este projeto é uma implementação da API de Transferências proposta pelo desafio do PicPay voltado para estudos. O objetivo é criar uma solução para transferência de dinheiro entre usuários, seguindo as especificações detalhadas no [repositório oficial do desafio](https://github.com/PicPay/picpay-desafio-backend).

## ⚙ | Tecnologias Utilizadas

- **Spring Boot**: Utilizado como framework principal para desenvolvimento da aplicação, facilitando a criação de APIs REST.
- **Kotlin**: Linguagem de programação escolhida devido à sua concisão, expressividade e interoperabilidade com o Java.
- **Arquitetura Hexagonal**: O projeto segue os princípios da arquitetura hexagonal, separando claramente as camadas de domínio, aplicação e infraestrutura, o que facilita a manutenção e escalabilidade do sistema.
- **Desenvolvimento Orientado a Testes (TDD)**: O desenvolvimento está sendo conduzido seguindo a prática do TDD, garantindo a qualidade e a robustez do código por meio de testes automatizados.
- **Banco de Dados**: Utilizaremos SQL Server para persistência de dados, conforme o desafio do PicPay.

## 🚀 | Funcionalidades Implementadas

- [x] Cadastro de usuários
- [x] Consulta de saldo
- [x] Transferência entre usuários

## ▶️ | Como Executar o Projeto

1. Certifique-se de ter o JDK e o Maven instalados em sua máquina.
2. Clone este repositório em sua máquina local.
3. Navegue até o diretório do projeto e execute o seguinte comando:

```bash
./mvnw spring-boot:run
```

Isso iniciará a aplicação Spring Boot. Você pode acessar a API através de `http://localhost:8080`.

## 📝 | Utilizando a API

Para utilizar a API, você pode:

- Acessar a documentação da API com o Swagger em [localhost com Swagger](https://localhost:8080/swagger/index.html)
- Utilizar ferramentas como Postman ou Insomnia.
