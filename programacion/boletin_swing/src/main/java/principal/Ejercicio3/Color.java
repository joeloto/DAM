package principal.Ejercicio3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Color extends JFrame implements ActionListener{
    
    private JButton botonAmarillo;
    private JButton botonRojo;
    private JButton botonAzul;

    public Color() {
        super("Colores");
        this.setLayout(null);
        
        botonAmarillo = new JButton("Amarillo");
        botonAmarillo.addActionListener(this);
        this.add(botonAmarillo);

        botonAzul = new JButton("Azul");
        botonAzul.addActionListener(this);
        this.add(botonAzul);

        botonRojo = new JButton("Rojo");
        botonRojo.addActionListener(this);
        this.add(botonRojo);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
