class Employee {

    void work() {
        System.out.println("Working as an employee");
    }

    double getSalary() {
        return 50000.0;
    }
}

class HRManager extends Employee {

    
    void work() {
        System.out.println("Managing human resources");
    }

    void addEmployee() {
        System.out.println("Adding a new employee to the system.");
    }
}

public class Q4 {

    public static void main(String[] args) {

        HRManager mgr = new HRManager();

        mgr.work();
        mgr.addEmployee();
        System.out.println("Salary: " + mgr.getSalary());
    }
}