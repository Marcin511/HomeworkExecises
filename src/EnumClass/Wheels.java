package EnumClass;

public class Wheels {
    private float size;
   private TypeTires nameOfWheels;

    public Wheels(float size, TypeTires nameOfWheels) {
        this.size = size;
        this.nameOfWheels = nameOfWheels;

    }
    enum TypeTires{
        WINTER,
        SUMMER,
        UNIVERSAL
    }

    @Override
    public String toString() {
        return "Wheels{" +
                "size=" + size +
                ", nameOfWheels='" + nameOfWheels + '\'' +
                '}';
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public TypeTires getNameOfWheels() {
        return nameOfWheels;
    }

    public void setNameOfWheels(TypeTires nameOfWheels) {
        this.nameOfWheels = nameOfWheels;
    }
}
