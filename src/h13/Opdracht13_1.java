package h13;

import java.applet.Applet;
import java.awt.*;

public class Opdracht13_1 extends Applet {


    public void init() {

    }


    public void paint(Graphics g) {

        int x1 = 100, y1 = 200, x2 = 150, y2 = 100, x3 = 200, y3 = 200;

        tekenDriehoek(g, x1, y1, x2, y2, x3, y3);

    }

    void tekenDriehoek (Graphics g, int x1, int y1, int x2, int y2, int x3, int y3) {

        g.drawLine(x1, y1, x2, y2);
        g.drawLine(x1, y1, x3, y3);
        g.drawLine(x2, y2, x3, y3);

    }

}
