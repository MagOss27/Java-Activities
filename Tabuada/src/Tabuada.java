// Crie um programa (usando laço de repetição) que permita ao usuário calcular a tabuada de um dado número.
// Ou seja, esse número somado, subtraído, multiplicado e dividido por 1 até 10.

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira um número
        System.out.print("Por favor, Digite um número para calcular a tabuada do Magnus: ");
        int numero = scanner.nextInt();

        // Exibe a tabuada de soma
        System.out.println("\nTabuada de soma:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " + " + i + " = " + (numero + i));
        }

        // Exibe a tabuada de subtração
        System.out.println("\nTabuada de subtração:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " - " + i + " = " + (numero - i));
        }

        // Exibe a tabuada de divisão
        System.out.println("\nTabuada de divisão:");
        for (int i = 1; i <= 10; i++) {
            if (i != 0) {
                System.out.println(numero + " / " + i + " = " + (numero / (double) i));
            }
        }

        // Exibe a tabuada de multiplicação
        System.out.println("\nTabuada de multiplicação:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " * " + i + " = " + (numero * i));
        }

        // Fecha o scanner
        scanner.close();
    }
}
