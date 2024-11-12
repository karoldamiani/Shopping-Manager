//Atributos da classe
public class Bijuteria extends Loja {
    private double metaVendas;


    // Construtor que recebe todos os atributos de Loja e metaVendas
    public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double metaVendas, int maxProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, maxProdutos);
        this.metaVendas = metaVendas;
    }

    // Getter e setter para metaVendas
    public double getMetaVendas() { 
        return metaVendas; 
    }
    
    public void setMetaVendas(double metaVendas) { 
        this.metaVendas = metaVendas; 
    }

    // Método toString
    @Override
    public String toString() {
        return super.toString() + "\nMeta de Vendas: " + metaVendas;
    }
}