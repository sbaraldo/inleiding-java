package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht12_6 extends Applet {

    int[] nummer = {1,2,2,3,4,5,5,5,6,7,8,8,9,9,9};
    int waardezoeker;
    int getalvoorgekomen;
    boolean verberg;
    TextField tekstvak;
    Button knop;




    public void init() {

        tekstvak = new TextField(5);
        add(tekstvak);

        knop = new Button("OK");
        knop.addActionListener(new knopListener());
        add(knop);


    }


    public void paint(Graphics g) {

        if (verberg) {
            g.drawString("Gezochte getal:" + waardezoeker,50,50);
            g.drawString("Getal is " + getalvoorgekomen + " keer voorgekomen",50,70);
        }
    }

    class knopListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            waardezoeker = Integer.parseInt(tekstvak.getText());
            verberg = true;
            getalvoorgekomen = 0;

            for (int i = 0; i < nummer.length; i++) {
                if (nummer[i] == waardezoeker) {
                    getalvoorgekomen++;
                }

            }
            repaint();

        }
    }

}
