import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Estoque estoque = new Estoque();
        Transacao transacao = null;
        int idFuncionario = 0;
        while (true) {
            if (idFuncionario == 0) {
                System.out.println("Digite o ID do funcionário: (1: Comum e 2: Financeiro)");
                idFuncionario = scanner.nextInt();
                scanner.nextLine();
            }
            switch (idFuncionario) {
                case 1:
                    System.out.println("1. Realizar Transação");
                    System.out.println("2. Visualizar Estoque");
                    System.out.println("3. Remover Item do Estoque");
                    System.out.println("4. Voltar a tela de 'Digite o ID do funcionário'");
                    System.out.println("5. Sair");
                    break;
                case 2:
                    System.out.println("1. Mostrar Informações de Transação");
                    System.out.println("2. Voltar a tela de 'Digite o ID do funcionário'");
                    System.out.println("3. Sair");
                    break;
                default:
                    System.out.println("Funcionário não existente.");
                    idFuncionario = 0;
                    continue;
            }
            int opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    if (idFuncionario == 1) {
                        System.out.println("Digite o nome do funcionário responsável:");
                        String nomeFuncResponsavel = scanner.nextLine();
                        transacao = new Transacao(nomeFuncResponsavel);
                        transacao.realizarTransacao(estoque);
                    } else if (idFuncionario == 2) {
                        Financeiro.visualizarInformacoesTrans();
                        break;
                    }
                    break;
                case 2:
                    if (idFuncionario == 1) {
                        estoque.visualizarEstoque();
                        break;
                    } else if (idFuncionario == 2) {
                        idFuncionario = 0;
                        break;
                    }
                case 3:
                    if (idFuncionario == 1) {
                        System.out.println("Digite o nome do item que deseja remover:");
                        String nomeRemover = scanner.nextLine();
                        System.out.println("Digite a quantidade que deseja remover:");
                        int quantidadeRemover = scanner.nextInt();
                        scanner.nextLine();
                        estoque.removerItemEstoque(nomeRemover, quantidadeRemover);
                        break;
                    } else if (idFuncionario == 2) {
                        System.exit(0);
                        break;
                    }
                    break;
                case 4:
                    idFuncionario = 0;
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}