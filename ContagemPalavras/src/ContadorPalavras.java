// Crie um programa em Java que solicita ao usuário que digite uma frase. O programa deve contar o número de palavras na frase e exibir o resultado na tela.

// Para contar as palavras na frase, você pode seguir as seguintes etapas:

// Divida a frase em uma lista de palavras. Para fazer isso, utilize o método split() da classe String em Java.
// Obtenha o tamanho da lista de palavras. Para fazer isso, utilize o atributo length do array.
// Exiba o número de palavras na frase na tela.

import java.util.Scanner;

public class ContadorPalavras {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
                System.out.println("Digite uma frase:");
        String frasesinha = scanner.nextLine();
        
        String[] palavras = frasesinha.trim().split("\\s+");
        
        int numeroPalavras = palavras.length;
        
        System.out.println("Número de palavras na frase: " + numeroPalavras);
        
        scanner.close();
    }
}

