package oop;

import java.util.Arrays;
import java.util.List;

public class Car2 {
    private String carName;
    private int Speed;

    public Car2(String carName, int speed) {
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
        List<Car2> car = Arrays.asList(new Car2("VW",250),new Car2 ("Seat", 100),new Car2 ("skoda", 150));
        car.stream().map((Car2 carSpeed) -> {
            car.toString();
            return car;
        });


    }
}
