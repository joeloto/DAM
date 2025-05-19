package principal.boletin2.basicos;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class v1 extends JFrame {

    private JButton btn;

    public v1() {
        super();
        setLayout(new FlowLayout());
        btn = new JButton("Pulsame");
        this.add(btn);
        btn.addMouseMotionListener(new MouseHandler());
        setSize(300,300);
        setVisible(true);
    }

    private class MouseHandler implements MouseMotionListener{

        @Override
        public void mouseDragged(MouseEvent e) {
            
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            btn.setLocation((int) (Math.random()*600),(int) (Math.random()*401));
        }

    }
    public static void main(String[] args) {
        new v1();
    }
}

