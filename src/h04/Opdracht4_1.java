package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht4_1 extends Applet {

    public void init() {

    setBackground(Color.WHITE);

    }

    public void paint(Graphics g) {

        g.drawLine(50,170,200, 170);
        g.drawLine(50, 170, 125, 70 );
        g.drawLine(200, 170,125 , 70);


    }
}
