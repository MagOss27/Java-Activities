public class Membro {

    // Atributos da classe Membro
    private String nome; // Nome do membro
    private int id; // Identificador único do membro

    // Construtor da classe Membro que inicializa os atributos nome e id
    public Membro(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    // Método getter para obter o nome do membro
    public String getNome() {
        return nome;
    }

    // Método setter para definir o nome do membro
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método getter para obter o id do membro
    public int getId() {
        return id;
    }

    // Método setter para definir o id do membro
    public void setId(int id) {
        this.id = id;
    }
}
