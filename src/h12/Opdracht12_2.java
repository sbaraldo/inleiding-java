package h12;

import java.applet.Applet;
import java.awt.*;

public class Opdracht12_2 extends Applet {

    Button[] knoppen = new Button[25];
    int teller;

    public void init() {

        for (int teller = 0; teller <knoppen.length ; teller++) {
            knoppen[teller] = new Button("knop " + teller);
            add(knoppen[teller]);
            
        }
    }

    public void paint(Graphics g) {

    }


}
