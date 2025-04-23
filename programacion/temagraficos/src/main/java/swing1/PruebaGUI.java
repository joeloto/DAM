package swing1;

import javax.swing.*;

public class PruebaGUI {
    public static void main(String[] args) {
        //FrmPrincipal frame = new FrmPrincipal();

        //Eventos2 frame = new Eventos2();
         CajasTexto frame = new CajasTexto();
        //Botones frame = new Botones();
        //TimerSwing frame = new TimerSwing();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // System.out.println("Ahora lanzo otro");
        // FrmPrincipal frame2 = new FrmPrincipal();
        // frame2.setSize(100,200);
        // frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame2.setVisible(true);

        // System.out.println("Fin del main");
    }
}
