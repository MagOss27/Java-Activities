public class eBook extends Livro {

    private double tamanhoArquivo;
    private String formato;

    public eBook(String titulo, String autor, String isbn, boolean disponibilidade, double tamanhoArquivo, String formato) {
        super(titulo, autor, isbn, disponibilidade);
        this.tamanhoArquivo = tamanhoArquivo;
        this.formato = formato;
    }

    public double getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    public void setTamanhoArquivo(double tamanhoArquivo) {
        this.tamanhoArquivo = tamanhoArquivo;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    @Override
    public String getTipo() {
        return "eBook";
    }
}
