public class Looping {
    public static void main(String[] args){
        int x = 0;
        int y = 0;

        // for looping
        for (int i = 0; i < 3; i++){
            System.out.println("for looping");
        }

        System.out.println();

        // do while looping
        do {
            System.out.println("do while looping"); 
            x++;
        } while (x < 3);

        System.out.println();

        // while looping
        while (y < 3){
            System.out.println("While looping");
            y++;
        }
    }
}
