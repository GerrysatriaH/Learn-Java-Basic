package practice;

/* a = 10 and b = 5, 
 * value a = 5 and value b = 10 ?
*/

public class variable_practice{
    public static void main(String[] args){
        int a = 10;
        int b = 5;
        int temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println(" a = " + a + " and b = " + b);
    }
}