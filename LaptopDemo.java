

class Laptop {
    int amount = 50000;
    String name = "lenovo";

    Laptop() {
        System.out.println("laptop");
    }

    void display() {
        System.out.println(name);
        System.out.println(amount);
    }
}

class Dell1 extends Laptop {
    Dell1() {
        System.out.println("dell");
    }
}

public class LaptopDemo {
    public static void main(String args[]) {
        Dell1 obj = new Dell1();

        System.out.println(obj.name);
        System.out.println(obj.amount);
        obj.display();
    }
}