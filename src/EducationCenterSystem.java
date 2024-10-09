import java.util.ArrayList;
import java.util.List;

public class EducationCenterSystem {
    private List<Person> people;

    public EducationCenterSystem() {
        this.people = new ArrayList<>();
    }

    public void addPerson(Person person) {
        people.add(person);
    }

    public void viewAllRecords() {
        for (Person person : people) {
            System.out.println(person);
        }
    }

    public void viewRecordsByRole(String role) {
        for (Person person : people) {
            if (person.getRole().equalsIgnoreCase(role)) {
                System.out.println(person);
            }
        }
    }

    public Person searchRecordByName(String name) {
        for (Person person : people) {
            if (person.getName().equalsIgnoreCase(name)) {
                return person;
            }
        }
        return null;
    }

    public Person searchRecordById(int id) {
        for (Person person : people) {
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }

    public void editRecord(int id, Person updatedPerson) {
        for (int i = 0; i < people.size(); i++) {
            if (people.get(i).getId() == id) {
                people.set(i, updatedPerson);
                return;
            }
        }
    }

    public void deleteRecord(int id) {
        people.removeIf(person -> person.getId() == id);
    }
}