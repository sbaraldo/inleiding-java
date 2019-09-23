package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht4_3 extends Applet {

    public void init() {

        setBackground(Color.WHITE);

    }


    public void paint(Graphics g) {

        g.drawLine(50,30,50,300);
        g.setColor(Color.red);
        g.fillRect(50, 30, 170, 50);
        g.setColor(Color.blue);
        g.fillRect(50,130,170, 50 );







    }
}

