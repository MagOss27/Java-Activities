class Veiculo {
    protected int rodas;

    public Veiculo(int rodas) {
      this.rodas = rodas;
    }

    public void numeroDeRodas() {
        System.out.println("Veículo tem " + this.rodas + " rodas");
    }
}
