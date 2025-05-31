*.java text eol=crlf
package br.com.principal;

import br.com.modelos.TituloOmdb;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scan = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===== MENU GITHUB USER =====");
            System.out.println("1. Consultar usuário do GitHub");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do seu usuário no GitHub: ");
                    String usuario = scan.nextLine();
                    String endereco = "https://api.github.com/users/" + usuario;

                    HttpClient cliente = HttpClient.newHttpClient();
                    HttpRequest request = HttpRequest.newBuilder()
                            .uri(URI.create(endereco))
                            .build();

                    HttpResponse<String> response = cliente
                            .send(request, HttpResponse.BodyHandlers.ofString());

                    String json = response.body();

                    Gson gson = new Gson();
                    TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
                    System.out.println(meuTituloOmdb);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scan.close();
    }
}