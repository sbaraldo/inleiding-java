package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht8_1 extends Applet {

    TextField tekstvak;
    Label label;
    Button knopOK;
    Button knopReset;
    String Message;

    public void init() {

        setSize(400,400);

    tekstvak = new TextField(20);
    label = new Label("Typ iets in");
    add(label);
    add(tekstvak);

    knopOK = new Button("OK");
    knopOK.addActionListener(new KnopOKListener());
    add(knopOK);

    knopReset = new Button("Reset");
    knopReset.addActionListener(new KnopResetListener());
    add(knopReset);

    Message = " ";

    }

    public void paint(Graphics g) {

        g.drawString(Message,20,150);
    }

    class KnopOKListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

           Message = tekstvak.getText();
           repaint();

        }

    }

    class KnopResetListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {

            tekstvak.setText(" ");

        }
    }


}
