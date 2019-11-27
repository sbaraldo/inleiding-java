package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht8PraktijkOpdracht extends Applet {

    TextField tekstvak1;
    TextField tekstvak2;
    Button keerknop;
    Button delenknop;
    Button plusknop;
    Button minknop;
    double getal1;
    double getal2;

    public void init() {

        setSize(400,400);

        tekstvak1 = new TextField(15);
        add(tekstvak1);

        tekstvak2 = new TextField(15);
        add(tekstvak2);

        keerknop = new Button("*");
        keerknop.addActionListener(new keerknopListener());
        add(keerknop);

        delenknop = new Button("/");
        delenknop.addActionListener(new delenknopListener());
        add(delenknop);

        plusknop = new Button("+");
        plusknop.addActionListener(new plusknopListener());
        add(plusknop);

        minknop = new Button("-");
        minknop.addActionListener(new minknopListener());
        add(minknop);

    }


    public void paint(Graphics g) {



    }

    class keerknopListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

        getal1 = Double.parseDouble(tekstvak1.getText());
        getal2 = Double.parseDouble(tekstvak2.getText());
        double resultaat = (getal1 * getal2);
        tekstvak1.setText(" " + resultaat);
        tekstvak2.setText(" ");

        }
    }

    class delenknopListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            getal1 = Double.parseDouble(tekstvak1.getText());
            getal2 = Double.parseDouble(tekstvak2.getText());
            double resultaat = (getal1 / getal2);
            tekstvak1.setText(" " + resultaat);
            tekstvak2.setText(" ");

        }
    }

    class plusknopListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            getal1 = Double.parseDouble(tekstvak1.getText());
            getal2 = Double.parseDouble(tekstvak2.getText());
            double resultaat = (getal1 + getal2);
            tekstvak1.setText(" " + resultaat);
            tekstvak2.setText(" ");

        }
    }

    class minknopListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            getal1 = Double.parseDouble(tekstvak1.getText());
            getal2 = Double.parseDouble(tekstvak2.getText());
            double resultaat = (getal1 - getal2);
            tekstvak1.setText(" " + resultaat);
            tekstvak2.setText(" ");

        }
    }

}
