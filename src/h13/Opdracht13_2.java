package h13;

import java.applet.Applet;
import java.awt.*;

public class Opdracht13_2 extends Applet {



    public void init() {

        setSize(400,400);

    }

    public void paint(Graphics g) {

        int x = 0, y = 0, breedte = 40, hoogte = 25;

        tekenMuur(g, x, y, breedte, hoogte);

    }

    void tekenMuur (Graphics g, int x, int y, int breedte, int hoogte) {

        for (int i = 0; i < 10; i++) {
            for (int rodebaksteen = 0; rodebaksteen < 10; rodebaksteen++) {
                g.setColor(Color.red);
                g.fill3DRect(x + 5, y + 5, breedte - 10, hoogte - 10, true);
                x += breedte;
            }
            y += hoogte;
            if ((i % 2) == 0) {
                x = -20;
            } else {
                x = 0;
            }
        }
    }
}
