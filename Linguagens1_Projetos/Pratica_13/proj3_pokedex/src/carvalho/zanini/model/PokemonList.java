package carvalho.zanini.model;

import java.util.List;

public class PokemonList {
    private List<Pokemon> pokemonList;
    private int pokemonActual;

    public PokemonList(List<Pokemon> pokemonList) {
        this.pokemonList = pokemonList;
        this.pokemonActual = 0;
    }

    public final Pokemon getActualPokemon(){
        return pokemonList.get(pokemonActual);
    }

    public boolean switchToPreviousPokemon(){
        if (pokemonActual > 0) {
            pokemonActual--;
            return true;
        }
        return false;
    }

    public boolean switchToNextPokemon(){
        if (pokemonActual < (pokemonList.size()-1)) {
            pokemonActual++;
            return true;
        }
        return false;
    }
}
