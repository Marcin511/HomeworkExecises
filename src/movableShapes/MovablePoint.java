package movableShapes;
import java.util.Arrays;
import java.util.Scanner;
public class MovablePoint implements Movable {
    private float x;
    private float y;
    private float speedX;
    private float speedY;

    public MovablePoint(float x, float y, float speedX, float speedY) {
        this.x = x;
        this.y = y;
        this.speedX = speedX;
        this.speedY = speedY;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getSpeedX() {
        return speedX;
    }

    public void setSpeedX(float speedX) {
        this.speedX = speedX;
    }

    public float getSpeedY() {
        return speedY;
    }

    public void setSpeedY(float speedY) {
        this.speedY = speedY;
    }

    public float[] point() {
        float[] firstPoint = new float[2];
        firstPoint[0] = getX();
        firstPoint[1] = getY();
        return firstPoint;
    }

    @Override
    public float moveUp() {
        float Up = getSpeedY() + getY();
        return Up;
    }

    @Override
    public float moveDown() {
        float Down = getSpeedY() + getY();
        return Down;
    }

    @Override
    public float moveLeft() {
        float Left = getSpeedX() + getX();
        return Left;
    }

    @Override
    public float moveRight() {
        float Right = getSpeedX() + getX();

        return Right;
    }

    public float[] movePoint() {
        Scanner s = new Scanner(System.in);
        System.out.println("podaj przesunięcie x");
        setSpeedX(s.nextFloat());
        System.out.println("podaj przesunięcie y");
        setSpeedY(s.nextFloat());
        float [] newPoint = new float[2];
        if (getSpeedY() > 0) {
           newPoint[1] = moveUp();
        } else {
            newPoint[1] = moveDown();
        }
        if (getSpeedX() > 0) {
            newPoint[0] = moveRight();
        } else {
            newPoint[0] = moveLeft();
        }
        System.out.println("obecny punkt to " + Arrays.toString(newPoint));
    return newPoint;
    }
public void showPoint(){
    System.out.println("obecny punkt to " + Arrays.toString(point()));

}

}
