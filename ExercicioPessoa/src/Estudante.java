public class Estudante extends Pessoa{
    private String curso;
    private String matricula;
    
    public Estudante(String nome, int idade, String curso, String matricula) {
        super(nome, idade);
        this.curso = curso;
        this.matricula = matricula;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    
    public String getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}