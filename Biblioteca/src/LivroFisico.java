public class LivroFisico extends Livro {

    // Construtor da classe LivroFisico que chama o construtor da classe pai (Livro)
    public LivroFisico(String titulo, String autor, String isbn, boolean disponibilidade) {
        super(titulo, autor, isbn, disponibilidade); // Passa os parâmetros para o construtor da classe Livro
    }

    // Sobrescreve o método abstrato getTipo da classe Livro
    // Retorna "Livro Físico" para identificar que este é um livro físico
    @Override
    public String getTipo() {
        return "Livro Físico";
    }
}
