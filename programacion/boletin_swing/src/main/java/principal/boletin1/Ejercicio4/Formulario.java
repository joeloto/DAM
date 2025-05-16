package principal.boletin1.Ejercicio4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Formulario extends JFrame implements ActionListener {

 
    private JLabel lblNombre;
    private JLabel lblEdad;
    private JLabel lblDir;
    private JTextField txfNombre;
    private JTextField txfEdad;
    private JTextField txfDir;
    private JButton btnGuardar;
    private JButton btnCargar;

    public Formulario() {
        super("Formulario");
        setLayout(null);
        lblNombre = new JLabel("Nombre:");
        lblNombre.setSize(100, 35);
        lblNombre.setVisible(true);
        this.add(lblNombre);
        txfNombre = new JTextField();
        txfNombre.setBounds(60, 0, 100, 35);
        txfNombre.setVisible(true);
        this.add(txfNombre);

        lblEdad = new JLabel("Edad:");
        lblEdad.setBounds(0, 50, 100, 35);
        lblEdad.setVisible(true);
        this.add(lblEdad);
        txfEdad = new JTextField();
        txfEdad.setBounds(60, 50, 100, 35);
        txfEdad.setVisible(true);
        this.add(txfEdad);

        lblDir = new JLabel("Dirección:");
        lblDir.setBounds(0, 100, 100, 35);
        lblDir.setVisible(true);
        this.add(lblDir);
        txfDir = new JTextField();
        txfDir.setBounds(60, 100, 100, 35);
        txfDir.setVisible(true);
        this.add(txfDir);

        btnGuardar = new JButton("Guardar");
        btnGuardar.setBounds(15, 150, 80, 30);
        btnGuardar.setVisible(true);
        btnGuardar.addActionListener(this);
        this.add(btnGuardar);

        btnCargar = new JButton("Cargar");
        btnCargar.setBounds(110, 150, 80, 30);
        btnCargar.setVisible(true);
        btnCargar.addActionListener(this);
        this.add(btnCargar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnGuardar) {
            try {
                int edad = Integer.parseInt(txfEdad.getText().trim());
                if (txfDir.getText().equals("") || txfNombre.getText().equals("") || edad < 0) {
                    JOptionPane.showMessageDialog(null, "DATOS ERRÓNEOS", "ERROR!", JOptionPane.INFORMATION_MESSAGE);

                }
            } catch (NumberFormatException exc) {
                JOptionPane.showMessageDialog(null, "La edad debe ser un número", "ERROR!", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            try {
                PrintWriter f = new PrintWriter("datos.txt");
                f.println(txfNombre.getText());
                f.println(txfEdad.getText());
                f.println(txfDir.getText());
                f.close();
            } catch (FileNotFoundException excp) {
                JOptionPane.showMessageDialog(null, "No se guardaron los datos", "ERROR!",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
        if (e.getSource() == btnCargar) {

            try {
                String linea = "";
                String linea2 = "";
                String linea3 = "";
                Scanner f = new Scanner(new File("datos.txt"));
                linea = f.nextLine();
                linea2 = f.nextLine();
                linea3 = f.nextLine();
                f.close();
                if (txfNombre.getText().trim().equals("") && txfEdad.getText().trim().equals("")
                        && txfDir.getText().trim().equals("")) {
                    if (linea.trim().equals("") || linea2.trim().equals("") || linea3.trim().equals("")) {
                        JOptionPane.showMessageDialog(null, "Error en el archivo", "ERROR!",
                                JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        txfNombre.setText(linea);
                        txfEdad.setText(linea2);
                        txfDir.setText(linea3);
                    }
                } else {
                    int respuesta = JOptionPane.showConfirmDialog(null,
                            "¿Deseas reemplazar los datos?", "Confirmación",
                            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if (respuesta == JOptionPane.YES_OPTION) {
                        if (linea.trim().equals("") || linea2.trim().equals("") || linea3.trim().equals("")) {
                            JOptionPane.showMessageDialog(null, "Error en el archivo", "ERROR!",
                                    JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            txfNombre.setText(linea);
                            txfEdad.setText(linea2);
                            txfDir.setText(linea3);
                        }
                    }
                }
            } catch (IOException excp2) {
                JOptionPane.showMessageDialog(null, "No existe el archivo", "ERROR!", JOptionPane.INFORMATION_MESSAGE);
            }
        }

    }
}
