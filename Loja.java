import java.util.Arrays;

//Atributos da Classe 
public class Loja {
     private String nome;
     private int quantidadeFuncionarios;
     private double salarioBaseFuncionario;
     private Endereco endereco;
     private Data dataFundacao;
     private Produto[] estoqueProdutos;
    
    // Construtor que inicializa todos os atributos
    public Loja (String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int maxProdutos) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[maxProdutos];
    }

    // Construtor que inicializa todos os atributos, com salário -1
    public Loja (String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int maxProdutos) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[maxProdutos];
    }
             
    // Getters e Setters para cada atributo
    public String getNome (){
        return nome;
    }
    
    public void setNome (String nome){
        this.nome = nome;
    }
    
    public int getQuantidadeFuncionarios (){
        return quantidadeFuncionarios;
    }
    
    public void setQuantidadeFuncionarios (int quantidadeFuncionarios){
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }
    
    public double getSalarioBaseFuncionario (){
        return salarioBaseFuncionario;
    }
    
    public void setSalarioBaseFuncionario (double salarioBaseFuncionario){
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }
    
    public Endereco getEndereco (){
        return endereco;
    }
    
    public void setEndereco (Endereco endereco) {
        this.endereco = endereco;
    }
    
    public Data getDataFundacao (){
        return dataFundacao;
    }
    
    public void setDataFundacao (Data dataFundacao){
        this.dataFundacao = dataFundacao;
    }
    
    public Produto[] getEstoqueProdutos() {
    return estoqueProdutos;
    }
        
    public void setEstoqueProdutos(Produto[] estoqueProdutos) {
    this.estoqueProdutos = estoqueProdutos;
    }
    
    // Método toString
    @Override
    public String toString() {
        return "Loja: " + nome + "\nQuantidade de Funcionários: " + quantidadeFuncionarios +
               "\nSalário Base dos Funcionários: " + salarioBaseFuncionario + 
               "\nEndereco: " + endereco + "\nData da Fundacao: " + dataFundacao;
    }
    
     // Método gastosComSalario
    public double gastosComSalario() {
        if (salarioBaseFuncionario == -1) {
            return -1;
        }
        return quantidadeFuncionarios * salarioBaseFuncionario;
    }
    
    // Método insereProduto
    public boolean insereProduto(Produto produto) {
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] == null) {
                estoqueProdutos[i] = produto;
                return true;
            }
        }
        return false;
    }

    // Método removeProduto
    public boolean removeProduto(String nomeProduto) {
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equals(nomeProduto)) {
                estoqueProdutos[i] = null;
                return true;
            }
        }
        return false;
    }
    
    //Metodo imprimeProdutos
    public void imprimeProdutos() {
    for (int i = 0; i < estoqueProdutos.length; i++) {
        if (estoqueProdutos[i] != null) {
            System.out.println(estoqueProdutos[i]);
        }
    }
    }

    // Método tamanhoDaLoja
    public char tamanhoDaLoja() {
        if (quantidadeFuncionarios < 10) return 'P';
        else if (quantidadeFuncionarios <= 30) return 'M';
        else return 'G';
    }
}
