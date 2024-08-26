// ● Crie uma classe “calculadora” que faça as seguintes
// operações (acessíveis por métodos):

// ○ Adicionar
// ○ Subtrair
// ○ Multiplicar
// ○ Dividir
// ○ Calcular resto de uma divisão
// ○ Calcular o fatorial de um número

// ● Na função “main” deverá ser solicitado a operação e
// a(s) entrada(s) necessárias.
// ● O resultado da operação selecionada deverá ser
// mostrado.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        int escolhaNumero;

        // laço de repetição - Inicio\\
        do {
            System.out.println("Selecione a operação:");
            System.out.println("1. Adicionar");
            System.out.println("2. Subtrair");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Calcular resto de uma divisão");
            System.out.println("6. Calcular o fatorial de um número");
            System.out.println("7. Sair");
            escolhaNumero = scanner.nextInt();

            if (escolhaNumero == 7) {
                System.out.println("Saindo...");
                break;
            }

            float numero1, numero2;
            int numeroInteiro;

            switch (escolhaNumero) {
                case 1:
                    System.out.println("Digite o primeiro número: ");
                    numero1 = scanner.nextFloat();
                    System.out.println("Digite o segundo número: ");
                    numero2 = scanner.nextFloat();
                    System.out.println("Resultado da Adição: " + calculadora.adicionarNumero(numero1, numero2));
                    break;

                case 2:
                    System.out.println("Digite o primeiro número: ");
                    numero1 = scanner.nextFloat();
                    System.out.println("Digite o segundo número: ");
                    numero2 = scanner.nextFloat();
                    System.out.println("Resultado da Subtração: " + calculadora.subtrairNumero(numero1, numero2));
                    break;

                case 3:
                    System.out.println("Digite o primeiro número: ");
                    numero1 = scanner.nextFloat();
                    System.out.println("Digite o segundo número: ");
                    numero2 = scanner.nextFloat();
                    System.out.println("Resultado da Multiplicação: " + calculadora.multiplicarNumero(numero1, numero2));
                    break;

                case 4:
                    System.out.println("Digite o primeiro número: ");
                    numero1 = scanner.nextFloat();
                    System.out.println("Digite o segundo número: ");
                    numero2 = scanner.nextFloat();
                    System.out.println("Resultado da Divisão: " + calculadora.dividirNumero(numero1, numero2));
                    break;

                case 5:
                    System.out.println("Digite o primeiro número: ");
                    numero1 = scanner.nextFloat();
                    System.out.println("Digite o segundo número: ");
                    numero2 = scanner.nextFloat();
                    System.out
                            .println("Resultado do Resto da Divisão: " + calculadora.restoDaDivisao(numero1, numero2));
                    break;

                case 6:
                    System.out.println("Digite um número inteiro: ");
                    numeroInteiro = scanner.nextInt();
                    System.out.println("Resultado do Fatorial: " + calculadora.fatorial(numeroInteiro));
                    break;

                default:
                    System.out.println("Operação inválida!");
                    break;
            }

        } while (escolhaNumero != 7);
        // laço de repetição - Final\\

        scanner.close();
    }
}
