import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Loja loja = null;
        Produto produto = null;
        Data dataVerificacao = new Data(20, 10, 2023);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("(1) Criar uma loja");
            System.out.println("(2) Criar um produto");
            System.out.println("(3) Sair");
            System.out.print("Escolha uma opção: ");
            
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome da loja: ");
                    String nomeLoja = scanner.nextLine();
                    
                    System.out.print("Quantidade de funcionários: ");
                    int quantidadeFuncionarios = scanner.nextInt();
                    
                    System.out.print("Salário base dos funcionários (ou -1 se desconhecido): ");
                    double salarioBase = scanner.nextDouble();
                    scanner.nextLine();
                    
                    System.out.print("Nome da rua: ");
                    String nomeDaRua = scanner.nextLine();
                    
                    System.out.print("Cidade: ");
                    String cidade = scanner.nextLine();
                    
                    System.out.print("Estado: ");
                    String estado = scanner.nextLine();
                    
                    System.out.print("País: ");
                    String pais = scanner.nextLine();
                    
                    System.out.print("CEP: ");
                    String cep = scanner.nextLine();
                    
                    System.out.print("Número: ");
                    String numero = scanner.nextLine();
                    
                    System.out.print("Complemento: ");
                    String complemento = scanner.nextLine();
                    
                    Endereco endereco = new Endereco(nomeDaRua, cidade, estado, pais, cep, numero, complemento);

                    System.out.print("Dia da fundação: ");
                    int diaFundacao = scanner.nextInt();
                    
                    System.out.print("Mês da fundação: ");
                    int mesFundacao = scanner.nextInt();
                    
                    System.out.print("Ano da fundação: ");
                    int anoFundacao = scanner.nextInt();
                    scanner.nextLine();
                    
                    Data dataFundacao = new Data(diaFundacao, mesFundacao, anoFundacao);
                    
                    System.out.print("Quantidade máxima de produtos no estoque: ");
                    int maxProdutos = scanner.nextInt();
                    scanner.nextLine();

                    loja = new Loja(nomeLoja, quantidadeFuncionarios, salarioBase, endereco, dataFundacao, maxProdutos);
                    System.out.println("Loja criada com sucesso!");
                    
                    // Exibindo as informações da loja criada
                    System.out.println("\nInformações da loja criada:");
                    System.out.println(loja);
                    break;

                case 2:
                    if (loja == null) {
                        System.out.println("Primeiro crie uma loja antes de criar um produto.");
                        break;
                    }

                    System.out.print("Nome do produto: ");
                    String nomeProduto = scanner.nextLine();

                    System.out.print("Preço do produto: ");
                    double preco = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Dia de validade: ");
                    int diaValidade = scanner.nextInt();

                    System.out.print("Mês de validade: ");
                    int mesValidade = scanner.nextInt();

                    System.out.print("Ano de validade: ");
                    int anoValidade = scanner.nextInt();
                    scanner.nextLine();

                    Data dataValidade = new Data(diaValidade, mesValidade, anoValidade);

                    produto = new Produto(nomeProduto, preco, dataValidade);
                    System.out.println("Produto criado com sucesso!");

                    // Exibindo as informações do produto criado
                    System.out.println("\nInformações do produto criado:");
                    System.out.println(produto);

                    if (produto.estaVencido(dataVerificacao)) {
                        System.out.println("PRODUTO VENCIDO");
                    } else {
                        System.out.println("PRODUTO NÃO VENCIDO");
                    }
                    break;

                case 3:
                    System.out.println("Saindo do programa.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
