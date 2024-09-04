public class Revista extends Livro {

    // Atributos específicos da classe Revista
    private int edicao; // Número da edição da revista
    private String mesPublicacao; // Mês de publicação da revista

    // Construtor da classe Revista que chama o construtor da classe pai (Livro)
    public Revista(String titulo, String autor, String isbn, boolean disponibilidade, int edicao, String mesPublicacao) {
        super(titulo, autor, isbn, disponibilidade); // Inicializa os atributos da superclasse Livro
        this.edicao = edicao; // Inicializa o atributo específico edicao
        this.mesPublicacao = mesPublicacao; // Inicializa o atributo específico mesPublicacao
    }

    // Métodos getter e setter para acessar e modificar os atributos específicos da classe Revista

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

    // Sobrescreve o método abstrato getTipo da classe Livro
    // Retorna "Revista" para identificar que este é um tipo de livro específico
    @Override
    public String getTipo() {
        return "Revista";
    }
}
