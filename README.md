# 📘 GitHub User Lookup
This project is a simple Java application that allows you to query information about a GitHub user using GitHub's public API. The returned data is displayed in the console in an organized format, using the Gson library to deserialize the JSON.

## 🚀 Technologies Used
Java 11+

Java HTTP Client (Java 11)

Gson library for JSON handling

GitHub REST API


## 📦 Dependencies
To work properly, you need to add the Gson library to your project.
If you're using Maven, add this to your pom.xml:



## 🧪  How to Use
Compile the project:
javac -cp ".;path/to/gson.jar" br/com/principal/Main.java

Run the application:
java -cp ".;path/to/gson.jar" br.com.principal.Main

Choose option 1 to query a GitHub user

Enter the username

View the user's information in the console


## Example
===== MENU GITHUB USER =====
1. Consultar usuário do GitHub

0. Sair


Escolha uma opção: 1

Digite o nome do seu usuário no GitHub: noronhagabriel

UsuarioGitHub {login= noronhagabriel, id=187660846, ...}

