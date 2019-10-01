package h06;

import java.applet.Applet;
import java.awt.*;

public class Opdracht6_2 extends Applet {

        int seconde;
        int uur;
        int dag;
        int jaar;


    public void init() {

        seconde = 1;
        uur =  (seconde * 60) *60;
        dag = uur * 24;
        jaar = dag * 365;

    }

    public void paint(Graphics g) {

        g.drawString("1 uur heeft " + uur + " seconde",30,40 );
        g.drawString("1 dag heeft " + dag + " seconde",30,60 );
        g.drawString("1 jaar heeft " + jaar + " seconde",30,80 );

    }
}
