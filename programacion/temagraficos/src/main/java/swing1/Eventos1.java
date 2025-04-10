package swing1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Eventos1 extends JFrame implements ActionListener{
    // Declaración de los componentes
    private JLabel etiqueta1;
    private JButton boton1;

    // Constructor
    public Eventos1() {
        super("Controlando eventos I");
        this.setLayout(new FlowLayout());

        // Botón
        boton1 = new JButton("¡¡Púlsame!!");
        boton1.addActionListener(this);
        this.add(boton1);

        // Etiqueta
        etiqueta1 = new JLabel("Aún no has pulsado el botón");
        this.add(etiqueta1);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        etiqueta1.setText("Botón pulsado");
    }

}
