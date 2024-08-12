class Pessoa {
    String nome;
    int idade;
    String profissao;

    // Construtor da classe Pessoa
    Pessoa(String nome, int idade, String profissao) {
        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
    }

    // Método para exibir a resposta formatada
    void trazerResposta() {
        System.out.println("Olá, meu nome é " + nome + ", tenho " + idade + " anos e sou um profissional de " + profissao + ".");
    }
}

public class Main {
    public static void main(String[] args) {
        // Criação de uma instância da classe Pessoa
        Pessoa pessoa = new Pessoa("Magnus", 20, "Tecnologia");
        
        // Chamada do método trazerResposta para exibir a mensagem
        pessoa.trazerResposta();
    }
}
