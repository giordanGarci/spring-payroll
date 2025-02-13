# Microsserviços Java com Spring Boot e Spring Cloud

## 🚀 Visão Geral do Sistema

O sistema é composto por diversos microsserviços que interagem entre si para fornecer funcionalidades específicas. Os principais componentes do sistema incluem:

- **Config Server:** Gerencia as configurações centralizadas.
- **Eureka Server:** Serviço de registro e descoberta de microsserviços.
- **Gateway (Zuul):** Responsável pelo roteamento e filtragem de requisições.
- **Microsserviços:** 
  - `worker-ms`: Gerencia os dados de trabalhadores.
  - `user-ms`: Gerencia os usuários.
  - `auth-ms`: Gerencia a autenticação e autorização.
  - `payroll-ms`: Realiza cálculos relacionados a pagamentos.

## 🛠️ Tecnologias Utilizadas

- **Java 11**
- **Spring Boot**
- **Spring Cloud**
- **JWT (JSON Web Token)**
- **H2 Database**
- **Docker**
- **Git/GitHub**

## 📐 Arquitetura

### Microsserviços

- **Desacoplados:** Cada microsserviço possui seu próprio banco de dados e governança.
- **Escalabilidade:** Projetado para escalar de forma independente.
- **Coesos:** Cada serviço é responsável por uma funcionalidade específica.
- **Design evolutivo:** Infraestrutura preparada para falhas e mudanças.

### Autenticação e Autorização

- **Authorization Server:** Gerencia o fluxo de autenticação, entrega de tokens JWT.
- **Resource Server:** Protege os endpoints de acordo com o token JWT.
- **Client App:** Cliente que consome os serviços.

## 📝 Pré-requisitos

Certifique-se de ter as seguintes ferramentas configuradas:

- **Java 17** (JDK configurado com `JAVA_HOME` e `PATH`)
- **Spring Tool Suite (STS)** ou outra IDE compatível.
- **Docker Desktop**
- Conhecimento básico de Spring Boot.

## 📦 Execução do Projeto

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/seu-repositorio.git

2. Configure o ambiente:
  - Certifique-se de ter o Docker rodando.
  - Ajuste as configurações no arquivo application.properties de cada serviço.
3. Suba os serviços:
   ```bash
    docker-compose up
