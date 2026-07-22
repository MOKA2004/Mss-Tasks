class Employee {

    public void work() {
        System.out.println("Employee is working");
    }

    public int getSalary() {
        return 30000;
    }
}

public class Q2  {
    public static void main(String[] args) {
        Employee e = new Employee();

        e.work();
        System.out.println("Salary = " + e.getSalary());
    }
}