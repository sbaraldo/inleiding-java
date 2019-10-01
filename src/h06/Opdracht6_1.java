package h06;

import java.applet.Applet;
import java.awt.*;

public class Opdracht6_1 extends Applet {

    double a;
    double b;
    double uitkomst;


    public void init() {

        a = 113;
        b = 4;
        uitkomst = a / b;


    }


    public void paint(Graphics g) {

        g.drawString("Jan:" + uitkomst,30,40);
        g.drawString("Ali:" + uitkomst,30,55);
        g.drawString("Jeannette:" + uitkomst,30,70);
        g.drawString("Stefan:" + uitkomst,30,85);

    }
}
