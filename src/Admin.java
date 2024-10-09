public class Admin extends Person {
    private String employmentType;

    public Admin(int id, String name, String phoneNumber, String email, String role, String employmentType) {
        super(id, name, phoneNumber, email, role);
        this.employmentType = employmentType;
    }

    public String getEmploymentType() { return employmentType; }
    public void setEmploymentType(String employmentType) { this.employmentType = employmentType; }

    @Override
    public String toString() {
        return super.toString() + ", Employment Type: " + employmentType;
    }
}
