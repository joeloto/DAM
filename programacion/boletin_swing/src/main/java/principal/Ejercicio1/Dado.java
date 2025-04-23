package principal.Ejercicio1;

import java.awt.FlowLayout;
import java.awt.event.*;
import java.util.InputMismatchException;

import javax.swing.*;

public class Dado extends JFrame implements ActionListener {

    private JLabel etiqueta1;
    private JLabel etiqueta2;
    private JButton boton1;
    private JTextField txtNum;
    private int valor;

    public Dado() {
        super("Lanzamiento de dado");
        this.setLayout(new FlowLayout());

        boton1 = new JButton("Lanzar");
        boton1.addActionListener(this);
        this.add(boton1);

        etiqueta1 = new JLabel("");
        this.add(etiqueta1);

        etiqueta2 = new JLabel("Escribe un número");
        this.add(etiqueta2);
        txtNum = new JTextField(7);
        txtNum.addActionListener(this);
        add(txtNum);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            valor = Integer.parseInt(txtNum.getText());
            if (valor <= 0) {
                etiqueta1.setText("Resultado: " + (int) (Math.random() * 6 + 1));
            } else {
                etiqueta1.setText("Resultado: " + (int) (Math.random() * valor + 1));
            }
        } catch (InputMismatchException | NumberFormatException ex) {
            etiqueta1.setText("Resultado: " + (int) (Math.random() * 6 + 1));
        }

    }
}
