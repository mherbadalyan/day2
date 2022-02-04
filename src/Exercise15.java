import java.util.Random;

public class Exercise15 {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt();
        boolean isOdd = num % 2 != 0;
        System.out.println(num + " is odd : " + isOdd);
    }
}
