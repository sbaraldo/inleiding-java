package h11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht11Praktijkopdracht1 extends Applet {

    int tafelgetal;
    int teller;
    int getal;
    boolean invoerboolean;
    String Tafelstring;
    TextField tekstvak;
    Label label;
    Button knopOK;



    public void init() {

        tekstvak = new TextField(5);
        label = new Label("Voer tafel in");
        add(label);
        add(tekstvak);

        knopOK = new Button("OK");
        knopOK.addActionListener(new knopOKListener());
        add(knopOK);

    }

    public void paint(Graphics g) {

        if (invoerboolean) {
            int y = 50;
            for (int teller = 1; teller < 11; teller++) {
                y += 20;
                int getal = tafelgetal * teller;
                Tafelstring = tafelgetal + " x " + teller + " = " + getal;
                g.drawString(Tafelstring, 50, y);
            }
        }

    }

    class knopOKListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            tafelgetal = Integer.parseInt(tekstvak.getText());
            invoerboolean = true;
            repaint();

        }
    }

}
