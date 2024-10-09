public class Teacher extends Person {
    private double salary;
    private String subjectsTaught;

    public Teacher(int id, String name, String phoneNumber, String email, String role, double salary, String subjectsTaught) {
        super(id, name, phoneNumber, email, role);
        this.salary = salary;
        this.subjectsTaught = subjectsTaught;
    }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    public String getSubjectsTaught() { return subjectsTaught; }
    public void setSubjectsTaught(String subjectsTaught) { this.subjectsTaught = subjectsTaught; }

    @Override
    public String toString() {
        return super.toString() + ", Salary: " + salary + ", Subjects: " + subjectsTaught;
    }
}
