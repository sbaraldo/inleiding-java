package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht11_2 extends Applet {


    public void init() {

    }


    public void paint(Graphics g) {

        int teller;
        int x = 0;

        for (teller = 20; teller > 9; teller --) {
            x += 20;
            g.drawString("" + teller , x, 50);
            }
        }
    }
