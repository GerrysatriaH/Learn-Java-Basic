public class expression{
    //expression = operators (+, -, *, /, %) and operands (values or numbers)

    public static void main(String[] args){
        int x = 20;
        int y = 10;

        // increment
        x++;
        System.out.println(x);

        // decrement
        y--;
        System.out.println(y);

        System.out.println(x + y); // Operasi Penjumlahan
        System.out.println(x - y); // Operasi Pengurangan
        System.out.println(x * y); // Operasi Perkalian

        double z = (double) x / y; // Operasi Pembagian
        System.out.println(z);

        int s = x % y; // Operasi Sisa bagi
        System.out.println(s);
    }
}