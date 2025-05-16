package principal.boletin1.Ejercicio3;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class Coloreo extends JFrame implements ActionListener {

    private JButton btnAmarillo;
    private JButton btnAzul;
    private JButton btnAleatorio;

    public Coloreo() {
        super("Colores");
        this.setLayout(null);

        btnAmarillo = new JButton("Amarillo");
        btnAmarillo.addActionListener(this);
     //   btnAmarillo.setVisible(true);
        btnAmarillo.setBounds(5, 80, 100, 35);
        this.add(btnAmarillo);

        btnAzul = new JButton("Azul");
        btnAzul.addActionListener(this);
      //  btnAzul.setVisible(true);
        btnAzul.setBounds(143, 80, 100, 35);
        this.add(btnAzul);

        btnAleatorio = new JButton("Aleatorio");
        btnAleatorio.addActionListener(this);
    //    btnAleatorio.setVisible(true);
        btnAleatorio.setBounds(280, 80, 100, 35);
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
        if (e.getSource() == btnAleatorio) {
            this.setLocation((int) ((Math.random()* 201) + 400),(int) ((Math.random()* 201) + 400));
        }
        if (e.getSource() == btnAleatorio && (e.getModifiers() & ActionEvent.SHIFT_MASK)
        ==ActionEvent.SHIFT_MASK) {
            this.setLocation(0,0);
            btnAleatorio.setLocation((int) (Math.random()* this.getContentPane().getWidth() - btnAleatorio.getWidth()),(int) (Math.random()* this.getContentPane().getHeight() - btnAleatorio.getHeight()));
        }
        }
}
