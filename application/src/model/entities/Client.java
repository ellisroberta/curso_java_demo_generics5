package model.entities;

import java.util.Objects;

public class Client {
    private String name;
    private String email;

    public Client(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Primeira implementação do método equals.
     * Aqui, a verificação é feita usando o operador instanceof com pattern matching (disponível a partir do Java 16).
     * Isso permite que você verifique se 'o' é uma instância de Client e, ao mesmo tempo, declare e inicialize a variável 'client'.
     * O uso do instanceof já lida com null, pois 'null instanceof Client' retorna false.
     * O instanceof é uma maneira segura de verificar a instância de um objeto em comparação à comparação de classes, pois lida com null corretamente.
     * Essa abordagem permite que subclasses de Client sejam consideradas, caso um objeto de uma subclasse seja passado como parâmetro.
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Client client)) return false;
        return Objects.equals(name, client.name) && Objects.equals(email, client.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email);
    }

    /**
     * Segunda implementação do método equals.
     * Nesta abordagem, a implementação primeiro verifica se 'o' é null ou se a classe de 'o' não é a mesma que a classe atual (Client).
     * Se a verificação passar, 'o' é convertido para Client através de um cast.
     * A comparação é feita verificando se os atributos name e email são iguais entre o objeto atual e o objeto passado como parâmetro.
     * Trata null explicitamente, retornando false se 'o' for null, o que é uma abordagem mais explícita.
     * A comparação é feita apenas com objetos da mesma classe, não considerando subclasses de Client.
     * A comparação é estrita (getClass() != o.getClass()), o que significa que não permitirá que instâncias de subclasses sejam
     * consideradas iguais a uma instância de Client. Essa abordagem é mais restritiva.
     */
//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        Client client = (Client) o;
//        return Objects.equals(name, client.name) && Objects.equals(email, client.email);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, email);
//    }
}