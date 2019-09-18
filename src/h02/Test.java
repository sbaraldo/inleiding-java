package h02;

import java.applet.Applet;
import java.awt.*;

public class Test extends Applet {

    // VARIABELEN DECLAREREN

    String voornaam;

    public void init() {

        // VARIABELEN INITIALISEREN

        voornaam = "Stefan";
        setBackground(Color.blue);
        setSize(400,400);
    }

    public void paint(Graphics g) {

      // DINGEN IN BEELD BRENGEN
        g.setColor(Color.yellow);
        g.drawString(voornaam,20,20);


    }
}
