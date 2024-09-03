public class LivroFisico extends Livro {

    public LivroFisico(String titulo, String autor, String isbn, boolean disponibilidade) {
        super(titulo, autor, isbn, disponibilidade);
    }

    @Override
    public String getTipo() {
        return "Livro Físico";
    }
}
