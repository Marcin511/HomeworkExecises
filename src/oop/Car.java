package oop;

import java.util.Arrays;
import java.util.List;

public class Car {
    private String carName;
    private int Speed;

    public Car(String carName, int speed) {
        this.carName = carName;
        Speed = speed;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getSpeed() {
        return Speed;
    }

    public void setSpeed(int speed) {
        Speed = speed;
    }

    public static void main(String[] args) {
        List<Car> car = Arrays.asList(new Car("VW",250),new Car ("Audi", 300));
        car.stream().forEach((Car carSpeed) -> {
            System.out.println(carSpeed.getSpeed());
        });
    }
}
