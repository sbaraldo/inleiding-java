package h13;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht13_3 extends Applet {

    int x, y, breedte, hoogte;
    boolean baksteen, betonblok, check;
    Button knopbaksteen;
    Button knopbetonblok;

    public void init() {

        setSize(400,400);

        knopbaksteen = new Button("Baksteen");
        knopbaksteen.addActionListener(new knopbaksteenListener());
        add(knopbaksteen);

        knopbetonblok = new Button("Betonblok");
        knopbetonblok.addActionListener(new knopbetonblokListener());
        add(knopbetonblok);
    }


    public void paint(Graphics g) {

        if (check)
            tekenmuur(g, x, y, breedte, hoogte);
    }

    void tekenmuur(Graphics g, int x, int y, int breedte, int hoogte) {

        if (baksteen) {

            for (int regel = 0; regel < 15; regel++) {

                for (int bakstenen = 0; bakstenen < 11; bakstenen++) {
                    g.setColor(Color.red);
                    g.fill3DRect(x + 5, y + 5, breedte - 10, hoogte - 10, true);
                    x += breedte;
                }
                y += hoogte;
                if ((regel % 2) == 0) {
                    x = -20;
                } else {
                    x = 0;
                }
            }
        } else if (betonblok) {

            for (int regel = 0; regel < 15; regel++) {

                for (int betonblokken = 0; betonblokken < 11; betonblokken++) {
                    g.setColor(Color.gray);
                    g.drawRect(x, y, breedte, hoogte);
                    x += breedte;
                }
                y += hoogte;
                if ((regel % 2) == 0) {
                    x = -30;
                } else {
                    x = 0;
                }
            }
        }
    }

        class knopbaksteenListener implements ActionListener {

            public void actionPerformed(ActionEvent e) {

                baksteen = true;
                betonblok = false;
                check = true;
                breedte = 40;
                hoogte = 25;
                x = 0;
                y = 0;
                repaint();

            }
        }

        class knopbetonblokListener implements ActionListener {

            public void actionPerformed(ActionEvent e) {

                baksteen = false;
                betonblok = true;
                check = true;
                breedte = 60;
                hoogte =40;
                x = 0;
                y = 0;
                repaint();

            }
        }
}
