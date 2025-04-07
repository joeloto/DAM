package swing1;

import java.awt.BorderLayout;

import javax.swing.*;

public class FrmPrincipal extends JFrame {
    public FrmPrincipal() {
        setLayout(null);
        // Ojo, no ordenaremos así el código, esto es solo como ejemplo
        JLabel etiqueta1 = new JLabel("Etiqueta Uno");
        JLabel etiqueta2 = new JLabel("Etiqueta Dos");
        JButton boton1 = new JButton("Aceptar");
        JButton boton2 = new JButton("Cancelar");

        etiqueta1.setLocation(0, 0);
        etiqueta2.setLocation(100, 0);
        boton1.setLocation(0, 100);
        boton2.setLocation(100, 100);
        etiqueta1.setSize(100,20);
        etiqueta2.setSize(100,20);

        this.add(etiqueta1, BorderLayout.NORTH);
        this.add(etiqueta2, BorderLayout.SOUTH);
        this.add(boton1, BorderLayout.EAST);
        this.add(boton2, BorderLayout.WEST);
    }

}
