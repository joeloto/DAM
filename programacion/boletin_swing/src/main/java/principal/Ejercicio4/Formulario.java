package principal.Ejercicio4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Formulario extends JFrame implements ActionListener{
    
    private JLabel lblNombre;
    private JLabel lblEdad;
    private JLabel lblDir;
    private JTextField txfNombre;
    private JTextField txfEdad;
    private JTextField txfDir;
    
    public Formulario() {
        super("Formulario");
        lblNombre = new JLabel("Nombre:");
        lblNombre.setSize(100,35);
        lblNombre.setVisible(true);
        this.add(lblNombre);
        txfNombre = new JTextField();
        txfNombre.setSize(100,35);
        txfNombre.setVisible(true);
        this.add(txfNombre);

        lblEdad = new JLabel("Edad:");
        lblEdad.setSize(100,35);
        lblEdad.setVisible(true);
        this.add(lblEdad);
        txfEdad = new JTextField();
        txfEdad.setSize(100,35);
        txfEdad.setVisible(true);
        this.add(txfEdad);
        
        lblDir = new JLabel("Dirección:");
        lblDir.setSize(100,35);
        lblDir.setVisible(true);
        this.add(lblDir);
        txfDir = new JTextField();
        txfDir.setSize(100,35);
        txfDir.setVisible(true);
        this.add(txfDir);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }
}
