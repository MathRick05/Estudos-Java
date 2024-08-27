package Ex13;

import java.util.ArrayList;
import java.util.List;

public class Time {
    public String nome;
    public String tecnico;
    public int numeroDeJogadores;
    public List<String> jogadores;

    public Time(String nome, String tecnico, int numeroDeJogadores) {
        this.nome = nome;
        this.tecnico = tecnico;
        this.numeroDeJogadores = numeroDeJogadores;
        this.jogadores = new ArrayList<>();
    }

    public void adicionarJogador(String jogador) {
        if (jogadores.size() < numeroDeJogadores) {
            jogadores.add(jogador);
            System.out.println(jogador + " foi adicionado ao time " + nome);
        } else {
            System.out.println("O time já está completo.");
        }
    }

    public void removerJogador(String jogador) {
        if (jogadores.remove(jogador)) {
            System.out.println(jogador + " foi removido do time " + nome);
        } else {
            System.out.println(jogador + " não está no time.");
        }
    }
}

