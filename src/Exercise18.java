import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 digit number");
        int num = scanner.nextInt();
        System.out.println("Sum of 3 digit" + " = " + (num / 100 + num % 100 / 10 + num % 10));
    }
}
