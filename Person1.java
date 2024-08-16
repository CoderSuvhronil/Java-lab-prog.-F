class Person1 {
    Person1() {
        System.out.println("Person Constructor with zero arguments");
    }

    Person1(String name) {
        System.out.println("Person Constructor with one argument: " + name);
    }

    Person1(String name, int age) {
        System.out.println("Person Constructor with two arguments: " + name + ", " + age);
    }
}

class Employee extends Person1 {
    Employee() {
        System.out.println("Employee Constructor with zero arguments");
    }

    Employee(String name) {
        super(name);
        System.out.println("Employee Constructor with one argument: " + name);
    }

    Employee(String name, int age) {
        super(name, age);
        System.out.println("Employee Constructor with two arguments: " + name + ", " + age);
    }
}

class Manager extends Employee {
    Manager() {
        System.out.println("Manager Constructor with zero arguments");
    }

    Manager(String name) {
        super(name);
        System.out.println("Manager Constructor with one argument: " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Creating Manager with zero arguments:");
        Manager manager1 = new Manager();

        System.out.println("\nCreating Manager with one argument:");
        Manager manager2 = new Manager("Alice");
    }
}
