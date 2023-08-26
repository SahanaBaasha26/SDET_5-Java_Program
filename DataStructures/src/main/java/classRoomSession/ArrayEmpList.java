package classRoomSession;

import java.util.ArrayList;

public class ArrayEmpList {
    public static void main(String[] args) {
        // Create an ArrayList to store employee details
        ArrayList<Employee> employeeList = new ArrayList<>();

        // Add employee objects to the ArrayList
        employeeList.add(new Employee("John", 30));
        employeeList.add(new Employee("Alice", 25));
        employeeList.add(new Employee("Bob", 28));

        // Iterate through the ArrayList and print employee details
        for (Employee employee : employeeList) {
            System.out.println("Name: " + employee.getName() + ", Age: " + employee.getAge());
        }
    }
}