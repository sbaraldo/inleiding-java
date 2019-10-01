package h05;

import java.applet.Applet;
import java.awt.*;

public class Opdracht5_1 extends Applet {

    Color opvolkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;

    public void init() {

        opvolkleur = Color.magenta;
        lijnkleur = Color.black;
        breedte = 200;
        hoogte = 100;

    }

    public void paint(Graphics g) {
        // lijn
        g.drawLine(30,80,breedte,80 );
        g.drawString("Lijn",100,95);

        // rechthoek
        g.drawRect(30,100,breedte,hoogte);
        g.drawString("rechthoek",100,210);

        // afgeronde rechthoek
        g.drawRoundRect(30,225,breedte,hoogte, 30,30);
        g.drawString("afgeronde rechthoek",75,340);

        // gevulde rechthoek met ovaal
        g.setColor(opvolkleur);
        g.fillRect(240,100,breedte,hoogte);
        g.setColor(lijnkleur);
        g.drawOval(240,100,breedte,hoogte);
        g.drawString("gevulde rechthoek met ovaal",245,210);

        //gevulde ovaal
        g.setColor(opvolkleur);
        g.fillOval(240,225,breedte,hoogte);
        g.setColor(lijnkleur);
        g.drawString("gevulde ovaal",290,340);

        //taartpunt met ovaal eromheen
        g.drawOval(450,100,breedte,hoogte);
        g.setColor(opvolkleur);
        g.fillArc(450,100,breedte,hoogte,0,45);
        g.setColor(lijnkleur);
        g.drawString("taartpunt met ovaal eromheen",480,210);

        //cirkel
        g.drawOval(490,225,hoogte,hoogte);
        g.drawString("cirkel",525,340);


    }
}
