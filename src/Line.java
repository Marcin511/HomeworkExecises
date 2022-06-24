import java.util.Arrays;

public class Line extends Point2D{
    private float x1;
    private float y1;
    public Line(float x, float y,float x1,float y1) {
        super(x, y);
    }
    public double lineModule(){
        double moduleX = Math.pow((getX1()-getX()),2);
        double moduleY = Math.pow((getY1()-getY()),2);
        double module = Math.sqrt(moduleX+moduleY);
        return module;
    }
    public double[] lineMiddle(){
        double middleX = (getX1()-getX())/2;
        double middleY = (getY1()-getY())/2;
        double []middle = new double[2];
        middle[0] = middleX;
        middle[1] = middleY;
        return middle;
    }

    public float getX1() {
        return x1;
    }

    public void setX1(float x1) {
        this.x1 = x1;

    }

    public float getY1() {
        return y1;
    }

    public void setY1(float y1) {
        this.y1 = y1;

    }
    public void setX1Y1(){
        setXY();
        System.out.println("podaj punkt x końcowy :");
        setX1(s.nextFloat());
        System.out.println("podaj punkt y końcowy :");
        setY1(s.nextFloat());
    }
    public float[] getX1Y1(){
        float []tabX1Y1 = new float[2];
        tabX1Y1[0] = getX1();
        tabX1Y1[1] = getY1();
        return tabX1Y1;
    }

    @Override
    public void showPoint() {
        System.out.print("początkowe punkty odcinka to ");
        super.showPoint();
        System.out.println("koncowe punkty odcinka to " + Arrays.toString(getX1Y1()));
        System.out.println("długośś linii pomiędzy punktami  = "+ lineModule());
        System.out.println("wspólżędne środka linii to " + Arrays.toString(lineMiddle()));
    }
}
