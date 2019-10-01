package h05;

import java.applet.Applet;
import java.awt.*;

public class Opdracht5_2 extends Applet {

    int Valeriegewicht = 350;
    int Jeroengewicht = 200;
    int Hansewicht = 250;

    int Valeriebodem = 450 - Valeriegewicht;
    int Jeroenbodem = 450 - Jeroengewicht;
    int Hansbodem = 450 - Hansewicht;

    public void init() {

        setSize(700, 500);

    }

    public void paint(Graphics g) {

        //diagram opbouw
        g.setColor(Color.black);
        g.drawLine(200, 200, 200, 450);
        g.drawLine(200, 450, 500, 450);

        //diagram namen
        g.drawString("Valerie", 225, 470);
        g.drawString("Jeroen", 285, 470);
        g.drawString("Hans", 345, 470);

        //diagram kg cijfers
        g.drawString("100 KG", 150, 200);
        g.drawString("80 KG", 150, 250);
        g.drawString("60 KG", 150, 300);
        g.drawString("40 KG", 150, 350);
        g.drawString("20 KG", 150, 400);
        g.drawString("0 KG", 150, 450);

        //diagram grijze lijnen
        g.setColor(Color.GRAY);
        g.drawLine(200, 200, 500, 200);
        g.drawLine(200, 250, 500, 250);
        g.drawLine(200, 300, 500, 300);
        g.drawLine(200, 350, 500, 350);
        g.drawLine(200, 400, 500, 400);

        //kolommen met variabelen

        g.setColor(Color.RED);
        g.fillRect(225, Valeriegewicht, 40, Valeriebodem);
        g.setColor(Color.BLUE);
        g.fillRect(285, Jeroengewicht, 40, Jeroenbodem);
        g.setColor(Color.YELLOW);
        g.fillRect(345, Hansewicht, 40, Hansbodem);

    }
}



