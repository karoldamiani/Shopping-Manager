//Atributos da classe
public class Endereco {
    private String nomeDaRua;
    private String cidade;
    private String estado;
    private String pais;
    private String cep;
    private String numero;
    private String complemento;
    
    //Metodo Construtor
    public Endereco(String nomeDaRua, String cidade, String estado, String pais, String cep, String numero, String complemento){
        this.nomeDaRua = nomeDaRua;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.cep = cep;
        this.numero = numero;
        this.complemento = complemento;
    }
    
    //Metodos de acesso - Getters e Setters
    public String getNomeDaRua(){
        return nomeDaRua;
    }
    
    public void setNomeDaRua(String nomeDaRua){
        this.nomeDaRua = nomeDaRua;
    }
    
    public String getCidade(){
        return cidade;
    }
    
    public void setCidade(String cidade){
        this.cidade = cidade;
    }
    
    public String getEstado(){
        return estado;
    }
    
    public void setEstado(String estado){
        this.estado = estado;
    }
    
    public String getPais(){
        return pais;
    }
    
    public void setPais(String pais){
        this.pais = pais;
    }
    
    public String getCep(){
        return cep;
    }
    
    public void setCep(String cep){
        this.cep = cep;
    }
    
    public String getNumero(){
        return numero;
    }
    
    public void setNumero(String numero){
        this.numero = numero;
    }
    
    public String getComplemento(){
        return complemento;
    }
    
    public void setComplemento(String complemento){
        this.complemento = complemento;
    }
    
    //Metodo toString
    @Override
    public String toString(){
        return "Endereço: " + nomeDaRua + ",Nº: " + numero + "," + complemento + "\n" + 
        "Cidade: " + cidade + "-" + estado + "\n" +
        "País: " + pais + ",cep: " + cep;
    }
}