package edu.simulacao.pokemon;

public class App {
    public static void main(String[] args) {

        // ==========================
        // CRIA TREINADORES
        // ==========================
        Treinador ash = new Treinador("Ash", 15);
        Treinador misty = new Treinador("Misty", 16);

        // ==========================
        // CRIA POKÉMONS
        // ==========================
        Pokemon pikachu = new Pokemon("Pikachu", TipoPokemon.ELETRICO, 5, 100);
        Pokemon charmander = new Pokemon("Charmander", TipoPokemon.FOGO, 5, 90);
        Pokemon staryu = new Pokemon("Staryu", TipoPokemon.AGUA, 5, 80);
        Pokemon bulbasaur = new Pokemon("Bulbasaur", TipoPokemon.GRAMA, 5, 95);

        // ==========================
        // ADICIONA HABILIDADES
        // ==========================
        Habilidade choque = new Habilidade("Choque do Trovão", 20, TipoPokemon.ELETRICO);
        Habilidade brasa = new Habilidade("Brasa", 25, TipoPokemon.FOGO);
        Habilidade jatoAgua = new Habilidade("Jato d'Água", 15, TipoPokemon.AGUA);
        Habilidade folhaNavalha = new Habilidade("Folha Navalha", 18, TipoPokemon.GRAMA);

        pikachu.adicionarHabilidade(choque);
        charmander.adicionarHabilidade(brasa);
        staryu.adicionarHabilidade(jatoAgua);
        bulbasaur.adicionarHabilidade(folhaNavalha);

        // ==========================
        // CAPTURA POKEMONS
        // ==========================
        ash.capturarPokemon(pikachu);
        ash.capturarPokemon(charmander);

        misty.capturarPokemon(staryu);
        misty.capturarPokemon(bulbasaur);

        // ==========================
        // CRIA ITENS
        // ==========================
        Item potion = new ItemCura("Potion", "Restaura 20 de vida", 20);
        Item superPotion = new ItemCura("Super Potion", "Restaura 50 de vida", 50);
        Item pedraTrovão = new ItemEvolucao("Pedra do Trovão", "Faz o Pokémon evoluir");

        ash.adicionarItem(potion);
        ash.adicionarItem(pedraTrovão);

        misty.adicionarItem(superPotion);

        // ==========================
        // USA ITENS
        // ==========================
        ash.usarItem(potion, pikachu);
        ash.usarItem(pedraTrovão, charmander);

        misty.usarItem(superPotion, bulbasaur);

        // ==========================
        // LISTA POKEMONS
        // ==========================
        ash.listarPokemons();
        misty.listarPokemons();

        // ==========================
        // INICIA BATALHA
        // ==========================
        Batalha batalha = new Batalha(ash, misty);
        batalha.iniciar();
    }
}
