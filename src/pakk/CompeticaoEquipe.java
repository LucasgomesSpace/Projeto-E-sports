package pakk;

public class CompeticaoEquipe extends Competicao {

    public CompeticaoEquipe(String nome, int numeroDeRodadas, Jogo tipoJogo) {
        super(nome, numeroDeRodadas, tipoJogo);
    }

    @Override
    public void calcularPontuacao(int pontosEquipe1, int pontosEquipe2) {
        
        if (pontosEquipe1 > pontosEquipe2) {
            System.out.println("Vitória da Equipe 1: " + pontosEquipe1 + " pontos.");
        } else if (pontosEquipe2 > pontosEquipe1) {
            System.out.println("Vitória da Equipe 2: " + pontosEquipe2 + " pontos.");
        } else {
            System.out.println("Empate!");
        }
    }
}
