public class arrays {
    // arrays = digunakan untuk menyimpan multiple value dari satu variable
    public static void main(String[] args){
        // String[] food = {"Pizza", "Burger", "Hotdog"};

        String[] food = new String[3];
        food[0] = "Pizza";
        food[1] = "Burger";
        food[2] = "Hotdog";

        for(int i = 0; i < 3; i++){
            System.out.println(food[i]);
        }
    }
}
