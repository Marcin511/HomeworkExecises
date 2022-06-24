package iterator_2.iterator_2;

public interface PokemonCollection {
    PokemonCollectionIterator getIterator();
}

interface PokemonCollectionIterator {
    boolean hashNext();
    Pokemon next();
    boolean hasPrev();
    Pokemon prev();
}
