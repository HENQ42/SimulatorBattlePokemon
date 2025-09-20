package edu.simulacao.pokemon;

public class ItemEvolucao extends Item {

    public ItemEvolucao(String nome, String efeito) {
        super(nome, efeito);
    }

    @Override
    public void aplicar(Pokemon p) {
        p.evoluir();
        System.out.println(getNome() + " usado em " + p.getNome() + ". Pokémon evoluiu!");
    }
}
