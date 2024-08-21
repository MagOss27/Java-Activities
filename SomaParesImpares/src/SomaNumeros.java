// Crie um programa em Java que solicita ao usuário que digite um número inteiro N, que representa a quantidade de números a serem lidos.

// Depois retorne os seguintes valores:
// Soma de todos os valores.
// Soma dos valores pares.
// Soma dos valores ímpares.

//importar Scanner
import java.util.Scanner;

public class SomaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitação para o usuário de quantidade de números
        System.out.print("Digite a quantidade de números para serem lidos: ");
        // armazenar os números digitados pela usuário
        int numerosT = scanner.nextInt(); // nextInt() utilizado para "int"

        // começa com 0 as somas
        int somaTotal = 0;
        int somaPares = 0;
        int somaImpares = 0;

        // log para a soma dos números\\
        // basicamente i começa com 1, e faz do numero escolhido até chegar a 1, fazendo
        // com que seja i++
        for (int i = 1; i <= numerosT; i++) {
            // basicamente aqui, pergunta a quantidade de vezes, que foi escolhido o número.
            // Ou seja se foi escrito 3, ira perguntar para digitar o número 3 vezes.
            System.out.print("Digite o número " + i + ": ");
            int numero = scanner.nextInt();

            // soma total dos números
            somaTotal += numero;

            // if e else para descobrir qual é para e qual é impar
            if (numero % 2 == 0) {
                somaPares += numero;
            } else {
                somaImpares += numero;
            }
        }

        // resultado final - mostrar na tela
        System.out.println("Soma de todos os valores: " + somaTotal);
        System.out.println("Soma dos valores pares: " + somaPares);
        System.out.println("Soma dos valores ímpares: " + somaImpares);

        scanner.close();
    }
}
