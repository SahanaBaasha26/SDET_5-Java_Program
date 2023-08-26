package classRoomSession;

public class EmployeeDetails {
    public static void main(String[] args) {
        // Define the size of the employee array
        int numberOfEmployees = 10;

        // Create an array to store employee details
        Employee[] employees = new Employee[numberOfEmployees];

        // Populate the array with employee details
        employees[0] = new Employee("John", 30);
        employees[1] = new Employee("Jane", 25);
        employees[2] = new Employee("Bob", 35);
        employees[3] = new Employee("Alice", 28);
        employees[4] = new Employee("Eve", 22);
        employees[5] = new Employee("Charlie", 40);
        employees[6] = new Employee("Grace", 27);
        employees[7] = new Employee("David", 33);
        employees[8] = new Employee("Sophia", 29);
        employees[9] = new Employee("Michael", 31);

        // Print out the employee details
        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            System.out.println("Name: " + employees[i].getName());
            System.out.println("Age: " + employees[i].getAge());
            System.out.println();
        }
    }
}

// Define an Employee class to store employee details
class Employee{
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
