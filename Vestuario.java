//Atributos da classe
public class Vestuario extends Loja {
    private boolean produtosImportados;
    
    // Construtor que recebe todos os atributos de Loja e ProdutosImportados
    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, boolean produtosImportados, int maxProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, maxProdutos);
        this.produtosImportados = produtosImportados;
    }

    // Getter e setter para Produtos Importados
    public boolean getProdutosImportados() { 
        return produtosImportados; 
    }
    
    public void setProdutosImportados(boolean produtosImportados) { 
        this.produtosImportados = produtosImportados; 
    }
    
    // Método toString
    @Override
    public String toString() {
        return super.toString() + "\nProdutos Importados: " + produtosImportados;
    }
}