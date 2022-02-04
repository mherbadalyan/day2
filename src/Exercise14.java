import java.util.Random;

public class Exercise14 {
    public static void main(String[] args) {
        Random random = new Random();
        int num = 15 + random.nextInt(30);
        System.out.println(num);
    }
}
