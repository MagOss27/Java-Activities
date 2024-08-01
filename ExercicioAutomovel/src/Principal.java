public class Principal {
     public static void main(String[] args) {
         // Criação de uma instância de Veiculo
         Veiculo v = new Veiculo(4);
         v.numeroDeRodas();
         
         // Criação de uma instância de Carro
         Carro c = new Carro(4);
         c.numeroDeRodas();
         c.portas();
      
         // Criação de uma instância de Moto
         Moto m = new Moto();
         m.numeroDeRodas();
         m.empinar();
 
         // Criação de Carro como fosse Veículo
         Veiculo v2 = new Carro(4);
         v2.numeroDeRodas();
         // Casting de Veiculo para Carro
         if (v2 instanceof Carro) {
             Carro c2 = (Carro) v2; // Cast explícito
             c2.portas(); // Chama o método específico de Carro
         } else {
             System.out.println("O objeto não é um Carro.");
         }
     }
 }
 