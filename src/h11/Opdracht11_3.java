package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht11_3 extends Applet {





    public void init() {

        setSize(700,400);


    }


    public void paint(Graphics g) {

        int teller;
        int y = 50;
        int x = 50;
        int getal1 = 0;
        int getal2 = 1;
        int getalhouder;



        for (teller = 0; teller < 20; teller ++) {
            g.drawString("" + getal1 , x, y);
            x += 30;

            getalhouder = getal2;
            getal2 = getal1 + getal2;
            getal1 = getalhouder;
        }




    }
}
