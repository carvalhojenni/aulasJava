public class NovoImovel extends Imovel {
    private double adicional;
    
    public NovoImovel(String endereco, double preco, double adicional) {
        super(endereco, preco);
        this.adicional = adicional;
    }
    
    public double getAdicional() {
        return adicional;
    }
    
    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }
    
    public void imprimirValorAdicional() {
        System.out.println("Valor adicional: " + adicional);
    }
}
