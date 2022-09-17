import java.util.Scanner;

public class mathClass{
    double x;
    double y;
    double z;
    double v;

    public static Scanner userInput = new Scanner(System.in);

    //Operasi Pengakaran
    public static void mathSqrt(){
        System.out.print("Enter side x : ");
        double sideX = userInput.nextDouble();
        System.out.print("Enter side y : ");
        double sideY = userInput.nextDouble();

        double sideZ = Math.sqrt((sideX*sideX)+(sideY*sideY));
        System.out.println("Side Z : " + sideZ);
    }

    //Mengetahui angka terkecil
    public static void mathMin(){
        System.out.print("Enter first number : ");
        double x = userInput.nextDouble();
        System.out.print("Enter second number : ");
        double y = userInput.nextDouble();

        double z = Math.min(x, y);
        double v = Math.max(x, y);
        System.out.println(z + " is Smaller than " + v);
    }

    //Mengetahui angka terbesar
    public static void mathMax(){
        System.out.print("Enter first number : ");
        double x = userInput.nextDouble();
        System.out.print("Enter second number : ");
        double y = userInput.nextDouble();

        double z = Math.min(x, y);
        double v = Math.max(x, y);
        System.out.println(v + " is Bigger than " + z);
    }

    //Mengubah angka bulat menjadi angka absolute
    public static void mathAbs(){
        System.out.print("Enter number : ");
        double x = userInput.nextDouble();

        double z  = Math.abs(x);
        System.out.println(x + " change into " + z);
    }

    //Membulatkan angka
    public static void mathRound(){
        System.out.print("Enter number : ");
        double x = userInput.nextDouble();

        double z  = Math.round(x);
        System.out.println(x + " change into " + z);
    }

    //Membulatkan angka ke atas
    public static void mathCeil(){
        System.out.print("Enter number : ");
        double x = userInput.nextDouble();

        double z  = Math.ceil(x);
        System.out.println(x + " change into " + z);
    }

    //Membulatkan angka ke bawah
    public static void mathFloor(){
        System.out.print("Enter number : ");
        double x = userInput.nextDouble();

        double z  = Math.floor(x);
        System.out.println(x + " change into " + z);
    }

    public static void main(String[] args){
        boolean close = false;
        while(close != true) {
            System.out.print("\t Math Class \n [1] Math.sqrt \n [2] Math.min \n [3] Math.max \n [4] Math.ceil \n [5] Math.floor \n \n [6] Math.abs \n [7] Math.round [8] EXIT \n Select your Option : ");
            String option = userInput.nextLine();

            switch(option){
                case "1":
                    mathSqrt();
                    break;
                case "2":
                    mathMin();
                    break;
                case "3":
                    mathMax();
                    break;
                case "4":
                    mathCeil();
                    break;
                case "5":
                    mathFloor();
                    break;
                case "6":
                    mathAbs();
                    break;
                case "7":
                    mathRound();
                    break;
                case "8":
                    System.out.println();
                    close = true;
                    break;
                default:
                    System.out.println();
                    System.out.println("invalid option");
                    break;
            } 
        }
    }
}