import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 1000.00; // Saldo inicial
        int opcao;

        do {
            System.out.println("Menu:");
            System.out.println("1. Ver saldo");
            System.out.println("2. Retirar");
            System.out.println("3. Depositar");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Ver saldo
                    System.out.printf("Seu saldo atual é: R$ %.2f%n", saldo);
                    break;

                case 2:
                    // Retirar dinheiro
                    System.out.print("Digite o valor a ser retirado: R$ ");
                    double valorRetirada = scanner.nextDouble();
                    if (valorRetirada > saldo) {
                        System.out.println("Saldo insuficiente para a retirada.");
                    } else {
                        saldo -= valorRetirada;
                        System.out.printf("Você retirou R$ %.2f. Seu novo saldo é: R$ %.2f%n", valorRetirada, saldo);
                    }
                    break;

                case 3:
                    // Depositar dinheiro
                    System.out.print("Digite o valor a ser depositado: R$ ");
                    double valorDeposito = scanner.nextDouble();
                    saldo += valorDeposito;
                    System.out.printf("Você depositou R$ %.2f. Seu novo saldo é: R$ %.2f%n", valorDeposito, saldo);
                    break;

                case 4:
                    // Sair
                    System.out.println("Saindo... Obrigado por usar nosso sistema.");
                    break;

                default:
                    // Opção inválida
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
            System.out.println(); // Linha em branco para melhor visualização

        } while (opcao != 4); // Continua até que o usuário escolha sair

        scanner.close(); // Fecha o scanner
    }
}
