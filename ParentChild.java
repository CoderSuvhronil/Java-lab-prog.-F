class ParentChild {
    private void printParent() {
        System.out.println("This is parent class");
    }

    public void accessParentMethod() {
        printParent();
    }
}

class Child extends ParentChild {
    void printChild() {
        System.out.println("This is child class");
    }
}

public class Main {
    public static void main(String[] args) {
        ParentChild parent = new ParentChild();
        Child child = new Child();

        // 1. Method of parent class by the object of the Parent class
        parent.accessParentMethod();

        // 2. Method of child class by the object of Child class
        child.printChild();

        // 3. Method of parent class by the object of Child class (This will cause an error)
        // child.printParent(); // Uncommenting this line will cause a compilation error
    }
}
