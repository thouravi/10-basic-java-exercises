//Prime Number Checker: Write a program that takes a number as an input and outputs whether the number is prime or not.
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.print("Enter a number to check if prime:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        if (n < 2) {
            System.out.println("number is not prime.");
            return;
        }

        boolean isPrime = true;
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if(isPrime) {
            System.out.println("Number is prime.");
        } else {
            System.out.println("Number is not prime.");
        }
    }
}
