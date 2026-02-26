class Parent {
    String name = "Parent";
}

class Child extends Parent {
    String name = "Child";

    void printNames() {
        // local variable
        String name = "Local";

        System.out.println("Local name: " + name);
        System.out.println("this.name (Child): " + this.name);
        System.out.println("super.name (Parent): " + super.name);
    }
}

public class first {
    public static void main(String[] args) {
        Child c = new Child();
        c.printNames();
    }
}