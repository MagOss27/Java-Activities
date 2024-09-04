import java.time.LocalDate;

public class Emprestimo {

    // Atributos da classe Emprestimo
    private Livro livro; // Livro que está sendo emprestado
    private Membro membro; // Membro que está emprestando o livro
    private LocalDate dataEmprestimo; // Data em que o empréstimo foi realizado
    private LocalDate dataDevolucao; // Data em que o livro deve ser devolvido

    // Construtor da classe Emprestimo, inicializa os atributos com os valores fornecidos
    public Emprestimo(Livro livro, Membro membro, LocalDate dataEmprestimo, LocalDate dataDevolucao) {
        this.livro = livro;
        this.membro = membro;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    // Método para registrar um empréstimo
    public void registrarEmprestimo() {
        if (livro.getDisponibilidade()) { // Verifica se o livro está disponível
            livro.setDisponibilidade(false); // Define o livro como indisponível
            System.out.println("Empréstimo registrado para " + membro.getNome() + " com o livro " + livro.getTitulo() + " em " + dataEmprestimo);
        } else {
            System.out.println("O livro " + livro.getTitulo() + " não está disponível para empréstimo.");
        }
    }

    // Método para registrar a devolução de um livro
    public void registrarDevolucao() {
        livro.setDisponibilidade(true); // Define o livro como disponível novamente
        System.out.println("Devolução registrada para " + membro.getNome() + " com o livro " + livro.getTitulo() + " em " + dataDevolucao);
    }

    // Getters e Setters para acessar e modificar os atributos

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Membro getMembro() {
        return membro;
    }

    public void setMembro(Membro membro) {
        this.membro = membro;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
}
