// Crie um programa em Java que permita ao usuário calcular seu Índice de Massa Corporal (IMC).

// ● O programa deve solicitar ao usuário que insira seu peso
// (em quilogramas) e sua altura (em metros), e em seguida,
// deve realizar o cálculo do IMC utilizando a fórmula:

import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua altura (em cm): ");
        int alturaCm = scanner.nextInt();
        int alturaM = alturaCm / 100;  // Converte para metros

        System.out.println("Digite seu peso (em Kg): ");
        int peso = scanner.nextInt();

        // Fórmula do IMC usando apenas int
        int imc = peso / (alturaM * alturaM);

        // Exibindo o resultado como um número inteiro
        System.out.println("Seu IMC é: " + imc);

        scanner.close();
    }
}
