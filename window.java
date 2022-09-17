import javax.swing.JFrame;

public class window {
    public static void Jendela() {
        JFrame newWindow = new JFrame();
        newWindow.setTitle("Learn GUI Java Swing");
        newWindow.setSize(800, 400);
        newWindow.setVisible(true);
    }

    public static void main(String[] args){
        Jendela();
    }
}

/* Jframe digunakan untuk membuat frame atau window
 * setTitle digunakan untuk membuat judul pada frame atau window
 * setSize digunakan untuk mengatur ukuran dari frame atau window
 * setVisible digunakan untuk mengatur apakah frame akan ditampilkan atau tidak.
 */