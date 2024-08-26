import java.util.Scanner;


public class PCalculadora {

    public static void main(String[] args) {
        System.out.println("1- adicao, 2 - subtracao, 3 - multiplicacao, 4 - divisao, 5 - resto, 6 - fatorial");
        System.out.println("Escolha a operacao: ");        
        Scanner scanner = new Scanner(System.in);
        int op = scanner.nextInt();
        Calculadora calc = new Calculadora();
        float x=0,y=0,res=0;
        int num=0;
                
        switch (op) {
            case 1:
                System.out.println("Adicao");
                System.out.println("Digite o primeiro numero: ");
                x = scanner.nextFloat();
                System.out.println("Digite o segundo numero: ");
                y = scanner.nextFloat();
                res=calc.adicionarNumeros(x, y);
                System.out.println("Resultado da adicao: "+res);
            break;
            case 2:
                System.out.println("Subtracao");
                System.out.println("Digite o primeiro numero: ");
                x = scanner.nextFloat();
                System.out.println("Digite o segundo numero: ");
                y = scanner.nextFloat();
                res=calc.subtrairNumeros(x, y);
                System.out.println("Resultado da subtracao: "+res);
            break;
            case 3:
                System.out.println("Multiplicacao");
                System.out.println("Digite o primeiro numero: ");
                x = scanner.nextFloat();
                System.out.println("Digite o segundo numero: ");
                y = scanner.nextFloat();
                res=calc.multiplicarNumeros(x, y);
                System.out.println("Resultado da multiplicacao: "+res);
           break;
            case 4:
                System.out.println("Divisao");
                System.out.println("Digite o primeiro numero: ");
                x = scanner.nextFloat();
                System.out.println("Digite o segundo numero: ");
                y = scanner.nextFloat();
                res=calc.dividirNumeros(x, y);
                System.out.println("Resultado da divisao: "+res);
                break;
            case 5:
                System.out.println("Resto");
                System.out.println("Digite o primeiro numero: ");
                x = scanner.nextFloat();
                System.out.println("Digite o segundo numero: ");
                y = scanner.nextFloat();
                res=calc.calcularResto(x, y);
                System.out.println("Resto da divisao: "+res);
                break;
            case 6:
                System.out.println("Fatorial");
                System.out.println("Digite o numero: ");
                num = scanner.nextInt();
                
                res=calc.calcularFatorial(num);
                System.out.println("Resultado da fatorial: "+res);
                break;
            default:
                System.out.println("Opcao invalida");
                break;
        }

        scanner.close();
        
    }

}
