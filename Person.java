class Person {
    Person() {
        System.out.println("Person Constructor");
    }

    void nationality() {
        System.out.println("Nationality: Indian");
    }

    void birthPlace() {
        System.out.println("Birthplace: Mumbai");
    }
}

class Employee extends Person {
    Employee() {
        System.out.println("Employee Constructor");
    }

    void organisationName() {
        System.out.println("Organisation: XYZ Corp");
    }

    void workPlace() {
        System.out.println("Workplace: Bangalore");
    }
}

class Manager extends Employee {
    Manager() {
        System.out.println("Manager Constructor");
    }

    void noOfSubordinates() {
        System.out.println("Number of Subordinates: 10");
    }

    void managingPlace() {
        System.out.println("Managing Place: Delhi");
    }
}

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();

        System.out.println("\nManager Details:");
        manager.nationality();
        manager.birthPlace();
        manager.organisationName();
        manager.workPlace();
        manager.noOfSubordinates();
        manager.managingPlace();
    }
}
