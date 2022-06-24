package iterator_2.iterator_2;

public class Pokemon {
    private final String name;
    private final int level;

    public Pokemon(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "name='" + name + '\'' +
                ", level=" + level +
                '}';
    }
}

