package pakk;

import java.util.ArrayList;
import java.util.List;

public class Jogador {
    private String nome;
    private String equipe;
    public List<Jogador> jogadores;

    public Jogador(String nome, String equipe) {
        this.nome = nome;
        this.equipe = equipe;
        this.jogadores = new ArrayList<>();
    }

    public void adicionarJogador(Jogador jogador) {
        jogadores.add(jogador);
    }

    public String getNome() {
        return nome;
    }

    public String getEquipe() {
        return equipe;
    }

    public void exibirJogador() {
        for (Jogador jogador : jogadores) {
            System.out.println("Nome: " + jogador.getNome() + ", Equipe: " + jogador.getEquipe());
        }
    }
}
