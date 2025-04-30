package principal.Ejercicio3;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class Coloreo extends JFrame implements ActionListener {

    private static java.awt.Color BLUE;
    private static java.awt.Color YELLOW;
    private JButton btnAmarillo;
    private JButton btnAzul;
    private JButton btnAleatorio;

    public Coloreo() {
        super("Colores");
        this.setLayout(new FlowLayout());

        btnAmarillo = new JButton("Amarillo");
        btnAmarillo.addActionListener(this);
        this.add(btnAmarillo);

        btnAzul = new JButton("Azul");
        btnAzul.addActionListener(this);
        this.add(btnAzul);

        btnAleatorio = new JButton("Aleatorio");
        btnAleatorio.addActionListener(this);
        this.add(btnAleatorio);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAmarillo) {
            this.getContentPane().setBackground(Color.YELLOW);
        }
        if (e.getSource() == btnAzul) {
            this.getContentPane().setBackground(Color.BLUE);
        }
        
    }
}
