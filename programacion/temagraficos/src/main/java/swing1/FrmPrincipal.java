package swing1;

import java.awt.FlowLayout;

import javax.swing.*;

public class FrmPrincipal extends JFrame {

    JLabel lbl;

    public FrmPrincipal() {
        super("imagen");
        setLayout(new FlowLayout());
        lbl = new JLabel();
        lbl.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/img/dexter.jpg")));
        add(lbl);
    }
    // public FrmPrincipal() {
    // setLayout(null);
    // JLabel etiqueta1 = new JLabel("Etiqueta Uno");
    // // etiqueta1.setLocation(0, 0);
    // // etiqueta1.setSize(100,20);
    // etiqueta1.setBounds(0,0,100,20);
    // this.add(etiqueta1, BorderLayout.NORTH);

    // JLabel etiqueta2 = new JLabel("Etiqueta Dos");
    // etiqueta2.setLocation(100, 0);
    // etiqueta2.setSize(100,20);
    // this.add(etiqueta2, BorderLayout.SOUTH);

    // JButton boton1 = new JButton("Aceptar");
    // boton1.setLocation(0, 100);
    // boton1.setSize(100,20);
    // this.add(boton1, BorderLayout.EAST);

    // JButton boton2 = new JButton("Cancelar");
    // boton2.setLocation(100, 100);
    // boton1.setSize(100,20);
    // this.add(boton2, BorderLayout.WEST);

    // }

}
