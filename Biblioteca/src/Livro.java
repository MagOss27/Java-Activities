public abstract class Livro { // Tornando a classe Livro abstrata porque não deve ser instanciada diretamente
    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponibilidade;

    public Livro(String titulo, String autor, String isbn, boolean disponibilidade) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponibilidade = disponibilidade;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public boolean getDisponibilidade() {
        return disponibilidade;
    }
    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    // Método abstrato que será implementado pelas subclasses
    public abstract String getTipo();
}
