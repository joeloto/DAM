package principal.boletin1.Ejercicio2;

import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

import boletin_tema5.ejercicio4.Ejercicio4;

public class Titulo extends JFrame implements ActionListener, ItemListener{

    private JLabel etiqueta1;
    private JTextField txtPedir;
    private JButton boton;
    private JCheckBox chkReves;
    private JCheckBox chkEliminar;

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

        chkReves = new JCheckBox("Título del réves");
        this.add(chkReves);

        chkEliminar = new JCheckBox("Desactivar campo de texto");
        chkEliminar.addItemListener(this);
        this.add(chkEliminar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int respuesta = JOptionPane.showConfirmDialog(null, "Cambiar el título actual a \"" + txtPedir.getText() + "\"?" , "Confirmación",
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (respuesta == JOptionPane.YES_OPTION) {
            setTitle(txtPedir.getText());
        }
        if (chkReves.isSelected()) {
            setTitle(Ejercicio4.alReves(txtPedir.getText()));
        } 
    }
    
    @Override
    public void itemStateChanged(ItemEvent e) {
        // if (chkEliminar.isSelected()) {//reto: sin if en 1 linea
        //     txtPedir.setEditable(false);
        // } else {
        //     txtPedir.setEditable(true);
        // }
        txtPedir.setEditable(!chkEliminar.isSelected());
    }
}
