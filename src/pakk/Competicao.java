package pakk;

public abstract class Competicao {
    protected String nome;
    protected int numeroDeRodadas;
    protected Jogo tipoJogo; // Tipo de jogo (CSGO, Valorant, LOL)

    public Competicao(String nome, int numeroDeRodadas, Jogo tipoJogo) {
        this.nome = nome;
        this.numeroDeRodadas = numeroDeRodadas;
        this.tipoJogo = tipoJogo;
    }

    public abstract void calcularPontuacao(int pontosEquipe1, int pontosEquipe2);

    public Jogo getTipoJogo() {
        return tipoJogo;
    }

    public void setTipoJogo(Jogo tipoJogo) {
        this.tipoJogo = tipoJogo;
    }

    @Override
    public String toString() {
        return "Competição de " + tipoJogo + " - " + nome;
    }
}

