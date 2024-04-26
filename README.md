# README

## Overview

Este repositório contém dois microserviços desenvolvidos em Kotlin e Java, respectivamente, para gerenciar a criação e validação de usuários, bem como realizar transferências entre eles. O microserviço em Kotlin é responsável por criar usuários, validar suas informações e facilitar a transferência de fundos entre eles. Enquanto isso, o microserviço em Java recebe payloads de usuários por meio de uma fila no RabbitMQ e processa essas informações.

## Arquitetura

A arquitetura geral do sistema é composta por dois microserviços que se comunicam por meio de uma fila no RabbitMQ:

1. **Serviço em Kotlin**: Este serviço é responsável por criar usuários, validar suas informações e realizar transferências entre eles. Ele utiliza o PostgreSQL como banco de dados para armazenar os usuários criados.

2. **Serviço em Java**: Recebe payloads de usuários por meio de uma fila no RabbitMQ e os processa. Este serviço utiliza o MongoDB como banco de dados para armazenar os usuários recebidos.

## Tecnologias Utilizadas

- **Kotlin**: Linguagem de programação moderna e concisa, utilizada no desenvolvimento do microserviço responsável pela criação de usuários e transferências.
- **Java**: Utilizado para o desenvolvimento do microserviço responsável por processar os payloads de usuários.
- **RabbitMQ**: Sistema de mensagens que permite a comunicação assíncrona entre os microserviços.
- **PostgreSQL**: Banco de dados relacional utilizado para armazenar os usuários criados pelo serviço em Kotlin.
- **MongoDB**: Banco de dados NoSQL utilizado para armazenar os usuários processados pelo serviço em Java.
- **Docker Compose**: Utilizado para facilitar a execução de todos os serviços necessários em contêineres Docker.

## Pré-requisitos

- Docker
- Docker Compose

## Como Usar

1. Clone este repositório:

   ```
   git clone https://github.com/seu-usuario/seu-repositorio.git
   ```

2. Navegue até o diretório clonado:

   ```
   cd seu-repositorio
   ```

3. Inicie os serviços usando o Docker Compose:

   ```
   docker-compose up
   ```

Isso iniciará todos os serviços necessários (Kotlin, Java, PostgreSQL, MongoDB e RabbitMQ) em contêineres Docker.

## Configuração Adicional

Caso seja necessário configurar variáveis de ambiente adicionais ou ajustar outras configurações, você pode modificar o arquivo `docker-compose.yml` conforme necessário.

## Uso

Após iniciar os serviços usando o Docker Compose, você pode interagir com eles da mesma forma descrita na seção "Uso" do README original.

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir problemas (issues) ou enviar pull requests com melhorias, correções de bugs ou novos recursos.

## Licença

Este projeto está licenciado sob a [MIT License](LICENSE).
