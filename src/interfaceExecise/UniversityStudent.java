package interfaceExecise;

public class UniversityStudent extends Student{
    public UniversityStudent(String name, String lastName, float[] marks) {
        super(name, lastName, marks);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getLastName() {
        return super.getLastName();
    }

    @Override
    public void setLastName(String lastName) {
        super.setLastName(lastName);
    }

    @Override
    public float[] getMarks() {
        return super.getMarks();
    }

    @Override
    public float[] setMarks(float[] marks) {
        super.setMarks(marks);
        marks = new float[]{5, 5, 3, 4, 2, 5, 6, 6, 3, 6};
        return marks;
    }


    @Override
    public boolean canGetScholarship() {
        return false;
    }
}
