import java.util.Random;

public class randomNumber {
    public static void main(String[] args){
        Random random = new Random();
        // Random digunakan untuk membuat random number generator
        int Number = random.nextInt(11);

        System.out.println(Number);
    }
}
