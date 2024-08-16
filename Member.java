class Member {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Employee extends Member {
    String specialization;
}

class Manager extends Member {
    String department;
}

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "John";
        employee.age = 30;
        employee.phoneNumber = "1234567890";
        employee.address = "123 Elm Street";
        employee.salary = 50000;
        employee.specialization = "Software Engineering";

        Manager manager = new Manager();
        manager.name = "Alice";
        manager.age = 45;
        manager.phoneNumber = "0987654321";
        manager.address = "456 Oak Avenue";
        manager.salary = 80000;
        manager.department = "IT Department";

        System.out.println("Employee Details:");
        System.out.println("Name: " + employee.name);
        System.out.println("Age: " + employee.age);
        System.out.println("Phone Number: " + employee.phoneNumber);
        System.out.println("Address: " + employee.address);
        employee.printSalary();

        System.out.println("\nManager Details:");
        System.out.println("Name: " + manager.name);
        System.out.println("Age: " + manager.age);
        System.out.println("Phone Number: " + manager.phoneNumber);
        System.out.println("Address: " + manager.address);
        manager.printSalary();
    }
}
