package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht12_4 extends Applet {

    boolean gevonden;
    int[] nummer = {2, 8, 10, 15, 20};
    int gezocht;
    Button knopOk;
    TextField tekstvak;
    int index;

    public void init() {

        tekstvak = new TextField(5);
        add(tekstvak);
        knopOk = new Button("OK");
        knopOk.addActionListener(new knopListener());
        add(knopOk);
        index = -1;
        gevonden = false;

    }


    public void paint(Graphics g) {

        if (gevonden) {
            g.drawString("De waarde is gevonden", 50, 50);
        } else {
            g.drawString("De waarde is niet gevonden", 50, 50);
        }

    }

    class knopListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            String s = tekstvak.getText();
            gezocht = Integer.parseInt(s);

            for (int i = 0; i < nummer.length; i++) {
                if (nummer[i] == gezocht) {
                    gevonden = true;
                    int index = nummer[i];
                }

            }
            repaint();
        }
    }
}