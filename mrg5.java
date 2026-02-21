import java.util.Scanner;

public class mrg5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);   // Create Scanner object

        System.out.print("Enter input: ");
        String input = sc.nextLine();          // Read user input

        if(input.equals("dell")) {             // Check if input equals "dell"
            System.out.println("dell");        // Print output
        }

        sc.close();                            // Close scanner
    }
}