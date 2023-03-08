package exemplo03;

public class Pessoa {
    private String nome;

    //polimorfismo
    //sobrecarga
    //construtor default
    public Pessoa() {
        nome = "";
    }
    
    public Pessoa(String nome) {
        this.nome = nome;
    }


    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void apresentar(){
        System.out.println("Olá!");
    }
}
