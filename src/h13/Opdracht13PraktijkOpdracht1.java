package h13;

import java.applet.Applet;
import java.awt.*;

public class Opdracht13PraktijkOpdracht1 extends Applet {


    public void init() {

    }


    public void paint(Graphics g) {

        int xArc = 100, yArc = 100, xboom = (xArc + 25), yboom = (yArc + 50), arcbreedte = 80,
                archoogte = 175, boombreedte = 30, boomhoogte = 175;

        tekenboom(g, xArc, yArc, xboom, yboom, arcbreedte, archoogte, boombreedte, boomhoogte);
    }

    void tekenboom(Graphics g, int xArc, int yArc, int xboom, int yboom, int arcbreedte,
                   int archoogte, int boombreedte, int boomhoogte) {

        g.setColor(Color.black);
        g.fillRect(xboom, yboom, boombreedte, boomhoogte);
        g.setColor(Color.GREEN);
        g.fillArc(xArc, yArc, arcbreedte, archoogte, 0, 360);
    }
}
