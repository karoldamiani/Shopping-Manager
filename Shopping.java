public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    public Shopping(String nome, Endereco endereco, int maxLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[maxLojas];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

    // Método para adicionar uma loja ao shopping
    public boolean insereLoja(Loja loja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] == null) {
                lojas[i] = loja;
                return true;
            }
        }
        return false;
    }

    // Método para remover uma loja pelo nome
    public boolean removeLoja(String nomeLoja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null && lojas[i].getNome().equals(nomeLoja)) {
                lojas[i] = null;
                return true;
            }
        }
        return false;
    }

    // Método para contar a quantidade de lojas de um determinado tipo (P, M ou G)
    public int quantidadeLojasPorTipo(String tipo) {
    int contador = 0;    
    for (Loja loja : lojas) {
        if (loja != null) {
            if (tipo.equalsIgnoreCase("Cosmético") && loja instanceof Cosmetico) {
                contador++;
            } 
            else if (tipo.equalsIgnoreCase("Vestuário") && loja instanceof Vestuario) {
                contador++;
            } 
            else if (tipo.equalsIgnoreCase("Bijuteria") && loja instanceof Bijuteria) {
                contador++;
            } 
            else if (tipo.equalsIgnoreCase("Alimentação") && loja instanceof Alimentacao) {
                contador++;
            } 
            else if (tipo.equalsIgnoreCase("Informática") && loja instanceof Informatica) {
                contador++;
            }
        }
    }
    return (contador > 0) ? contador : -1;
    }

    // Método para encontrar a loja com o seguro mais caro
    public Informatica lojaSeguroMaisCaro() {
    Informatica lojaMaisCara = null;
    double maiorSeguro = 0;    
    for (Loja loja : lojas) {
        if (loja != null && loja instanceof Informatica) {
            double seguroAtual = ((Informatica) loja).getSeguroEletronicos();
            if (seguroAtual > maiorSeguro) {
                maiorSeguro = seguroAtual;
                lojaMaisCara = (Informatica) loja;
            }
        }
    }
    return lojaMaisCara;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Shopping: ").append(nome).append("\nEndereço: ").append(endereco).append("\n");

        sb.append("Lojas:\n");
        for (Loja loja : lojas) {
            if (loja != null) {
                sb.append(loja).append("\n");
            }
        }
        return sb.toString();
    }
}