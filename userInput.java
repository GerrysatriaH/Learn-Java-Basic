import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        // Scanner digunakan untuk membuat input user
        try (Scanner userInput = new Scanner(System.in)) {
            System.out.println("What is your name ?");
            String name = userInput.nextLine();
            System.out.println("How old are you ?");
            int age = userInput.nextInt();
            userInput.nextLine();
            
            System.out.println("What is your favourite color ?");
            String color = userInput.nextLine();

            System.out.println("Hi, " + name);
            System.out.println("You are " + age + " years old");
            System.out.println("And your favourite color is " + color);
        }
    }
}
