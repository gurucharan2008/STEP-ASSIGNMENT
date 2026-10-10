/**
 * M3. Employee Profile Creation
 * Constructors & Constructor Chaining
 */
class Employee {
    String empId;
    String empName;
    double salary;
    boolean isIntern;

    // Constructor for permanent employees
    public Employee(String empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.isIntern = false;
    }

    // Constructor for interns - chains via this(...)
    public Employee(String empId, String empName) {
        this(empId, empName, 0);  // chain to 3-arg constructor with salary 0
        this.isIntern = true;     // then set isIntern to true
    }

    void printProfile() {
        System.out.println(empId + " | " + empName + " | Rs " + salary + " | Intern: " + isIntern);
    }
}

public class M3_Employee {
    public static void main(String[] args) {
        // Permanent employee
        Employee permanent = new Employee("E-101", "Divya", 65000);
        permanent.printProfile();

        // Intern (uses constructor chaining)
        Employee intern = new Employee("E-102", "Arjun");
        intern.printProfile();
    }
}
