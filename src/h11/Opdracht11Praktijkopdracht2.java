package h11;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht11Praktijkopdracht2 extends Applet {

    int tafelgetal = 1;
    int teller;
    int getal;
    String tafelstring;
    Button knopOK;

    public void init() {

        knopOK = new Button("OK");
        knopOK.addActionListener(new knopOKListener());
        add(knopOK);

    }

    public void paint(Graphics g) {

        int y = 50;
        for (int teller = 1; teller <11; teller++) {
            y += 20;
            int getal = tafelgetal * teller;
            tafelstring = tafelgetal + " x " + teller + " = " + getal;
            g.drawString(tafelstring, 50, y);
        }

    }

    class knopOKListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            tafelgetal++;
            repaint();
            if (tafelgetal > 10) {
                tafelgetal = 1;
            }

        }
    }

}
