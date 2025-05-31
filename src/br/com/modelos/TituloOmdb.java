package br.com.modelos;

public class TituloOmdb {
    private String login;
    private long id;
    private String name;
    private int public_repos;
    private int followers;

    @Override
    public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(System.lineSeparator());
            sb.append("===== Dados do Usuário GitHub =====").append(System.lineSeparator());
            sb.append("Login:        ").append(login).append(System.lineSeparator());
            sb.append("ID:           ").append(id).append(System.lineSeparator());
            sb.append("Nome:         ").append(name).append(System.lineSeparator());
            sb.append("Repositórios: ").append(public_repos).append(System.lineSeparator());
            sb.append("Seguidores:   ").append(followers).append(System.lineSeparator());
            sb.append("===================================").append(System.lineSeparator());
            return sb.toString();
        }

}
