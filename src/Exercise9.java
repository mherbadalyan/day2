import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        int lastDigit;
        if (num < 10) lastDigit = num;
        else lastDigit = num%10;
            System.out.println("Last digit of your number is "+lastDigit);
    }
}
