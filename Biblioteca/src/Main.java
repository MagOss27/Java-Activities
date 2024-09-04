import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        // Cria uma instância da classe Biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Adicionando livros e eBooks à biblioteca

        // Cria um livro físico
        Livro livroFisico = new LivroFisico("1984", "George Orwell", "123456789", true);
        
        // Cria um eBook
        eBook ebook = new eBook("O Guia do Mochileiro das Galáxias", "Douglas Adams", "987654321", true, 2.5, "PDF");
        
        // Cria uma revista
        Revista revista = new Revista("Scientific American", "John Doe", "1122334455", true, 100, "Setembro");

        // Adiciona os livros criados à biblioteca
        biblioteca.adicionarLivro(livroFisico);
        biblioteca.adicionarLivro(ebook);
        biblioteca.adicionarLivro(revista);

        // Adicionando membros à biblioteca
        
        // Cria um membro
        Membro membro1 = new Membro("Magnus", 1);
        
        // Adiciona o membro à biblioteca
        biblioteca.adicionarMembro(membro1);

        // Criando um empréstimo de um livro
        
        // Define as datas de empréstimo e devolução
        LocalDate dataEmprestimo = LocalDate.of(2024, 9, 1);
        LocalDate dataDevolucao = LocalDate.of(2024, 9, 10);
        
        // Cria um empréstimo do livro físico para o membro Magnus
        Emprestimo emprestimo = new Emprestimo(livroFisico, membro1, dataEmprestimo, dataDevolucao);

        // Registrando o empréstimo e a devolução
        
        // Registra o empréstimo do livro
        emprestimo.registrarEmprestimo();
        
        // Registra a devolução do livro
        emprestimo.registrarDevolucao();
    }
}
