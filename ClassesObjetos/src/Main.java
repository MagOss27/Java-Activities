class Pessoa {
    String nome;
    int idade;
    String cidade;
    String estadoCivil;
}

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Magnus Oss";
        pessoa.idade = 20;
        pessoa.cidade = "Florianópolis";
        pessoa.estadoCivil = "Solteiro";

        System.out.println("Nome: " + pessoa.nome);
        System.out.println("Idade: " + pessoa.idade);
        System.out.println("Cidade Atual: " + pessoa.cidade);
        System.out.println("Estado Civil: " + pessoa.estadoCivil);
    }
}