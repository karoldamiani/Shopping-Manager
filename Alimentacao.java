//Atributos da classe
public class Alimentacao extends Loja {
    private Data dataAlvara;


    // Construtor que recebe todos os atributos de Loja e dataAlvara
    public Alimentacao(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, Data dataAlvara, int maxProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, maxProdutos);
        this.dataAlvara = dataAlvara;
    }

    // Getter e setter para dataAlvara
    public Data getDataAlvara() { 
        return dataAlvara; 
    }
    
    public void setDataAlvara(Data dataAlvara) { 
        this.dataAlvara = dataAlvara; 
    }

    // Método toString
    @Override
    public String toString() {
        return super.toString() + "\nData do Alvara: " + dataAlvara;
    }
}