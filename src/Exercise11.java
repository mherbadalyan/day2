import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1");
        int a = scanner.nextInt();
        System.out.println("Enter number 2");
        int b = scanner.nextInt();
        System.out.println("Remainder from a to b = " + a%b);
    }
}
