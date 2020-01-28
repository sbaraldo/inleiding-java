package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht11_9 extends Applet {


    public void init() {

        setSize(300, 300);
        setBackground(Color.lightGray);

    }

    public void paint(Graphics g) {

        int x = 50;
        int y = 50;
        int width = 25;
        int height = 25;
        int kolom;

        for (int rij = 0; rij < 8; rij++) {

            if (rij == 0 || rij == 2 || rij == 4 || rij == 6) {

                for (kolom = 0; kolom < 8; kolom++) {

                    if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                        g.setColor(Color.black);
                        g.fillRect(x, y, width, height);
                    } else {
                        g.setColor(Color.white);
                        g.fillRect(x, y, width, height);
                    }
                    x += width;
                }
            } else {
                for (kolom = 0; kolom < 8; kolom++) {

                    if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                        g.setColor(Color.white);
                        g.fillRect(x, y, width, height);
                    } else {
                        g.setColor(Color.black);
                        g.fillRect(x, y, width, height);
                    }
                    x += width;
                }
            }
            x = 50;
            y += 20;

        }
    }
}
