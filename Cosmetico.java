//Atributos da classe
public class Cosmetico extends Loja {
    private double taxaComercializacao;


    // Construtor que recebe todos os atributos de Loja e taxaComercializacao
    public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int maxProdutos, double taxaComercializacao) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, maxProdutos);
        this.taxaComercializacao = taxaComercializacao;
    }

    // Getter e setter para taxaComercializacao
    public double getTaxaComercializacao() { 
        return taxaComercializacao; 
    }
    
    public void setTaxaComercializacao(double taxaComercializacao) { 
        this.taxaComercializacao = taxaComercializacao; 
    }

    // Método toString
    @Override
    public String toString() {
        return super.toString() + "\nTaxa de Comercialização: " + taxaComercializacao;
    }
}