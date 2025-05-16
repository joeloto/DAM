package principal.boletin2.Ejercicio1;

import java.awt.event.*;

import javax.swing.*;

public class Raton extends JFrame implements ActionListener {
    private JLabel lblTeclas;
    private JLabel lblCoordenadas;
    private JButton btnDerecho;
    private JButton btnIzquierdo;

    public Raton() {
        super("Control de ratón");
        setLayout(null);

        lblTeclas = new JLabel("TECLAS");
        lblTeclas.setBounds(120, 10, 80, 35);
        lblTeclas.setVisible(true);
        this.add(lblTeclas);

        lblCoordenadas = new JLabel();
        lblCoordenadas.setBounds(60, 90, 180, 35);
        lblCoordenadas.setVisible(false);
        this.add(lblCoordenadas);

        btnDerecho = new JButton("Derecho");
        btnDerecho.setBounds(145, 50, 100, 35);
        btnDerecho.setVisible(true);
        btnDerecho.addActionListener(this);
        btnDerecho.addMouseListener(new MouseHandler());
        btnDerecho.addMouseMotionListener(new MouseHandler());
        this.add(btnDerecho);

        btnIzquierdo = new JButton("Izquierdo");
        btnIzquierdo.setBounds(40, 50, 100, 35);
        btnIzquierdo.setVisible(true);
        btnIzquierdo.addActionListener(this);
        btnIzquierdo.addMouseListener(new MouseHandler());
        btnIzquierdo.addMouseMotionListener(new MouseHandler());
        this.add(btnIzquierdo);

        this.getContentPane().addMouseMotionListener(new MouseHandler() {
            public void mouseMoved(java.awt.event.MouseEvent e) {
                lblCoordenadas.setText(String.format("Coordenadas X:%d e Y:%d", e.getX(), e.getY()));
                lblCoordenadas.setVisible(true);
            }
        });
        this.addMouseListener(new MouseHandler());

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    private class MouseHandler implements MouseMotionListener, MouseListener {

        @Override
        public void mouseMoved(java.awt.event.MouseEvent e) {
            JButton btn = (JButton) e.getSource();
            lblCoordenadas.setText(
                    String.format("Coordenadas X:%d e Y:%d", e.getX() + btn.getX(), e.getY() + btn.getY()));
            lblCoordenadas.setVisible(true);

            //PONER AQUI LAS COORDENADAS NORMALES
        }

        @Override
        public void mouseDragged(MouseEvent e) {

        }

        @Override
        public void mouseExited(java.awt.event.MouseEvent e) {
            lblCoordenadas.setVisible(false);
        }

        @Override
        public void mouseClicked(MouseEvent e) {
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

    }
}
