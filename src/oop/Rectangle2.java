package oop;

import java.util.Arrays;
import java.util.List;

public class Rectangle2 {
    private int a;
    private int b;

    public Rectangle2(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public static void main(String[] args) {
        List<Rectangle> users = Arrays.asList(new Rectangle(4,4),new Rectangle(6,8));
        users.stream().map((Rectangle r)->{
            return r.getA()*r.getB();
        }).filter((Integer square)->{
            return square > 30;
        }).forEach((Integer square1)->{
            System.out.println(square1);
        });
    }
}

