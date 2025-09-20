package edu.simulacao.pokemon;

import java.util.List;
import java.util.Random;

public class Batalha {
    private Treinador treinador1;
    private Treinador treinador2;
    private int turno;

    public Batalha(Treinador t1, Treinador t2) {
        this.treinador1 = t1;
        this.treinador2 = t2;
        this.turno = 1;
    }

    public void iniciar() {
        System.out.println("Batalha entre " + treinador1.getNome() + " e " + treinador2.getNome() + " começou!");
        // Simulação de 5 turnos
        while (turno <= 5) {
            System.out.println("\n--- Turno " + turno + " ---");
            registrarTurno();
            turno++;
        }
        System.out.println("Batalha encerrada!");
    }

    private void registrarTurno() {
        // Escolhe um Pokémon aleatório de cada treinador
        Pokemon p1 = escolherPokemon(treinador1);
        Pokemon p2 = escolherPokemon(treinador2);

        if (p1 == null || p2 == null) {
            System.out.println("Um dos treinadores não tem Pokémon para batalhar!");
            return;
        }

        // Escolhe uma habilidade aleatória de cada Pokémon
        Habilidade h1 = escolherHabilidade(p1);
        Habilidade h2 = escolherHabilidade(p2);

        if (h1 != null) h1.usar(p1, p2);
        if (h2 != null) h2.usar(p2, p1);

        System.out.println(p1.getNome() + " Vida: " + p1.getVida());
        System.out.println(p2.getNome() + " Vida: " + p2.getVida());
    }

    private Pokemon escolherPokemon(Treinador t) {
        List<Pokemon> pokemons = t.getPokemons();
        if (pokemons.isEmpty()) return null;
        return pokemons.get(new Random().nextInt(pokemons.size()));
    }

    private Habilidade escolherHabilidade(Pokemon p) {
        List<Habilidade> habilidades = p.getHabilidades();
        if (habilidades.isEmpty()) return null;
        return habilidades.get(new Random().nextInt(habilidades.size()));
    }
}
