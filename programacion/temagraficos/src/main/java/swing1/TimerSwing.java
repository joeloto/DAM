package swing1;

import java.awt.event.*;
import javax.swing.*;

public class TimerSwing extends JFrame implements ActionListener {
    JLabel tiempo;
    Timer temporizador;
    private int cont;

    public TimerSwing() {
        tiempo = new JLabel("0");
        add(tiempo);
        cont = 0;
        temporizador = new Timer(1000, this);
        temporizador.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        cont++;
        tiempo.setText(cont + "");
        if (cont == 10) {
            temporizador.stop();
        }
    }
}
