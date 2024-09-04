public class eBook extends Livro {

    // Atributos específicos da classe eBook
    private double tamanhoArquivo; // Tamanho do arquivo do eBook em MB
    private String formato; // Formato do arquivo do eBook (por exemplo, PDF, EPUB)

    // Construtor da classe eBook, que chama o construtor da classe pai (Livro) e inicializa os atributos específicos de eBook
    public eBook(String titulo, String autor, String isbn, boolean disponibilidade, double tamanhoArquivo, String formato) {
        super(titulo, autor, isbn, disponibilidade); // Chama o construtor da classe Livro
        this.tamanhoArquivo = tamanhoArquivo; // Inicializa o tamanho do arquivo
        this.formato = formato; // Inicializa o formato do arquivo
    }

    // Método getter para obter o tamanho do arquivo
    public double getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    // Método setter para definir o tamanho do arquivo
    public void setTamanhoArquivo(double tamanhoArquivo) {
        this.tamanhoArquivo = tamanhoArquivo;
    }

    // Método getter para obter o formato do arquivo
    public String getFormato() {
        return formato;
    }

    // Método setter para definir o formato do arquivo
    public void setFormato(String formato) {
        this.formato = formato;
    }

    // Sobrescreve o método getTipo da classe Livro para retornar "eBook"
    @Override
    public String getTipo() {
        return "eBook";
    }
}
