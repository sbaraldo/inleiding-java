package h08;

import javax.print.DocFlavor;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht8_3 extends Applet {

    TextField tekstvak;
    Label label;
    Button knop;
    double btw;


    public void init() {

        setSize(400,400);

        tekstvak = new TextField(10);
        tekstvak.addActionListener(new tekstvakListener());
        add(tekstvak);

        label = new Label("Voer getal in");
        add(label);

        knop = new Button("Bereken");
        add(knop);

    }


    public void paint(Graphics g) {

        g.drawString("uw bedrag inclusief BTW is:" + btw, 50,50);


    }


    class tekstvakListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {

           String s = tekstvak.getText();
            double getal = Double.parseDouble(s);
            btw = getal * 1.21;
            repaint();

        }


    }
}
