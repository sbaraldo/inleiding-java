package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht4_2 extends Applet {


    public void init() {

        setBackground(Color.WHITE);

    }

    public void paint(Graphics g) {

        g.drawLine(50,170,200, 170);
        g.drawLine(50, 170, 125, 70 );
        g.drawLine(200, 170,125 , 70);
        g.drawRect(50,170,150,120);
        g.drawRect(150, 200, 40, 40 );
        g.drawRect(75,240,30,50);
        g.fillOval(80,265,4,4);








    }

}

