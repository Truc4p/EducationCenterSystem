import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EducationCenterSystem system = new EducationCenterSystem();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("------ Education Center System ------");
            System.out.println("1. Add New Record");
            System.out.println("2. View All Records");
            System.out.println("3. View Records by Group");
            System.out.println("4. Search Record");
            System.out.println("5. Edit Record");
            System.out.println("6. Delete Record");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("------ Add New Record ------");
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Phone Number: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Enter Role (Teacher, Admin, Student): ");
                    String role = scanner.nextLine();

                    Person person;
                    if (role.equalsIgnoreCase("Teacher")) {
                        System.out.print("Enter Salary: ");
                        double salary = scanner.nextDouble();
                        scanner.nextLine(); // Consume newline
                        System.out.print("Enter Subjects Taught: ");
                        String subjectsTaught = scanner.nextLine();
                        person = new Teacher(id, name, phoneNumber, email, role, salary, subjectsTaught);
                    } else if (role.equalsIgnoreCase("Admin")) {
                        System.out.print("Enter Employment Type: ");
                        String employmentType = scanner.nextLine();
                        person = new Admin(id, name, phoneNumber, email, role, employmentType);
                    } else if (role.equalsIgnoreCase("Student")) {
                        System.out.print("Enter Grade Level: ");
                        String gradeLevel = scanner.nextLine();
                        person = new Student(id, name, phoneNumber, email, role, gradeLevel);
                    } else {
                        System.out.println("Invalid role.");
                        break;
                    }
                    system.addPerson(person);
                    break;
                case 2:
                    System.out.println("------ View All Records ------");
                    system.viewAllRecords();
                    break;
                case 3:
                    System.out.println("------ View Records by Group ------");
                    System.out.print("Enter Role (Teacher, Admin, Student): ");
                    String group = scanner.nextLine();
                    system.viewRecordsByRole(group);
                    break;
                case 4:
                    System.out.println("------ Search Record ------");
                    System.out.print("Enter Name: ");
                    String searchName = scanner.nextLine();
                    Person foundPerson = system.searchRecordByName(searchName);
                    if (foundPerson != null) {
                        System.out.println(foundPerson.toString());
                    } else {
                        System.out.println("Record not found.");
                    }
                    break;
                case 5:
                    System.out.println("------ Edit Record ------");
                    System.out.print("Enter ID of the record to edit: ");
                    int editId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    Person editPerson = system.searchRecordById(editId);
                    if (editPerson != null) {
                        System.out.print("Enter new Name: ");
                        String newName = scanner.nextLine();
                        System.out.print("Enter new Phone Number: ");
                        String newPhoneNumber = scanner.nextLine();
                        System.out.print("Enter new Email: ");
                        String newEmail = scanner.nextLine();
                        System.out.print("Enter new Role (Teacher, Admin, Student): ");
                        String newRole = scanner.nextLine();

                        editPerson.setName(newName);
                        editPerson.setPhoneNumber(newPhoneNumber);
                        editPerson.setEmail(newEmail);
                        editPerson.setRole(newRole);

                        system.editRecord(editId, editPerson);
                    } else {
                        System.out.println("Record not found.");
                    }
                    break;
                case 6:
                    System.out.println("------ Delete Record ------");
                    System.out.print("Enter ID of the record to delete: ");
                    int deleteId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    system.deleteRecord(deleteId);
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }

        } while (choice != 7);

        scanner.close();
    }
}