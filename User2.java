class Singleton {

    // Step 1: Create a private static instance
    private static Singleton instance = new Singleton();

    // Step 2: Make constructor private
    private Singleton() {
        // Prevent instantiation from outside
    }

    // Step 3: Provide public static getInstance() method
    public static Singleton getInstance() {
        return instance;
    }
}

public class Main {
    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        // Step 4: Compare both references
        System.out.println(s1 == s2);
    }
}