package h12;

import java.applet.Applet;
import java.awt.*;

public class Opdracht12_1 extends Applet {

    int[] getallen = {2,4,6,8,10,12,14,16,18,20};

    public void init() {


    }

    public void paint(Graphics g) {

        int y = 20;
        int totaalgetal = 0;
        int gemiddeldegetal;

        for (int teller = 0; teller < getallen.length ; teller++) {
            g.drawString("Getal op teller: " + teller + " is = " + getallen[teller], 20,y);
            y += 20;
            totaalgetal = totaalgetal + getallen[teller];
            
        }
        gemiddeldegetal = totaalgetal / getallen.length;
        g.drawString("het totaal is: " + totaalgetal, 20,230);
        g.drawString("het gemiddelde is: " + gemiddeldegetal, 20, 250);

    }
}
