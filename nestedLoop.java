import java.util.Scanner;

public class nestedLoop {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter # of row: ");
        int row = userInput.nextInt();
        System.out.println("Enter # of column: ");
        int column = userInput.nextInt();
        System.out.println("Enter # of symbol: ");
        String symbol = userInput.next();

        for (int i = 0; i < row; i++){
            System.out.println();
            for (int j = 0; j < column; j++){
                System.out.print(symbol + "\n");
            }
        }

        userInput.close();
    }
}
