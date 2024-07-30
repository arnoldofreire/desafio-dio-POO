# Desafio de Programação Orientada a Objetos (POO) com Java

## Descrição

Este repositório contém um projeto de Programação Orientada a Objetos (POO) em Java, com foco em desmistificar e praticar os conceitos fundamentais da POO: Abstração, Encapsulamento, Herança e Polimorfismo. O projeto simula um sistema bancário que permite a criação de contas, realização de transações e outras funcionalidades.

## Objetivos

- **Abstração:** Definir classes que representam conceitos do mundo real e suas interações.
- **Encapsulamento:** Proteger os dados das classes e fornecer métodos para acesso controlado.
- **Herança:** Reutilizar e estender comportamentos através de uma hierarquia de classes.
- **Polimorfismo:** Implementar interfaces e permitir que objetos de diferentes classes sejam tratados de forma uniforme.

## Estrutura do Projeto

- **src/main/java**
  - `Conta.java` - Classe abstrata representando uma conta bancária.
  - `ContaCorrente.java` - Subclasse de `Conta` com funcionalidades específicas.
  - `Cliente.java` - Classe representando um cliente do banco.
  - `Transacao.java` - Interface para operações de transações.
  - `Deposito.java` - Implementação de uma transação de depósito.
  - `Saque.java` - Implementação de uma transação de saque.
  - `Banco.java` - Classe principal para processar transações e gerenciar contas.
  
- **src/test/java**
  - `ContaCorrenteTest.java` - Testes unitários para a classe `ContaCorrente`.

## Requisitos

- **Java JDK 17.0.12** ou superior.
- **JUnit 5** para testes unitários.

## Como Executar

1. Clone este repositório:
   ```bash
   git clone https://github.com/arnoldfreire/poo-java-challenge.git
