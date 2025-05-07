package principal.Ejercicio5;

import java.awt.event.*;
import javax.swing.*;

public class Tragaperras extends JFrame implements ActionListener{
    
    private JTextField txfnumero1;
    private JTextField txfnumero2;
    private JTextField txfnumero3;
    private JButton btnJugar;
    private JLabel lblInfo;
    private JLabel lblTimer;
    private Timer temporizador;
    private int segundos = 0;
    private int minutos = 0;

    public Tragaperras() {
        super("Tragaperras");
        setLayout(null);

        txfnumero1 = new JTextField();
        txfnumero1.setEditable(false);
        txfnumero1.setBounds(5,20,80,35);
        txfnumero1.setVisible(true);
        this.add(txfnumero1);

        txfnumero2 = new JTextField();
        txfnumero2.setEditable(false);
        txfnumero2.setBounds(103,20,80,35);
        txfnumero2.setVisible(true);
        this.add(txfnumero2);

        txfnumero3 = new JTextField();
        txfnumero3.setEditable(false);
        txfnumero3.setBounds(200,20,80,35);
        txfnumero3.setVisible(true);
        this.add(txfnumero3);

        btnJugar = new JButton("Jugar");
        btnJugar.setBounds(103, 100, 80, 35);
        btnJugar.setVisible(true);
        btnJugar.addActionListener(this);
        this.add(btnJugar);

        lblInfo = new JLabel("");
        lblInfo.setVisible(false);
        lblInfo.setBounds(108,130,130,35);
        this.add(lblInfo);

        lblTimer = new JLabel();
        lblTimer.setVisible(false);
        lblTimer.setBounds(60,160,200,35);
        this.add(lblTimer);

        temporizador = new Timer(1000,this);
        temporizador.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnJugar) {
            String n1 = Integer.toString((int) (Math.random()*6 + 1));
            String n2 = Integer.toString((int) (Math.random()*6 + 1));
            String n3 = Integer.toString((int) (Math.random()*6 + 1));
            txfnumero1.setText(n1);
            txfnumero2.setText(n2);
            txfnumero3.setText(n3);
            int numero1 = Integer.parseInt(txfnumero1.getText());
            int numero2 = Integer.parseInt(txfnumero2.getText());
            int numero3 = Integer.parseInt(txfnumero3.getText());
            if (numero1 == numero2 && numero2 == numero3) {
                lblInfo.setVisible(true);
                lblInfo.setBounds(95,130,130,35);
                lblInfo.setText("Has ganado " + (int) (Math.random()*1001 + 1) +  " €");
            } else{
                lblInfo.setVisible(true);
                lblInfo.setBounds(108,130,130,35);
                lblInfo.setText("Has perdido");
            }
        }
        if (e.getSource() == temporizador) {
            segundos++;
            if (segundos == 60) {
                minutos++;
                segundos = 0;
            }
            lblTimer.setVisible(true);
            lblTimer.setText(String.format("Tiempo funcionando : %02d:%02d",minutos,segundos));
        }
    }
}
