# 📘 Consulta de Usuário GitHub 
Este projeto é uma aplicação simples em Java que permite consultar informações de um usuário do GitHub utilizando a API pública do GitHub. Os dados retornados são exibidos no console em formato organizado, utilizando a biblioteca Gson para desserialização do JSON.

## 🚀 Tecnologias Utilizadas
Java 11+

API HTTP Client (Java 11)

Biblioteca Gson para manipulação de JSON

API REST do GitHub

## 📦 Dependências
Para funcionar corretamente, você precisa adicionar a biblioteca Gson ao seu projeto. Se estiver usando Maven, adicione ao pom.xml:

## 🧪 Como Usar
Compile o projeto:
javac -cp ".;path/to/gson.jar" br/com/principal/Main.java

Execute a aplicação:
java -cp ".;path/to/gson.jar" br.com.principal.Main

Escolha a opção 1 para consultar um usuário do GitHub.

Digite o nome do usuário.

Veja as informações no console!

## 📋 Exemplo de Uso
===== MENU GITHUB USER =====
1. Consultar usuário do GitHub

0. Sair
Escolha uma opção: 1
Digite o nome do seu usuário no GitHub: noronhagabriel

UsuarioGitHub {login= noronhagabriel, id=187660846, ...}

