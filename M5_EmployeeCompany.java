/**
 * M5. Employee and Company Information Management
 * Static Members
 */
class Employee {
    // Instance fields
    String empName;
    double salary;

    // Static fields shared by every employee
    static String companyName = "Bright Horizon Technologies";
    static int employeeCount = 0;

    // Constructor - increments employeeCount every time
    Employee(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;
        employeeCount++;
    }

    // Static method - must not reference any instance field
    static void printCompanyInfo() {
        System.out.println(companyName);
        System.out.println("Employees on record: " + employeeCount);
    }
}

public class M5_EmployeeCompany {
    public static void main(String[] args) {
        // Create three Employee objects
        Employee e1 = new Employee("Alice", 45000);
        Employee e2 = new Employee("Bob", 52000);
        Employee e3 = new Employee("Charlie", 48000);

        // Call printCompanyInfo() through the class name, not through any object
        Employee.printCompanyInfo();
    }
}
