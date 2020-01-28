package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht11_6 extends Applet {


    public void init() {

    }


    public void paint(Graphics g) {

        int teller;
        int x = 50;
        int x1 = 70;
        int y = 50;
        int y1 = 70;

        for (teller = 0; teller < 5; teller++) {

            g.drawOval( x,y,x1,y1);

            x += 10;
            x1 -= 20;
            y += 10;
            y1 -= 20;        }


    }
}
