import java.util.Scanner;

class PrimeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input: A single integer N.");
        int N = scanner.nextInt();
        scanner.close();

        StringBuilder primes = new StringBuilder();
        int count = 0;
        int num = 2;

        OuterLoop:
while (count < N) {
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    num++;
                    continue OuterLoop; 
                }
            }
            primes.append(num).append(" ");
            count++;
            num++;
        }

        System.out.println("Output: " + primes.toString().trim());
    }
}