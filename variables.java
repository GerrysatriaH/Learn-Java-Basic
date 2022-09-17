public class variables {
    public static void main(String[] args) {
        // declaration
        int v;
        // assignment
        v = 123;
        // initialization
        int w = 456;

        long x = 12345678L;
        float y = 3.14f;
        double z = 6.16;

        System.out.println("- Number");
        System.out.println(" v = " + v);
        System.out.println(" w = " + w);
        System.out.println(" x = " + x);
        System.out.println(" y = " + y);
        System.out.println(" z = " + z + "\n");

        boolean a = true;
        char b = '$';
        String s = "world !";

        System.out.println("- boolean");
        System.out.println(a + "\n");

        System.out.println("- character/string");
        System.out.println(b);
        System.out.println("Hello " + s);
    }
}