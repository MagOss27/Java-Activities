import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Adicionando livros e eBooks
        Livro livroFisico = new LivroFisico("1984", "George Orwell", "123456789", true);
        eBook ebook = new eBook("O Guia do Mochileiro das Galáxias", "Douglas Adams", "987654321", true, 2.5, "PDF");
        Revista revista = new Revista("Scientific American", "John Doe", "1122334455", true, 100, "Setembro");

        biblioteca.adicionarLivro(livroFisico);
        biblioteca.adicionarLivro(ebook);
        biblioteca.adicionarLivro(revista);

        // Adicionando membros
        Membro membro1 = new Membro("Magnus", 1);
        biblioteca.adicionarMembro(membro1);

        // Criando um empréstimo
        LocalDate dataEmprestimo = LocalDate.of(2024, 9, 1);
        LocalDate dataDevolucao = LocalDate.of(2024, 9, 10);
        Emprestimo emprestimo = new Emprestimo(livroFisico, membro1, dataEmprestimo, dataDevolucao);

        // Registrando o empréstimo e a devolução
        emprestimo.registrarEmprestimo();
        emprestimo.registrarDevolucao();
    }
}
