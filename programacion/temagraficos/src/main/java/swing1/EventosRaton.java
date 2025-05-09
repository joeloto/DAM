package swing1;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class EventosRaton extends JFrame {

    JLabel lbl, lbl2;

    public EventosRaton() {
        super("Pueba eventos");
        setLayout(new FlowLayout());
        lbl = new JLabel("<html><h1>Probando eventos de ratón</h1></html>");
        lbl.addMouseListener(new MouseHandler());
        lbl.addMouseMotionListener(new MouseHandler());
        add(lbl);
        lbl2 = new JLabel("Datos");
        add(lbl2);

    }

    // Inner class o clase interna.
    // Desde ella se puede acceder a todos los miembros de la externa.
    private class MouseHandler implements MouseListener, MouseMotionListener {
        @Override
        public void mouseMoved(java.awt.event.MouseEvent e) {
            lbl2.setText(String.format("Posición X:%d Y:%d ", e.getX(),
                    e.getY()));
        }

        @Override
        public void mouseDragged(java.awt.event.MouseEvent e) {
            // No se usa pero hay que imlementarla para
            // cumplir la interface MouseMotionListener
        }

        @Override
        public void mouseClicked(java.awt.event.MouseEvent e) {
            if (e.getClickCount() > 1) {
                lbl2.setText("Pulsación múltiple");
            } else {
                lbl2.setText(String.format("<html>Boton Pulsado: %d<br>Teclas: CTRL:%s ALT:%s SHIFT:%s ",
                        e.getButton(),
                        e.isControlDown() ? "Sí" : "No",
                        e.isAltDown() ? "Sí" : "No",
                        e.isShiftDown() ? "Sí" : "No"));
            }
        }
        /*
         * La tecla ALT en Linux solo se detecta en combinación con otras, ya que la
         * captura el SO para la gestión de menús. Este comportamiento puede cambiar en
         * Windows y
         * macOs o en distintas distros de Linux (según el sistema de ventanas)
         */

        @Override
        public void mouseEntered(java.awt.event.MouseEvent e) {
            lbl.setForeground(Color.BLUE);
        }

        @Override
        public void mouseExited(java.awt.event.MouseEvent e) {
            lbl.setForeground(Color.BLACK);
            lbl2.setText("Fuera de la etiqueta");
        }

        @Override
        public void mousePressed(java.awt.event.MouseEvent e) {
            lbl.setForeground(Color.YELLOW);
        }

        @Override
        public void mouseReleased(java.awt.event.MouseEvent e) {
            lbl.setForeground(Color.BLUE);
        }

    }
}