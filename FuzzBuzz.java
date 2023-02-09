// Write a program that outputs numbers from 1 to 100.
// For multiples of 3, the program should output "Fizz" instead of the number, and for multiples of 5, it should output "Buzz".
// For numbers that are multiples of both 3 and 5, it should output "FizzBuzz".
public class FuzzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
