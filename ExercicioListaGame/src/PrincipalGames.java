import java.util.ArrayList;
import java.util.List;

public class PrincipalGames {

    public static void main(String[] args) {
        // Criar uma lista para armazenar jogos
        List<Games> listaDeGames = new ArrayList<>();

        // Adicionar alguns jogos à lista
        listaDeGames.add(new Games("God Of War", "Kratos, o Deus da Guerra", 1));
        listaDeGames.add(new Games("The Last of Us", "Sobrevivência em um mundo pós-apocalíptico", 2));
        listaDeGames.add(new Games("Red Dead Redemption 2", "Vida de fora da lei no Velho Oeste", 3));

        // Exibir informações sobre cada jogo na lista
        for (Games game : listaDeGames) {
            System.out.println("Título: " + game.getTitulo());
            System.out.println("Descrição: " + game.getDescricao());
            System.out.println("Número: " + game.getNumeroGame());
            System.out.println();
        }
    }
}
