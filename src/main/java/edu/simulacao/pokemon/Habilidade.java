package edu.simulacao.pokemon;

public class Habilidade {
    private String nome;
    private int poder;
    private TipoPokemon tipo;

    public Habilidade(String nome, int poder, TipoPokemon tipo) {
        this.nome = nome;
        this.poder = poder;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public int getPoder() {
        return poder;
    }

    public TipoPokemon getTipo() {
        return tipo;
    }

    // Ataca outro Pokemon
    public void usar(Pokemon atacante, Pokemon alvo) {
        int vidaAntes = alvo.getVida();
        int dano = calcularDano(atacante, alvo);
        alvo.receberDano(dano);

        System.out.println(atacante.getNome() + " usou " + nome + " em " +
                           alvo.getNome() + ". Vida: " + vidaAntes + " -> " + alvo.getVida());
    }

    private int calcularDano(Pokemon atacante, Pokemon alvo) {
        int dano = poder;

        if (this.tipo == TipoPokemon.FOGO && alvo.getTipo() == TipoPokemon.GRAMA) {
            dano *= 2;
        } else if (this.tipo == TipoPokemon.AGUA && alvo.getTipo() == TipoPokemon.FOGO) {
            dano *= 2;
        }

        return dano;
    }
}
