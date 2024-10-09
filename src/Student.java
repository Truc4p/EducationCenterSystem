public class Student extends Person {
    private String gradeLevel;

    public Student(int id, String name, String phoneNumber, String email, String role, String gradeLevel) {
        super(id, name, phoneNumber, email, role);
        this.gradeLevel = gradeLevel;
    }

    public String getGradeLevel() { return gradeLevel; }
    public void setGradeLevel(String gradeLevel) { this.gradeLevel = gradeLevel; }

    @Override
    public String toString() {
        return super.toString() + ", Grade Level: " + gradeLevel;
    }
}
