package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht8_1 extends Applet {

    TextField tekstvak;
    Button knopOK;
    Button knopReset;

    public void init() {

    tekstvak = new TextField(20);
    add(tekstvak);

    knopOK = new Button("OK");
    add(knopOK);

    knopReset = new Button("Reset");
    add(knopReset);

    }

    public void paint(Graphics g) {

    }

    class KnopOKListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

        }
    }

    class KnopResetListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {

        }
    }


}
