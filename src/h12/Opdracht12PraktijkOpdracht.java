package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht12PraktijkOpdracht extends Applet {

    String[] namen;
    String[] telefoonnumer;
    String invoernaam;
    String invoertelefoonnummer;
    TextField tekstvaknaam;
    TextField tekstvaktelefoonnummer;
    Button knopOK;
    int teller;
    boolean check;

    public void init() {

        setSize(400,400);

        namen = new String[10];
        telefoonnumer = new String[10];

        tekstvaknaam = new TextField(10);
        add(tekstvaknaam);
        tekstvaktelefoonnummer = new TextField(10);
        add(tekstvaktelefoonnummer);

        knopOK = new Button("Ok");
        knopOK.addActionListener(new NaamEnTelefoonListener());
        add(knopOK);

    }


    public void paint(Graphics g) {

        int y = 50;

        if (check) {
            for (int i = 0; i < 10; i++) {
                g.drawString("Naam " + i + " is " + namen[i], 50, y);
                g.drawString("Telefoonnummer " + i + " is " + telefoonnumer[i], 200, y);
                y += 20;

            }
        } else {
            g.drawString("De teller is op " + teller, 50,60);
        }

    }

    class NaamEnTelefoonListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {

            invoernaam = tekstvaknaam.getText();
            invoertelefoonnummer = tekstvaktelefoonnummer.getText();

            namen[teller] = invoernaam;
            telefoonnumer[teller] = invoertelefoonnummer;

            if (teller < 10)
                teller++;

            if (teller == 10) {
                check = true;
                repaint();
            }
            repaint();

        }
    }

}
