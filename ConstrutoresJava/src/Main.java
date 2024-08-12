class Pessoa {
    String nome;  // Atributo para armazenar o nome da pessoa
    int idade;    // Atributo para armazenar a idade da pessoa

    // Construtor da classe Pessoa que inicializa os atributos nome e idade
    Pessoa(String nome, int idade) {
        this.nome = nome;  // 'this.nome' se refere ao atributo 'nome' da instância atual
        this.idade = idade; // 'this.idade' se refere ao atributo 'idade' da instância atual
    }
}

public class Main {
    public static void main(String[] args) {
        // Criação de um objeto do tipo Pessoa, passando "Maria" como nome e 30 como idade
        Pessoa pessoa = new Pessoa("Maria", 30);

        // Exibe o nome da pessoa no console
        System.out.println("Nome: " + pessoa.nome);

        // Exibe a idade da pessoa no console
        System.out.println("Idade: " + pessoa.idade);
    }
}
