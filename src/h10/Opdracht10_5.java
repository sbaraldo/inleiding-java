package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht10_5 extends Applet {

    double cijfer;
    TextField tekstvak;
    Button knopOK;
    String String;


    public void init() {

        tekstvak = new TextField(5);
        tekstvak.addActionListener( new tekstvakListener());
        add(tekstvak);

        knopOK = new Button("OK");
        knopOK.addActionListener(new knopOKListener());
        add(knopOK);
    }


    public void paint(Graphics g) {

        g.drawString(String,50,50);

    }

    class tekstvakListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            String s;

            s = tekstvak.getText();
            cijfer = Double.parseDouble(s);
            if (cijfer > 5.4) {
                String = "Dit is een voldoende en is geslaagd";
                repaint();
            }
            else {
                String = "Dit is een onvoldoende en is niet geslaagd";
            }
            repaint();
        }
    }

    class knopOKListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            String = "";
            String = tekstvak.getText();

        }
    }


}
