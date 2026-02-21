import java.util.Scanner;
public class PalindromeBuilder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read input string
        String input = sc.nextLine();

        // Create StringBuilder with input string
        StringBuilder sb = new StringBuilder(input);

        // Reverse StringBuilder
        sb.reverse();

        // Convert reversed StringBuilder to String
        String reversed = sb.toString();

        // Compare original string with reversed string
        if (input.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

        sc.close();
    }
}