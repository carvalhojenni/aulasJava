package exemplo03;

public class Estudante extends Pessoa{
    private int ra;

    public Estudante(String nome, int ra) {
        super(nome); //se refere ao construtor de pessoa
        this.ra = ra;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    //polimorfismo
    @Override //sobrescrita de método
    public void apresentar(){
        System.out.println("Boa noite!");
    }
}
