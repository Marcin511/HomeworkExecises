package GenericType;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Car {
    private String name;
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Car(String name, String type) {
        this.name = name;
        this.type = type;

    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public static void main(String[] args) {

        Queue<Car> carList = new LinkedList<>();
        carList.add(new Car("kia","hatchback"));
        carList.add(new Car("Ford", "combi"));
        carList.add(new Car("skoda","liftback"));
        Iterator<Car> carIterator = carList.iterator();
        while(carIterator.hasNext()){
            System.out.println(carIterator.next());
        }

    }
}
