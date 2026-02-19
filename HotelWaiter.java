import java.util.Scanner;

public class HotelWaiter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mainChoice;

        while (true) {
            System.out.println("\n--- Welcome to Java Hotel ---");
            System.out.println("1. Idli");
            System.out.println("2. Dosa");
            System.out.println("3. Biryani");
            System.out.println("4. Drinks");
            System.out.println("Type 'full' to exit");

            System.out.print("Enter your choice: ");
            mainChoice = sc.nextLine();

            if (mainChoice.equalsIgnoreCase("full")) {
                System.out.println("Thank you 😊 Visit again!");
                break;
            }

            // IDLI MENU
            if (mainChoice.equals("1")) {
                System.out.println("\nIdli Types:");
                System.out.println("a. Plain Idli");
                System.out.println("b. Rava Idli");
                System.out.println("c. Kanchipuram Idli");
                System.out.print("Select Idli type: ");
                System.out.println("You ordered: " + sc.nextLine());
            }

            // DOSA MENU
            else if (mainChoice.equals("2")) {
                System.out.println("\nDosa Types:");
                System.out.println("a. Plain Dosa");
                System.out.println("b. Masala Dosa");
                System.out.println("c. Onion Dosa");
                System.out.print("Select Dosa type: ");
                System.out.println("You ordered: " + sc.nextLine());
            }

            // BIRYANI MENU
            else if (mainChoice.equals("3")) {
                System.out.println("\nBiryani Types:");
                System.out.println("a. Chicken Biryani");
                System.out.println("b. Mutton Biryani");
                System.out.println("c. Veg Biryani");
                System.out.print("Select Biryani type: ");
                System.out.println("You ordered: " + sc.nextLine());
            }

            // DRINKS MENU
            else if (mainChoice.equals("4")) {
                System.out.println("\nDrinks:");
                System.out.println("a. Tea");
                System.out.println("b. Coffee");
                System.out.println("c. Juice");
                System.out.print("Select Drink: ");
                System.out.println("You ordered: " + sc.nextLine());
            }

            else {
                System.out.println("Invalid choice. Try again.");
            }
        }

        sc.close();
    }
}
