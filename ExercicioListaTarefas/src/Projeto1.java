public class Projeto1 {
    public static void main(String[] args) {
        System.out.println("Iniciei");

        ListaTarefas tarefas = new ListaTarefas();
        Tarefa t1 = new Tarefa("Acordar", "Abrir os olhos");

        tarefas.adicionarTarefa(t1);
        tarefas.adicionarTarefa(new Tarefa("Levantar da cama", "Tomar banho"));

        t1.completar();

        System.out.println("Tarefas após completar 'Acordar':");
        tarefas.listar();

        tarefas.limpar();

        System.out.println("Tarefas após Acordar:");
        tarefas.listar();
    }
}
