package exemplo01;

public class AppPessoa {
    public static void main(String[] args) { //método principal
        //instancia um novo objeto do tipo pessoa
        Pessoa p =  new Pessoa("Emerson");
        
        System.out.println("O nome da pessoa é " +  p.getNome());

        // p.nome = "Emerson"; não pode ser feito pois é private
        p.apresentar();
        
    }
}
