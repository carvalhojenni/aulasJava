package exemplo03;

import java.util.ArrayList;

public class AppEstudante {
    public static void main(String[] args) {
        Pessoa p = new Estudante("rodrigo", 3333);
        Pessoa pessoas[] = new Pessoa[10];
        ArrayList<Pessoa> lista = new ArrayList<>();

        lista.add(new Estudante("pedro", 11111));
        lista.add(new Professor());

        pessoas[0] = new Estudante("aa", 2222);
        pessoas[1] = new Professor();
    }
}
