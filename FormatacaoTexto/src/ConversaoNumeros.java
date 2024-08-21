// Solicitar um número inteiro positivo do usuário e retornar:

// Seu valor em decimal
// Seu valor em hexadecimal
// Seu valor em octal
// Seu valor convertido em caractere.
// Se o usuário passar um número negativo, retorna uma mensagem de erro.

import java.util.Scanner;

public class ConversaoNumeros {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro positivo:");
        
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("Erro: O número deve ser positivo.");
        } else {
            // Exibir valor em decimal
            System.out.println("Valor em decimal: " + numero);

            // Exibir valor em hexadecimal
            System.out.println("Valor em hexadecimal: " + Integer.toHexString(numero).toUpperCase());

            // Exibir valor em octal
            System.out.println("Valor em octal: " + Integer.toOctalString(numero));

            // Exibir valor convertido em caractere (só é válido para números de 0 a 255)
            if (numero >= 0 && numero <= 255) {
                char caractere = (char) numero;
                System.out.println("Valor convertido em caractere: " + caractere);
            } else {
                System.out.println("Valor convertido em caractere: Não aplicável (fora do intervalo 0-255)");
            }
        }
        
        scanner.close();
    }
}
