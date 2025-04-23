package principal.Ejercicio2;

import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class Titulo extends JFrame implements ActionListener {

    private JLabel etiqueta1;
    private JTextField txtPedir;
    private JOptionPane panel;
    private JButton boton;

    public Titulo() {
        super("Reemplazar título");
        this.setLayout(new FlowLayout());

        etiqueta1 = new JLabel("Escribe el nuevo título");
        this.add(etiqueta1);
        
        txtPedir = new JTextField(10);
        txtPedir.addActionListener(this);
        this.add(txtPedir);
        
        boton = new JButton("Cambiar el título");
        boton.addActionListener(this);
        this.add(boton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int respuesta = JOptionPane.showConfirmDialog(null, "Cambiar el título actual a \"" + txtPedir.getText() + "\"?" , "Confirmación",
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (respuesta == JOptionPane.YES_OPTION) {
            setTitle(txtPedir.getText());
        }
    }
}
