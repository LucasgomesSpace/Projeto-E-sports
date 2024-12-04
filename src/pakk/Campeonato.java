package pakk;

public interface Campeonato {
    void iniciarCampeonato();
    void registrarResultado(int rodada, String equipe1, int pontosEquipe1, String equipe2, int pontosEquipe2);
    void exibirClassificacao();
}

