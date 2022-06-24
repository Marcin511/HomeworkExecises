package iterator.iterator;

public class FootballTeam {
    private String name;
    private String lastName;
    private Position position;

    public FootballTeam(String name, String lastName, Position position) {
        this.name = name;
        this.lastName = lastName;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "FootballTeam{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", position=" + position +
                '}';
    }
}
enum Position{
    NAPASTNIK,
    BRAMKARZ,
    OBRONA,
    POMOCNIK,
}