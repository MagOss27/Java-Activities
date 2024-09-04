public abstract class Livro { 
    // Tornando a classe Livro abstrata porque não deve ser instanciada diretamente
    // A classe Livro serve como uma base para diferentes tipos de livros (por exemplo, eBook, Revista)

    // Atributos comuns a todos os tipos de livros
    private String titulo; // Título do livro
    private String autor; // Autor do livro
    private String isbn; // Código ISBN do livro
    private boolean disponibilidade; // Disponibilidade do livro para empréstimo

    // Construtor da classe Livro para inicializar os atributos
    public Livro(String titulo, String autor, String isbn, boolean disponibilidade) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponibilidade = disponibilidade;
    }

    // Métodos getter e setter para acessar e modificar os atributos

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
    // Cada tipo específico de livro (como eBook) deve definir seu próprio tipo retornando uma string
    public abstract String getTipo();
}
