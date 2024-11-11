package EmployeeClassImplementation;
import GenericMyListImplemenation.MyList;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Employee {
    private String id;
    private String name;
    private int age;
    private Date dateOfJoining;

    // Constructor
    public Employee(String id, String name, int age, Date dateOfJoining) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.dateOfJoining = dateOfJoining;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(Date dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    // Override toString() for better representation
    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return String.format("Employee[id=%s, name=%s, age=%d, joinDate=%s]",
                id, name, age, dateFormat.format(dateOfJoining));
    }
}

// Example usage class
class EmployeeListDemo {
    public static void main(String[] args) {
        // Create a new MyList to store Employee objects
        MyList<Employee> employeeList = new MyList<>();

        // Create some sample employees
        Employee emp1 = new Employee("E001", "Harpreet Kaur", 30, new Date());
        Employee emp2 = new Employee("E002", "Sanjay Singh", 28, new Date());
        Employee emp3 = new Employee("E003", "Mangal Sharma", 35, new Date());

        // Add employees to the list
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);

        // Print all employees
        System.out.println("All Employees:");
        for (int i = 0; i < employeeList.size(); i++) {
            System.out.println(employeeList.get(i));
        }

        // Delete an employee by index
        System.out.println("\nDeleting employee at index 1...");
        employeeList.deleteByIndex(1);
        System.out.println("After deletion by index:");
        for (int i = 0; i < employeeList.size(); i++) {
            System.out.println(employeeList.get(i));
        }

        // Delete an employee by value
        System.out.println("\nDeleting employee with ID E003...");
        employeeList.deleteByValue(emp3);
        System.out.println("After deletion by value:");
        for (int i = 0; i < employeeList.size(); i++) {
            System.out.println(employeeList.get(i));
        }

        // Add a new employee
        System.out.println("\nAdding a new employee...");
        Employee emp4 = new Employee("E004", "Shubham Kumar", 32, new Date());
        employeeList.add(emp4);
        System.out.println("After adding new employee:");
        for (int i = 0; i < employeeList.size(); i++) {
            System.out.println(employeeList.get(i));
        }
    }
}