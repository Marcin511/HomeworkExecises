package EnumClass;

public class Car {
    String type;
    Engine engine;
    Wheels wheels;

    public Car(String type, Engine engine, Wheels wheels) {
        this.type = type;
        this.engine = new Engine(Engine.EngineType.DIESEL, 1.8,150);
        this.wheels = new Wheels(15.1f, Wheels.TypeTires.SUMMER);
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", engine=" + engine +
                ", wheels=" + wheels +
                '}';
    }

    public static void main(String[] args) {
        Engine engine = new Engine(Engine.EngineType.DIESEL,1.8,150);
        Wheels wheels = new Wheels(15.1f, Wheels.TypeTires.WINTER);
        Car car = new Car("kia", engine, wheels);
        System.out.println(car);
    }
}
