package movableShapes;
import java.util.Scanner;
public class MovableCircle implements Movable {
    private float r;
    MovablePoint movablePoint;

    public MovableCircle(float r,MovablePoint movablePoint) {
        this.r = r;
        this.movablePoint = new MovablePoint(0,0,0,0);
    }

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }

    public double lineModule() {
        double moduleX = Math.pow((movablePoint.getSpeedX() - movablePoint.getX()), 2);
        double moduleY = Math.pow((movablePoint.getSpeedY() - movablePoint.getY()), 2);
        double module = Math.sqrt(moduleX + moduleY);
        return module;
    }
    public void crossCircle(){
        Scanner s = new Scanner(System.in);
        System.out.println("podaj promień okręgu");
        setR(s.nextFloat());
        if (lineModule() < 2*getR()){
            System.out.println("nowy przemieszczony okrąg przecinają się z okregmiem przed przemieszczeniem w dwóch punktach");
        }else if (lineModule() == 2*getR()){
            System.out.println("okregi sa styczne");
        }else{
            System.out.println("oktegi nie przecinają się");
        }
    }

    @Override
    public float moveUp() {

        return 0;
    }

    @Override
    public float moveDown() {

        return 0;
    }

    @Override
    public float moveLeft() {

        return 0;
    }

    @Override
    public float moveRight() {

        return 0;
    }

    public static void main(String[] args) {
        MovablePoint movablePoint =  new MovablePoint(0,0,0,0);
        MovableCircle movableCircle = new MovableCircle(0,movablePoint);
        movablePoint.showPoint();
        movablePoint.movePoint();
        movablePoint.showPoint();
        movableCircle.movablePoint.movePoint();
        movableCircle.movablePoint.showPoint();
        movableCircle.lineModule();
        movableCircle.crossCircle();
        System.out.println("odległość między środkami okręgów wynosi :" + movableCircle.lineModule());
    }
}