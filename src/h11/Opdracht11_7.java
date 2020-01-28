package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht11_7 extends Applet {


    public void init() {

        setSize(700,700);
    }


    public void paint(Graphics g) {

        int teller;
        int x = 300;
        int x1 = 10;
        int y = 400;
        int y1 = 10;

        for (teller = 0; teller < 50; teller++) {

            g.drawOval(x, y, x1, y1);

            x -= 5;
            x1 += 10;
            y -= 5;
            y1 += 10;
        }


    }
}
