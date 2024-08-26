
public class Calculadora {
    public float adicionarNumeros(float a,float b){
        return (a+b);
    }
    public float subtrairNumeros (float a,float b){
        return (a-b);    
    }
    public float multiplicarNumeros(float a,float b){
        return (a*b);
    }
    public float dividirNumeros(float a,float b){
        float divisao=0;
        if (b!=0){
            divisao=a/b;
        }
        return divisao;
    }
    public float calcularResto(float a,float b){
        return (a%b);
    }
    public int calcularFatorial(int n){
        int f=1;
        for (int i = n; i > 1; i--) {
            f *= i;
        }
        return (f);
    }
    
}
