import java.util.Scanner;

public class logicalOperator {
    public static void main(String[] args){
        // logical operators = used to connect two or more expressions
        // && (AND) = both conditions must be true
        // || (OR) = either condition must be true
        // ! (NOT) = reverses boolean value of condition

        Scanner userInput = new Scanner(System.in);

        System.out.println("You are still in a game ! Are you sure to quit a game ? [Y/N]");

        String confirm = userInput.next();

        if (confirm.equals("Y") || confirm.equals("y")){
            System.out.println("You are out of the game");
        } else if (confirm.equals("N") || confirm.equals("n")){
            System.out.println("You are stiil in the game");
        } else {
            System.out.println("Invalid Option");
        }
        userInput.close();
    }
}