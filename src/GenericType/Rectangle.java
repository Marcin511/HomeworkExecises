package GenericType;

public class Rectangle implements Shape {
    private final int a;
    private final int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle: " + a + ", " + b);
    }
}