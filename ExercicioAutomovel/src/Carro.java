class Carro extends Veiculo {
    private int portas;

    public Carro(int portas) {
      super(4);
      this.portas = portas;
    }

    public void portas() {
        System.out.println("Carro tem " + this.portas + " portas.");
    }
}

