//Palindrome Checker: Write a program that takes a string as input and outputs whether the string is a palindrome or not.
import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        System.out.print("Enter a string to check Palindrome:");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        boolean isPalindrome = true;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("String is palindrome.");
        } else {
            System.out.println("String is not palindrome.");
        }
    }
}
