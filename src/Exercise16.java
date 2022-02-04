import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 digit number");
        int num = scanner.nextInt();
        System.out.println("Second digit of " + num + " = " + num % 100 / 10);
    }
}
