package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht4_7 extends Applet {


    public void paint(Graphics g) {

        //vorm dobbelsteen
        g.drawRoundRect(120,70,100,100,10,10);
        //stippen op de dobbelsteen
        g.fillOval(135,90,18,18);
        g.fillOval(135,140,18,18);
        g.fillOval(190,90,18,18);
        g.fillOval(190,140,18,18);




    }
}
