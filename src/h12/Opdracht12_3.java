package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Opdracht12_3 extends Applet {

    Button knopOK;
    TextField[] tekstvak = new TextField[5];
    String[] arraystring = new String[5];
    String sorteerstring = "";


    public void init() {

        for (int i = 0; i < tekstvak.length; i++) {
            tekstvak[i] = new TextField(5);
            tekstvak[i].addActionListener(new sorteerarrayListener());
            add(tekstvak[i]);
            
        }

        knopOK = new Button("OK");
        knopOK.addActionListener(new sorteerarrayListener());
        add(knopOK);

    }

    public void paint(Graphics g) {

        g.drawString("" + sorteerstring, 50, 50);

    }

    class sorteerarrayListener implements ActionListener {
        
        public void actionPerformed(ActionEvent e) {

            for (int i = 0; i < tekstvak.length; i++) {
                arraystring[i] = tekstvak[i].getText();
            }

            Arrays.sort(arraystring);
            sorteerstring = "" + Arrays.toString(arraystring);
            repaint();
            
        }
    }

}
