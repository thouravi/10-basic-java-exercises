//Factorial Calculator: Write a program that calculates the factorial of a number.
import java.util.Scanner;

public class Factorial {
    public static void  main(String[] args) {
        System.out.print("Enter a Number to calculate it's factorial: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int result = 1;
        for (int i = 1; i < n; i++) {
            result += result * i;
        }
        System.out.println("Factorial of " + n + " is: " + result);
    }
}
