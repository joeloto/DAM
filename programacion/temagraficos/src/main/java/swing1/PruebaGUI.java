package swing1;
import javax.swing.*;

public class PruebaGUI {
    public static void main(String[] args) {
        EventosRaton frame = new EventosRaton();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
