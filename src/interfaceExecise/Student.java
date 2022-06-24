package interfaceExecise;

public abstract class Student implements Scholarship{
    String name;
    String lastName;
     float []marks;

    public Student(String name, String lastName, float[] marks) {
        this.name = name;
        this.lastName = lastName;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public float[] getMarks() {
        return marks;
    }

    public float[] setMarks(float[] marks) {
        this.marks = marks;
        return marks;
    }



}
