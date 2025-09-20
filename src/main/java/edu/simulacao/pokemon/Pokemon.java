package edu.simulacao.pokemon;

import java.util.ArrayList;
import java.util.List;

public class Pokemon {
    private String nome;
    private TipoPokemon tipo;
    private int nivel;
    private int vida;
    private List<Habilidade> habilidades;

    public Pokemon(String nome, TipoPokemon tipo, int nivel, int vida) {
        this.nome = nome;
        this.tipo = tipo;
        this.nivel = nivel;
        this.vida = vida;
        this.habilidades = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public TipoPokemon getTipo() {
        return tipo;
    }

    public int getNivel() {
        return nivel;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        if (vida < 0) {
            this.vida = 0;
        } else {
            this.vida = vida;
        }
    }

    public List<Habilidade> getHabilidades() {
        return habilidades;
    }

    public void adicionarHabilidade(Habilidade h) {
        habilidades.add(h);
        System.out.println(nome + " aprendeu a habilidade " + h.getNome());
    }

    // Ataca outro Pokemon com uma habilidade
    public void atacar(Pokemon alvo, Habilidade h) {
        if (!habilidades.contains(h)) {
            System.out.println(nome + " não conhece a habilidade " + h.getNome());
            return;
        }
        h.usar(this, alvo);
    }

    public void receberDano(int dano) {
        setVida(this.vida - dano);
    }

    public void evoluir() {
        nivel += 1;
        vida += 20;
        System.out.println(nome + " evoluiu! Nível: " + nivel + ", Vida: " + vida);
    }
}
