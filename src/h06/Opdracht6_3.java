package h06;

import java.applet.Applet;
import java.awt.*;

public class Opdracht6_3 extends Applet {

    int positiefgetal1;
    int positiefgetal2;
    int uitkomst;

    public void init() {

        positiefgetal1 =  2147483647;
        positiefgetal2 = 1;
        uitkomst = (positiefgetal1 + positiefgetal2);
    }


    public void paint(Graphics g) {

        g.drawString("positiefgetal1 + positiefgetal2 = " + uitkomst, 30, 40);

    }



}
