//Reverse String: Write a program that takes a string as input and outputs the reverse of the string.
import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        System.out.print("Enter a string to reverse: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        StringBuilder reverse = new StringBuilder();
        for (int i = s.length() -1; i >= 0; i--) {
            reverse.append(s.charAt(i));
        }
        System.out.println("The reverse of the string is: " + reverse);
    }
}
