abstract class Animal {
    abstract void fazerSom();
}

class Cachorro extends Animal {
    @Override
    void fazerSom() {
        System.out.println("Au Au");
    }
}

class Gato extends Animal {
    @Override
    void fazerSom() {
        System.out.println("Miau");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();
        
        cachorro.fazerSom();
        gato.fazerSom();
    }
}