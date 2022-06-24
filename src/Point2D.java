import java.util.Arrays;
import java.util.Scanner;
import java.math.MathContext;

public class Point2D {
    private float x;
    private float y;
    Scanner s = new Scanner(System.in);

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }
    public float getY() {
        return y;
    }
    public float[] getXY(){
        float []tabXY = new float[2];
        tabXY[0] = getX();
        tabXY[1] = getY();
        return tabXY;
    }
    public void setX(float x){

        this.x=x;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(){
        System.out.println("podaj wartośc x");
       setX(s.nextFloat());
        System.out.println("podaj wartosc y");
        setY(s.nextFloat());
    }
    public void showPoint(){
        System.out.println(Arrays.toString(getXY()));
    }

}
