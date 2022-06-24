package iterator_2.iterator_2;

import java.util.ArrayList;
import java.util.List;

public class Pokedex implements PokemonCollection {

    private final List<Pokemon> pokemons = new ArrayList<>();

    public void addPokemon(Pokemon pokemon) {
        this.pokemons.add(pokemon);
    }

    @Override
    public PokemonCollectionIterator getIterator() {
        return new PokedexIterator();
    }

    private class PokedexIterator implements PokemonCollectionIterator {
        private int position = 0;

        @Override
        public boolean hashNext() {
            return position < pokemons.size();
        }

        @Override
        public Pokemon next() {
            return pokemons.get(position++);
        }

        @Override
        public boolean hasPrev() {
            return position > 0;
        }

        @Override
        public Pokemon prev() {
            return pokemons.get(--position);
        }
    }
}
