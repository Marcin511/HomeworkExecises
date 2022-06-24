package GenericType;

public class Circle implements Shape{
    private final int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public void draw() {
        System.out.println("Circle: " + r);
    }
}


