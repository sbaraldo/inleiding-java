package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht11_4 extends Applet {


    public void init() {

        setSize(700,400);

    }

    public void paint(Graphics g) {

        int teller;
        int y = 50;
        int x = 50;
        int getal1 = 0;

        for (teller = 0; teller < 10; teller++) {
            x += 30;
            getal1++;
            g.drawString("" + (getal1 * 3), x, y);
        }

    }
}
