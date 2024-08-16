class Parent {
    void printParent() {
        System.out.println("This is parent class");
    }
}

class Child extends Parent {
    void printChild() {
        System.out.println("This is child class");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();

        // 1. Method of parent class by the object of the Parent class
        parent.printParent();

        // 2. Method of child class by the object of Child class
        child.printChild();

        // 3. Method of parent class by the object of Child class
        child.printParent();
    }
}
