import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number 1");
        int num1 = sc.nextInt();

        System.out.println("Enter number 2");
        int num2 = sc.nextInt();

        System.out.println("Enter number 3");
        int num3 = sc.nextInt();

        int sum = num1 + num2 + num3;
        System.out.println(num1 + " + " + num2 + " + " + num3 + " = " + sum);

        double avarage = (double) sum / 3;
        System.out.println("Avarage = " + avarage);

    }
}
