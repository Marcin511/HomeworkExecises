package interfaceExecise;

public class SchoolStudent extends Student{
    public SchoolStudent(String name, String lastName, float[] marks) {
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
        int sum = 0;
        float medium = 0;
        for(int i = 0;i< marks.length-1;i++) {
            sum += marks[i];

            }medium = sum/ getMarks().length;
        if (medium <= 5.2) {
        }return true;
    }
}
