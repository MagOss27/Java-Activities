public class ExercicioPessoa {

    public static void main(String[] args) {
        Estudante estudante = new Estudante("Victor",19,"Desenvolvimento de Sistemas", "1734");
        System.out.println("Nome: " + estudante.getNome());
        System.out.println("Idade: " + estudante.getIdade());
        System.out.println("Curso: " + estudante.getCurso());
        System.out.println("Matrícula: " + estudante.getMatricula());
    }
}