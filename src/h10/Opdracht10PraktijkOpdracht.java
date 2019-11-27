package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht10PraktijkOpdracht extends Applet {

    TextField tekstvak;
    String resultaat;
    boolean cijferboolean;
    int cijfer;

    public void init() {

        setSize(400,400);

        tekstvak = new TextField(5);
        tekstvak.addActionListener( new tekstvakListener());
        add(tekstvak);


    }

    public void paint(Graphics g) {

    if (cijferboolean) {
        g.drawString("Je cijfer is " + cijfer + " dit is een " + resultaat, 50, 50);
    } else {
        g.drawString("cijfer is verkeerd ingevoerd", 50,50);
    }

    }

    class tekstvakListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            cijferboolean = true;
            cijfer = Integer.parseInt(tekstvak.getText());

            switch (cijfer) {
                case 1:
                case 2:
                case 3:
                    resultaat = "slecht";
                    break;
                case 4:
                    resultaat = "onvoldoende";
                    break;
                case 5:
                    resultaat = "matig";
                    break;
                case 6:
                case 7:
                    resultaat = "voldoende";
                    break;
                case 8:
                case 9:
                case 10:
                    resultaat= "goed";
                    break;
                default:
                    cijferboolean = false;
                    break;
            }

            repaint();
        }
    }
}
