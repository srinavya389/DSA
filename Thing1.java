class Thing {
    // private static count field
    private static int count = 0;

    // constructor increments the count
    public Thing() {
        count++;
    }

    // public static method to get the count
    public static int getCount() {
        return count;
    }
}

public class Thing1 {
    public static void main(String[] args) {
        // create several Thing objects
        Thing t1 = new Thing();
        Thing t2 = new Thing();
        Thing t3 = new Thing();

        // print the total number of objects created
        System.out.println("Things created: " + Thing.getCount());
    }
}