package pakk;

import java.util.ArrayList;
import java.util.List;

public class CampeonatoImpl implements Campeonato {
    private List<Competicao> competicoes;
    private List<Equipe> equipes;

    public CampeonatoImpl() {
        competicoes = new ArrayList<>();
        equipes = new ArrayList<>();
    }

    @Override
    public void iniciarCampeonato() {
        System.out.println("Iniciando o campeonato...");
        // Exibe as competições iniciadas
        for (Competicao competicao : competicoes) {
            System.out.println("Competição iniciada: " + competicao.toString());
        }
    }

    @Override
    public void registrarResultado(int rodada, String equipe1, int pontosEquipe1, String equipe2, int pontosEquipe2) {
        System.out.println("Resultado da rodada " + rodada + ":");
        System.out.println("Equipe 1: " + equipe1 + " - " + pontosEquipe1 + " pontos");
        System.out.println("Equipe 2: " + equipe2 + " - " + pontosEquipe2 + " pontos");

        
        for (Competicao competicao : competicoes) {
            competicao.calcularPontuacao(pontosEquipe1, pontosEquipe2);
        }
    }

    @Override
    public void exibirClassificacao() {
      
        System.out.println("Classificação do campeonato:");
        
    }

    public void adicionarCompeticao(Competicao competicao) {
        competicoes.add(competicao);
    }

    public void adicionarEquipe(Equipe equipe) {
        equipes.add(equipe);
    }
}

