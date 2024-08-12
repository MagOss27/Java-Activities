class Pessoa {
    private String nome;
    private int idade;

    // Construtor da classe Pessoa
    Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Métodos getter e setter
    String getNome() {
        return nome;
    }

    int getIdade() {
        return idade;
    }

    void setNome(String nome) {
        this.nome = nome;
    }

    void setIdade(int idade) {
        this.idade = idade;
    }

    // Método para exibir uma saudação
    void dizerOla() {
        System.out.println("Olá, meu nome é " + nome + ". Eu tenho " + idade + " anos de idade.");
    }
}

class Estudante extends Pessoa {
    private String matricula;

    // Construtor da classe Estudante
    Estudante(String nome, int idade, String matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    // Métodos getter e setter para matrícula
    String getMatricula() {
        return matricula;
    }

    void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    // Método para exibir a matrícula
    void mostrarMatricula() {
        System.out.println("Matrícula: " + matricula);
    }

    // Sobrescrita do método dizerOla para personalizar a saudação
    @Override
    void dizerOla() {
        System.out.println("Olá, sou estudante e meu nome é " + getNome());
    }
}

public class Main {
    public static void main(String[] args) {
        // Criação de um objeto Estudante e chamada dos métodos
        Estudante estudante = new Estudante("Magnus", 20, "2024002");
        estudante.dizerOla();
        estudante.mostrarMatricula();
    }
}
