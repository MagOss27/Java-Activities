public class Games {

    private String titulo;
    private String descricao;
    private int numeroGame;

    // Construtor
    public Games(String titulo, String descricao, int numeroGame) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.numeroGame = numeroGame;
    }

    // Getter para título
    public String getTitulo() {
        return titulo;
    }

    // Getter para descrição
    public String getDescricao() {
        return descricao;
    }

    // Getter para número do jogo
    public int getNumeroGame() {
        return numeroGame;
    }

    // Setter para título
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Setter para descrição
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Setter para número do jogo
    public void setNumeroGame(int numeroGame) {
        this.numeroGame = numeroGame;
    }
}
