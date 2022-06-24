package EnumClass;

public class Engine {
    private EngineType type;
    private double capacity;
    private int power;
enum EngineType{
    DIESEL,
    PETROL,
    HYBRID,
    LPG,
    ELECTRIC
}
    public Engine(EngineType type, double capacity, int power) {
        this.type = type;
        this.capacity = capacity;
        this.power = power;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "type='" + type + '\'' +
                ", capacity=" + capacity +
                ", power=" + power +
                '}';
    }

    public EngineType getType() {
        return type;
    }

    public void setType(EngineType type) {
        this.type = type;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
