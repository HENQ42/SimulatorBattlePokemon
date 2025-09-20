package edu.simulacao.pokemon;

public class ItemCura extends Item {
    private int quantidadeCura;

    public ItemCura(String nome, String efeito, int quantidadeCura) {
        super(nome, efeito);
        this.quantidadeCura = quantidadeCura;
    }

    @Override
    public void aplicar(Pokemon p) {
        int vidaAtual = p.getVida();
        p.setVida(vidaAtual + quantidadeCura);
        System.out.println(getNome() + " aplicado em " + p.getNome() +
                           ". Vida: " + vidaAtual + " -> " + p.getVida());
    }
}
