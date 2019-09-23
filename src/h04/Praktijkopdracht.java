package h04;

import java.applet.Applet;
import java.awt.*;

public class Praktijkopdracht extends Applet {

    public void paint(Graphics g) {

        //lijn
      g.drawLine(30,80,200,80);
      g.drawString("Lijn",100,95);

      //rechthoek
        g.drawRect(30,100,170,85);
        g.drawString("rechthoek",85,200);

        //afgeronde rechthoek
        g.drawRoundRect(30,205,170,85,30,30);
        g.drawString("afgeronde rechthoek",55,305);

        //gevulde rechthoek met ovaal
        g.setColor(Color.magenta);
        g.fillRect(210,100,170,85);
        g.setColor(Color.black);
        g.drawOval(210,100,170,85);
        g.drawString("gevulde rechthoek met ovaal",215,200);

        //gevulde ovaal
        g.setColor(Color.magenta);
        g.fillOval(210,205,170,85);
        g.setColor(Color.black);
        g.drawString("gevulde ovaal",255,305);

        //taartpunt met ovaal eromheen
        g.drawOval(390,100,170,85);
        g.setColor(Color.magenta);
        g.fillArc(390,100,170,85,0,45);
        g.setColor(Color.black);
        g.drawString("taartpunt met ovaal eromheen",400,200);

        //cirkel
        g.drawOval(435,205,80,80);
        g.drawString("cirkel",460,305);



    }
}
