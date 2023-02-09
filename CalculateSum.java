import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.print("Enter Two Numbers:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int sum = a + b;
        System.out.println("Sum of "+a+" and " +b+ " is: "+sum);
    }
}
