import javax.swing.JOptionPane;

public class OptionPane{
    public static void main(String[] args){
        String name = JOptionPane.showInputDialog("Enter your name : ");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age : "));

        JOptionPane.showMessageDialog(null, "Hello " + name + "\n" + "You are " + age + " years old");
    }
}

/*JOptionPane = digunakan untuk membuat panel pilihan
 *showInputDialog = digunakan untuk membuat jendela input atau dialog input
 *showMessageDialog = digunakan untuk menampilkan jendela pesan atau dialog pesan
 *parseInt = digunakan untuk mengkonversi string menjadi integer
 */