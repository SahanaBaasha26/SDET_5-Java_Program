package classRoomSession;

class Employee {
    private String name;
    private int age;

    // Constructor to initialize name and age
    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }
}

public class EmployeeArray {
    public static void main(String[] args) {
        // Create an array of Employee objects with predefined details
        Employee[] employeeArr = new Employee[10];

        // Predefined employee details
        String[] names = {
        		"Aamee", "abi", "Chitra", "David", "Hasmina",
                "Ram", "Grace", "Raji", "ravi", "Jack"


        };

        int[] ages = { 25, 30, 35, 40, 45, 28, 33, 38, 27, 32 };

        // Initialize the employee array with predefined details
        for (int i = 0; i < 10; i++) {
            employeeArr[i] = new Employee(names[i], ages[i]);
        }

        // Display employee details
        System.out.println("Employee Details:");

        for (int i = 0; i < 10; i++) {
            Employee employee = employeeArr[i];
            System.out.println("Employee " + (i + 1) + " - Name: " + employee.getName() + ", Age: " + employee.getAge());
        }
    }
}
