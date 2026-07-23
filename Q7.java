class Person {
    private String firstName;
    private String lastName;

    // Constructor
    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getter methods
    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }
}

public class Q7 {
    public static void main(String[] args) {
        Person p = new Person("Ravi", "Teja");

        System.out.println("First Name: " + p.getFirstName());
        System.out.println("Last Name: " + p.getLastName());
    }
}