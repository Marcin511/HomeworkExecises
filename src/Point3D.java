import java.util.Arrays;

public class Point3D extends Point2D {
    private float z;
    public Point3D(float x, float y,float z) {
        super(x, y);
        this.z=z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    @Override
    public float[] getXY() {
        super.getXY();
        float[]tabXYZ = new float[3];
        tabXYZ[0] = getX();
        tabXYZ[1] = getY();
        tabXYZ[2] = getZ();
        return tabXYZ;
    }

    @Override
    public void setXY() {
        super.setXY();
        System.out.println("podaj wartość z");
        setZ(s.nextFloat());
    }

    @Override
    public void showPoint() {
        super.showPoint();
        System.out.println(Arrays.toString(getXY()));
    }
}
