package h04;

import sun.java2d.loops.DrawLine;

import java.applet.Applet;
import java.awt.*;

public class Opdracht4_4 extends Applet {

    public void init() {

        setBackground(Color.WHITE);

    }

    public void paint(Graphics g) {
        //grafiek lijnen
        g.drawLine(100,30,100,250);
        g.drawLine(100, 250,320,250);
        //horizonatle lijnen bij y as
        g.drawLine(96, 206, 104, 206);
        g.drawLine(96,162,104,162);
        g.drawLine(96,118,104,118);
        g.drawLine(96,74,104,74);
        g.drawLine(96,30,104,30);
        //gewichtcijfers
        g.drawString("0",85,250);
        g.drawString("100",73,30);
        g.drawString("80",80,74);
        g.drawString("60",80,118);
        g.drawString("40",80,162);
        g.drawString("20",80,206);
        g.drawString("Gewicht in kilo's",20,15);
        //grafiek stroken
        g.setColor(Color.red);
        g.fillRect(120,162,36,88);
        g.setColor(Color.blue);
        g.fillRect(180,30,36,220);
        g.setColor(Color.yellow);
        g.fillRect(240,74,36,176);
        //Namen
        g.setColor(Color.black);
        g.drawString("Valerie",120,270);
        g.setColor(Color.black);
        g.drawString("Jeroen",180,270);
        g.setColor(Color.black);
        g.drawString("Hans",245,270);
        g.drawString("Namen",335,255);














    }
}
