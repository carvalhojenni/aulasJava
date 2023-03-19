public class VendaImoveis {
    public static void main(String[] args) {
        Imovel imovel = new Imovel("Rua 1, 71", 100000.0);
        NovoImovel novoImovel = new NovoImovel("Rua 2, 410", 200000.0, 5000.0);
        VelhoImovel velhoImovel = new VelhoImovel("Rua 3, 720", 30000.0, 10000.0);

        System.out.println("Imovel");
        System.out.println("Endereco: " + imovel.getEndereco());
        System.out.println("Preco: " + imovel.getPreco());
        System.out.println("-------------------------------------------------");
        
        System.out.println("Novo Imovel");
        System.out.println("Endereco: " + novoImovel.getEndereco());
        System.out.println("Preco: " + novoImovel.getPreco());
        novoImovel.imprimirValorAdicional();
        System.out.println("-------------------------------------------------");
        
        System.out.println("Velho Imovel");
        System.out.println("Endereco: " + velhoImovel.getEndereco());
        System.out.println("Preco: " + velhoImovel.getPreco());
        velhoImovel.imprimirValorDesconto();
    }
}