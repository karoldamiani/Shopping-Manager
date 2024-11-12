//Atributos da classe
public class Data {
    private int dia;
    private int mes;
    private int ano;
    
    //Metodo construtor
    public Data (int dia, int mes, int ano){
        if (dataValida(dia, mes, ano)) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        
        }else {
            System.out.println("Data invalida! Atribuindo data padrão: 1/1/2000.");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }
    
    //Metodo para verificar se o ano é bissexto
    private boolean anoBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }
    
     // Método público para verificar se o ano da instância é bissexto
    public boolean verificaAnoBissexto() {
        return anoBissexto(this.ano);
    }
    
    //Metodo para validar o dia, mes e ano
    private boolean dataValida(int dia, int mes, int ano) {
        if (mes <1 || mes > 12) {
            return false;
        }
        
        
        int[] diasPorMes = {31, (anoBissexto(ano) ? 29 : 28), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        
        return dia > 0 && dia <= diasPorMes[mes-1];
    }
    
    //Getters e Setters
    public int getDia(){
        return dia;
    }
    
    public void setDia(int dia){
        this.dia = dia;
    }
    
    public int getMes(){
        return mes;
    }
    
    public void setMes(int mes){
        this.mes = mes;
    }
    
    public int getAno(){
        return ano;
    }
    
    public void setAno(int ano){
        this.ano = ano;
    }
    
    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }
}

