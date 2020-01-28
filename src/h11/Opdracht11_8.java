package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht11_8 extends Applet {


    public void init() {

        setSize(700,700);
    }

    public void paint(Graphics g) {

        int teller;
        int x = 50;
        int x1 = 20;
        int y = 50;
        int y1 = 20;


        for (teller = 0; teller < 100; teller ++) {

            g.drawOval(x, y, x1, y1);

            x1 += 10;
            y1 += 10;


        }

    }
}
