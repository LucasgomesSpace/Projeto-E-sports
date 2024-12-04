package pakk;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int i = 0;
        String cond;
        String nomes;
        String nao = "nao";

        Scanner sv = new Scanner(System.in);

        System.out.println("Equipe do Freitas");
        Equipe equipe1 = new Equipe("Equipe Freitas");

        while (i == 0) {
            System.out.println("Adicione um jogador (Nome)");
            nomes = sv.nextLine();
            Jogador jogador = new Jogador(nomes, "Equipe Freitas");
            jogador.adicionarJogador(jogador);
            System.out.println("Deseja adicionar mais um jogador ? (sim/nao)");
            cond = sv.nextLine();

            if (cond.equals(nao)) {
                i++;
            }

        }
        i = 0;
        System.out.println("Equipe do Lucas");
        Equipe equipe2 = new Equipe("Equipe do Lucas");

        while (i == 0) {
            System.out.println("Adicione um jogador (Nome)");
            nomes = sv.nextLine();
            Jogador jogador2 = new Jogador(nomes, "Equipe 2");
            jogador2.adicionarJogador(jogador2);
            System.out.println("Deseja adicionar mais um jogador ? (sim/nao)");
            cond = sv.nextLine();

            if (cond.equals(nao)) {
                i++;
            }

        }



        CampeonatoImpl campeonato = new CampeonatoImpl();
        campeonato.adicionarEquipe(equipe1);
        campeonato.adicionarEquipe(equipe2);

        CompeticaoEquipe competicaoEquipe = new CompeticaoEquipe("Campeonato de Equipe",10 , Jogo.CSGO);
        campeonato.adicionarCompeticao(competicaoEquipe);

        campeonato.iniciarCampeonato();
        campeonato.exibirClassificacao();

        System.out.println("-------------");
        System.out.println("Quantos pontos equipe "+equipe1.getNome()+" fez:");
        int pontos1 = sv.nextInt();
        System.out.println("Quantos pontos equipe "+equipe2.getNome()+" fez:");
        int pontos2 = sv.nextInt();
        campeonato.registrarResultado(1, equipe1.getNome(), pontos1, equipe2.getNome(), pontos2);
        sv.close();

    }
}
