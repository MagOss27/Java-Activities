public class Tarefa {
    private String titulo;
    private String descricao;
    private boolean completa;

    public Tarefa(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.completa = false;
    }

    public void completar() {
        this.completa = true;
    }

    @Override
    public String toString() {
        if (completa) {
            return "[x] " + this.titulo;
        }
        return "[ ] " + this.titulo;
    }
}
