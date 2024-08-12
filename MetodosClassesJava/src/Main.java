class Pessoa {
    String nome;
    int idade;

    // Construtor da classe Pessoa
    Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade; // Adicionei a linha para inicializar a idade
    }

    // Método para exibir a mensagem de saudação
    void dizerOla() {
        System.out.println("Hello, my name is " + nome + ". I am " + idade + " years old.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Criação de uma instância da classe Pessoa
        Pessoa pessoa = new Pessoa("Magnus", 20);
        
        // Chamada do método dizerOla para exibir a mensagem
        pessoa.dizerOla();
    }
}
