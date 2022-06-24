package GenericType;

import java.util.Arrays;

public class Drawer <T extends Shape>{
    private T[] shapes;

    public Drawer(T[] shapes) {
        this.shapes = shapes;
    }

    public void drawAll() {
        for (T shape : shapes) {
            shape.draw();
        }
    }

    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[2];
        rectangles[0] = new Rectangle(10,20);
        rectangles[1] = new Rectangle(100, 200);
        Drawer<Rectangle> drawer = new Drawer<>(rectangles);
        drawer.drawAll();
        Circle[] circles = new Circle[2];
        circles[0] =  new Circle(10);
        circles[1] =  new Circle(12);
        Drawer<Circle> drawer1 =  new Drawer<>(circles);
        drawer1.drawAll();
    }
}
