package h02;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2_2 extends Applet {

    String voornaam;
    String achternaam;

    public void init() {

        setBackground(Color.WHITE);
        voornaam = "Stefan";
        achternaam = "Baraldo";
    }

    public void paint(Graphics g) {

        g.setColor(Color.red);
        g.drawString("Stefan", 25, 25);
        g.setColor(Color.blue);
        g.drawString("Baraldo", 25, 50);

    }

}


