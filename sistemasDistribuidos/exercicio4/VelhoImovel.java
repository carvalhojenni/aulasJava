public class VelhoImovel extends Imovel {
    private double desconto;
    
    public VelhoImovel(String endereco, double preco, double desconto) {
        super(endereco, preco);
        this.desconto = desconto;
    }
    
    public double getDesconto() {
        return desconto;
    }
    
    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    
    public void imprimirValorDesconto() {
        System.out.println("Valor do desconto: " + desconto);
    }
}