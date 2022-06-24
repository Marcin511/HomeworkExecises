package iterator_2.iterator_2;

public class PokemonExample {

    public static void main(String[] args) {
        Pokedex pokedex = new Pokedex();
        pokedex.addPokemon(new Pokemon("Pikachu", 1));
        pokedex.addPokemon(new Pokemon("Charizard", 3));
        pokedex.addPokemon(new Pokemon("Bulbasaur", 1));

        PokemonCollectionIterator iterator = pokedex.getIterator();

        while (iterator.hashNext()) {
            System.out.println(iterator.next());
        }

        while (iterator.hasPrev()) {
            System.out.println(iterator.prev());
        }
    }
}
