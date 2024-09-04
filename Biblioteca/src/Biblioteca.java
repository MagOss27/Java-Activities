import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    // Listas para armazenar os livros e membros da biblioteca
    private List<Livro> livros;
    private List<Membro> membros;

    // Construtor da classe Biblioteca, inicializa as listas de livros e membros
    public Biblioteca() {
        livros = new ArrayList<>();
        membros = new ArrayList<>();
    }

    // Método para adicionar um livro à lista de livros
    public void adicionarLivro(Livro livro) {
        livros.add(livro); // Adiciona o livro à lista
        System.out.println("Livro " + livro.getTitulo() + " adicionado."); // Exibe uma mensagem de confirmação
    }

    // Método para adicionar um membro à lista de membros
    public void adicionarMembro(Membro membro) {
        membros.add(membro); // Adiciona o membro à lista
        System.out.println("Membro " + membro.getNome() + " adicionado."); // Exibe uma mensagem de confirmação
    }

    // Método para buscar um livro pelo título
    public Livro buscarLivroPorTitulo(String titulo) {
        for (Livro livro : livros) { // Percorre a lista de livros
            if (livro.getTitulo().equalsIgnoreCase(titulo)) { // Compara o título, ignorando maiúsculas e minúsculas
                return livro; // Retorna o livro se o título corresponder
            }
        }
        return null; // Retorna null se nenhum livro for encontrado
    }

    // Método para buscar um membro pelo ID
    public Membro buscarMembroPorId(int id) {
        for (Membro membro : membros) { // Percorre a lista de membros
            if (membro.getId() == id) { // Compara o ID do membro
                return membro; // Retorna o membro se o ID corresponder
            }
        }
        return null; // Retorna null se nenhum membro for encontrado
    }
}
