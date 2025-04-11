package swing1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Botones extends JFrame implements ItemListener {
    JCheckBox chkNegrita;
    JLabel lbl;

    public Botones() {
        super("Botones de estado");
        setLayout(new FlowLayout());
        lbl = new JLabel("Etiqueta de prueba");
        lbl.setFont(new Font("Arial", Font.PLAIN, 14));
        add(lbl);
        chkNegrita = new JCheckBox("Negrita");
        chkNegrita.addItemListener(this);
        add(chkNegrita);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (chkNegrita.isSelected()) {
            lbl.setFont(new Font("Arial", Font.BOLD, 14));
        } else {
            lbl.setFont(new Font("Arial", Font.PLAIN, 14));
        }
    }
}
