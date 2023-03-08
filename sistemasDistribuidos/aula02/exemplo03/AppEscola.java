package exemplo03;

import java.util.Scanner;

public class AppEscola {
    public static void main(String[] args) {
        Estudante e = new Estudante("Carlos ", 222);

        e.apresentar();
        // e.setNome("Arlindo");
        System.out.println("Estudante: " + e.getNome());
        e.setRa(1111);
        System.out.println("RA: " + e.getRa());

        Scanner entrada = new Scanner(System.in);
        String nomePessoa;

        System.out.println("nome da pessoa: ");

        nomePessoa = entrada.nextLine();

        Pessoa p = new Pessoa(nomePessoa);
        System.out.println("Pessoa: " + p.getNome());
        p.apresentar();

        Pessoa p2 = new Pessoa();
        System.out.println("Pessoa: " + p2.getNome());


        entrada.close();
    }
}
