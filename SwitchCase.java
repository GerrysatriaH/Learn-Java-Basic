import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);

        System.out.println("----- Menu -----");
        System.out.println("[1] Pizza \n [2] Burger \n [3] Fried Rice \n [4] Fried Chicken \n [5] Another Food");
        System.out.println("Pick one your favourite food from above : ");
        String choose = userInput.nextLine();

        switch(choose){
            case "1":
                System.out.println(" Your favourite food is Pizza");
                break;
            case "2":
                System.out.println(" Your favourite food is Burger");
                break;
            case "3":
                System.out.println(" Your favourite food is Fried RRice");
                break;
            case "4":
                System.out.println(" Your favourite food is Fried Chicken");
                break;
            case "5":
                System.out.println("Enter your favourite food name : ");
                String food = userInput.nextLine();
                System.out.println(" Your favourite food is " + food);
                break;
            default:
                System.out.println("doesn't exist");
        }

        userInput.close();
    }
}
