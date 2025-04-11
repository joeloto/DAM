package principal.Ejercicio1;

import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class Dado extends JFrame implements ActionListener{
    
    private JLabel etiqueta1;
    private JButton boton1;

    public Dado() {
        super("Lanzamiento de dado");
        this.setLayout(new FlowLayout());
        boton1 = new JButton("Lanzar");
        boton1.addActionListener(this);
        this.add(boton1);
        etiqueta1 = new JLabel("");
        this.add(etiqueta1);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        etiqueta1.setText("Resultado:" + (int) (Math.random()*7 + 1));
    }
}
