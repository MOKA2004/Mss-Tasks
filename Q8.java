class Person {
    private String firstName;
    private String lastName;

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

class Employee extends Person {
    private int employeeId;
    private String jobTitle;

    Employee(String firstName, String lastName, int employeeId, String jobTitle) {
        super(firstName, lastName);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    @Override
    public String getLastName() {
        return super.getLastName() +  " - " + jobTitle;
    }
}

public class Q8 {
    public static void main(String[] args) {
        Employee emp = new Employee("Ravi", "Teja", 101, "Software Engineer");

        System.out.println("First Name : " + emp.getFirstName());
        System.out.println("Last Name  : " + emp.getLastName());
        System.out.println("Employee ID: " + emp.getEmployeeId());
    }
}