package exemplo01;


public class Pessoa {
    //atributos
   private String nome; //declara um atributo chamado nome do tipo texto

    //métodos = ação: bloco de comandos

    //método construtor: inicializar os dados do objeto
    public Pessoa(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome; //devolve o valor que esta armazenado no atributo 'nome'
    }

    //define uma ação chamada apresentar
    public void apresentar() {
        //exibe uma mensagem na tela
        System.out.println("Olá! eu sou " + nome);
    }
}