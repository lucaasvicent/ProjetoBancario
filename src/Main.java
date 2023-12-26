import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = "Lucas Vicente";
        String tipoConta = "Corrente";
        double saldo = 2000.00;
        int opcao = 0;

        System.out.println("***************");
        System.out.println("Nome do Cliente: " + nome);
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.println("Saldo: " + saldo);
        System.out.println("***************");

        String menu = """
                \n*** OPERAÇÕES ***
                1 - SALDO ATUAL
                2 - TRANSFERÊNCIA
                3 - RECEBER PIX
                4 - ENCERRAR
                """;

        while (opcao != 4) {
            System.out.println(menu);
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Seu saldo atual é de: " + saldo);
                    break;
                case 2:
                    System.out.println("Digite o valor que deseja transferir: ");
                    double valor = sc.nextDouble();
                    if (valor > saldo) {
                        System.out.println("Não será possível realizar a transferência!");
                    } else {
                        saldo -= valor;
                        System.out.println("Seu valor atual é de: " + saldo);
                    }
                    break;
                case 3:
                    System.out.println("Digite o valor a ser recebido:");
                    double valorReceber = sc.nextDouble();
                    saldo += valorReceber;
                    System.out.println("Seu novo saldo é de: " + saldo);
                    break;
                case 4:
                    System.out.println("Encerrar Operações!");
                    System.exit(1);
                    break;
                default:
                    System.out.println("OPÇÃO INVÁLIDA!");
            }

        }
        sc.close();
    }
}