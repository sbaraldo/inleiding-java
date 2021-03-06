package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht10_1 extends Applet {

    TextField tekstvak;
    Label label;
    double hoogstegetal;
    double huidiggetal;

    public void init() {

        setSize(400,400);

        tekstvak = new TextField(10);
        label = new Label("Voer getal in");
        tekstvak.addActionListener( new tekstvakListener());
        add(label);
        add(tekstvak);

    }


    public void paint(Graphics g) {

        g.drawString("hoogste getal is " + hoogstegetal, 50, 50);

    }

    class tekstvakListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

        double huidiggetal = Double.parseDouble(tekstvak.getText());
        if (huidiggetal > hoogstegetal) {
            hoogstegetal = huidiggetal;
            repaint();

        }

        else {
            repaint();
        }

        }
    }
}

