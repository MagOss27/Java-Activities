class Calculadora {
    // Adicionar dois números
    double adicionar(double a, double b) {
        return a + b;
    }

    // Subtarir dois números
    double subtarir(double a, double b) {
        return a - b;
    }

    // Multiplicar dois números
    double multiplicar(double a, double b) {
        return a * b;
    }

    // Dividir dois números
    double dividir(double a, double b) {
        if (b != 0) {
            return a / b;

        } else {
            System.out.println("Erro: Não aceitou divisão por zero");
            return Double.NaN; // Retorna NaN (Not a Number) em caso de divisão por zero

        }
    }

    // calcular o resto da divisão de dois números
    double restodaDivisao(double a, double b) {
        return a % b;
    }

    // calcular o fatorial de um número
    long fatorial(int numeros) {
        if (numeros < 0) {
            System.out.println("Erro: número negativo!");
            return -1;
        }
        long fatorial = 1;
        for (int i = 2; i <= numeros; i++) {
            fatorial += i;
        }
        return fatorial;
    }

}
