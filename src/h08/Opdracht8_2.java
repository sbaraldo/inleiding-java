package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht8_2 extends Applet {

    int mannen;
    int potmannen;
    int vrouwen;
    int potvrouwen;

    Button manknop;
    Button potmanknop;
    Button vrouwknop;
    Button potvrouwknop;


    public void init() {

    setSize(400,400);

    mannen = 0;
    potmannen = 0;
    vrouwen = 0;
    potvrouwen = 0;

    manknop = new Button("voeg mannelijk gast");
    manknop.addActionListener(new manknopListener());
    add(manknop);

    potmanknop = new Button("voeg potentiële mannelijk gast");
    potmanknop.addActionListener(new potmanknopListener());
    add(potmanknop);

    vrouwknop = new Button("voeg vrouwelijke gast");
    vrouwknop.addActionListener(new vrouwknopListener());
    add(vrouwknop);

    potvrouwknop = new Button("voeg potentiële vrouwelijke gast");
    potvrouwknop.addActionListener(new potvrouwknopListener());
    add(potvrouwknop);

    }

    public void paint(Graphics g) {

        String manString = "Aantal mannen die er zijn: " + mannen;
        String potmantString = "Potentieel aantal mannen: " + potmannen;
        String vrouwString = "Aantal vrouwen die er zijn: " + vrouwen;
        String potvrouwString = "Potentieel aantal vrouwen: " + potvrouwen;
        String totaalString = "Totaal aantal gasten: " + (mannen + vrouwen);
        String totaalpotString = "Totaal aantal potentiële gasten: " + (potmannen + potvrouwen);

        g.drawString(manString, 30, 100);
        g.drawString(potmantString, 30, 120);
        g.drawString(vrouwString, 30, 170);
        g.drawString(potvrouwString, 30, 190);
        g.drawString(totaalString, 30, 240);
        g.drawString(totaalpotString, 30, 260);

    }

    class manknopListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {

           mannen++;
           potmannen++;
           repaint();

        }
    }

    class potmanknopListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {

        potmannen++;
        repaint();

        }
    }

    class vrouwknopListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {

        vrouwen++;
        potvrouwen++;
        repaint();

        }
    }

    class potvrouwknopListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {

        potvrouwen++;
        repaint();

        }
    }

}
