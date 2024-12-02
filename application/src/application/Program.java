package application;

import model.entities.Client;

public class Program {
    public static void main(String[] args) {

        Client c1 = new Client("Maria", "maria@gmail.com");
        //Client c2 = new Client("Alex", "alex@gmail.com");
        Client c2 = new Client("Maria", "maria@gmail.com");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
        System.out.println(c1 == c2); // false pois as posições de memória são diferentes (referências)

        String s1 = "Test";
        String s2 = "Test";

        System.out.println(s1 == s2); // true pois as posições de memória são iguais (referências), houve um tratamento especial para strings

        String s3 = new String("Test");
        String s4 = new String("Test");

        System.out.println(s3 == s4); // false pois as posições de memória são diferentes (referências)
    }
}