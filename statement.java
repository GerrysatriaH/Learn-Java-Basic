import java.util.Scanner;

public class statement {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("How old are you ? ");
        int age = userInput.nextInt();

        if (age < 10){
            System.out.println("You are a Child");
        } else if (age >= 10 && age <= 18){
            System.out.println("You are a Teenager");
        } else if (age > 18){
            System.out.println("You are an Adult");
        } else if (age > 40){
            System.out.println("You are an Older");
        }
        userInput.close();
    }
}
