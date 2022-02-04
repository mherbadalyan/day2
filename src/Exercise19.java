import java.util.Scanner;

public class Exercise19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1 = scanner.nextInt();

        System.out.println("Enter number 2");
        int num2 = scanner.nextInt();

        System.out.println("Numbers before swap" +
                "\nNumber 1 = " + num1 +
                "\nNumber 2 = " + num2+"\n");
        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("Numbers after swap" +
                "\nNumber 1 = " + num1 +
                "\nNumber 2 = " + num2);
    }
}
