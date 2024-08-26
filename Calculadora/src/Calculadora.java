class Calculadora {
    // Adicionar dois números
    public float adicionarNumero(float a, float b) {
        return a + b;
    }

    // Subtrair dois números
    public float subtrairNumero(float a, float b) {
        return a - b;
    }

    // Multiplicar dois números
    public float multiplicarNumero(float a, float b) {
        return a * b;
    }

    // Dividir dois números
    public float dividirNumero(float a, float b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Erro: Não é possível dividir por zero");
            return Float.NaN; // Retorna NaN (Not a Number) em caso de divisão por zero
        }
    }

    // Calcular o resto da divisão de dois números
    public float restoDaDivisao(float a, float b) {
        return a % b;
    }

    // Calcular o fatorial de um número
    public long fatorial(int numero) {
        if (numero < 0) {
            System.out.println("Erro: número negativo!");
            return -1;
        }
        int fatorial = 1;
        for (int i = 2; i <= numero; i++) {
            fatorial *= i; // Corrigido para multiplicar, não somar
        }
        return fatorial;
    }
}
