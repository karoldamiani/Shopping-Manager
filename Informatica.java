//Atributos da classe
public class Informatica extends Loja {
    private double seguroEletronicos;

    // Construtor que recebe todos os atributos
    public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double seguroEletronicos, int maxProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, maxProdutos);
        this.seguroEletronicos = seguroEletronicos;
    }

    // Getter e setter para SeguroEletronicos
    public double getSeguroEletronicos() { 
        return seguroEletronicos; 
    }
    
    public void setSeguroEletronicos(double seguroEletronicos) { 
        this.seguroEletronicos = seguroEletronicos; 
    }

    // Método toString
    @Override
    public String toString() {
        return super.toString() + "\nSeguro de Eletronicos: " + seguroEletronicos;
    }
}