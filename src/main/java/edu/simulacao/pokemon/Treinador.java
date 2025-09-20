package edu.simulacao.pokemon;

import java.util.ArrayList;
import java.util.List;

public class Treinador {
    private String nome;
    private int idade;
    private List<Pokemon> pokemons;
    private List<Item> itens;

    public Treinador(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.pokemons = new ArrayList<>();
        this.itens = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void capturarPokemon(Pokemon p) {
        pokemons.add(p);
        System.out.println(nome + " capturou " + p.getNome());
    }

    public void listarPokemons() {
        System.out.println("Pokémons de " + nome + ":");
        for (Pokemon p : pokemons) {
            System.out.println(" - " + p.getNome() + " (Nível " + p.getNivel() + ", Vida " + p.getVida() + ")");
        }
    }

    public void adicionarItem(Item item) {
        itens.add(item);
        System.out.println(nome + " recebeu o item " + item.getNome());
    }

    public void usarItem(Item item, Pokemon p) {
        if (itens.contains(item)) {
            System.out.println(nome + " usa " + item.getNome() + " em " + p.getNome());
            item.aplicar(p);
            itens.remove(item);
        } else {
            System.out.println(nome + " não possui o item " + item.getNome());
        }
    }
}
