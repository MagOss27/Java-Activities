public class Revista extends Livro {

    private int edicao;
    private String mesPublicacao;

    public Revista(String titulo, String autor, String isbn, boolean disponibilidade, int edicao, String mesPublicacao) {
        super(titulo, autor, isbn, disponibilidade);
        this.edicao = edicao;
        this.mesPublicacao = mesPublicacao;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public String getMesPublicacao() {
        return mesPublicacao;
    }

    public void setMesPublicacao(String mesPublicacao) {
        this.mesPublicacao = mesPublicacao;
    }

    @Override
    public String getTipo() {
        return "Revista";
    }
}
