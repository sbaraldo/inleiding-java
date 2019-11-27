package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht10_4 extends Applet {

    TextField tekstvak;
    TextField schrikkeljaartekstvak;
    Label label;
    Label schrikkeljaarlabel;
    String maandstring;
    String jaarstring;
    int maand;
    int jaartal;
    int schrikkeljaar;

    public void init() {

        setSize(400,400);

        schrikkeljaar = 28;

        tekstvak = new TextField(10);
        label = new Label("Maandnummer");
        tekstvak.addActionListener(new tekstvakListener());
        add(label);
        add(tekstvak);

        schrikkeljaartekstvak = new TextField(10);
        schrikkeljaarlabel = new Label("jaar");
        schrikkeljaartekstvak.addActionListener(new schrikkeljaartekstvakListener());
        add(schrikkeljaarlabel);
        add(schrikkeljaartekstvak);



    }

    public void paint(Graphics g) {

        g.drawString("" + maandstring,50,50);
        g.drawString("" + jaarstring, 50,70);

    }

    class tekstvakListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            int maand = Integer.parseInt(tekstvak.getText());

            switch (maand) {
                case 1:
                    maandstring = "Januari heeft 31 dagen";
                    break;
                case 2:
                    maandstring = "Februari heeft " + schrikkeljaar + " dagen";
                    break;
                case 3:
                    maandstring = "Maart heeft 31 dagen";
                    break;
                case 4:
                    maandstring = "April heeft 30 dagen";
                    break;
                case 5:
                    maandstring = "Mei heeft 31 dagen";
                    break;
                case 6:
                    maandstring = "Juni heeft 30 dagen";
                    break;
                case 7:
                    maandstring = "Juli heeft 31 dagen";
                    break;
                case 8:
                    maandstring = "Augustus heeft 31 dagen";
                    break;
                case 9:
                    maandstring = "September heeft 30 dagen";
                    break;
                case 10:
                    maandstring = "Oktober heeft 31 dagen";
                    break;
                case 11:
                    maandstring = "November heeft 30 dagen";
                    break;
                case 12:
                    maandstring = "December heeft 31 dagen";
                    break;
                default:
                    maandstring =  "Kies maandnummer 1 t/m 12";
            }
            repaint();

        }
    }

    class schrikkeljaartekstvakListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {

        int jaartal = Integer.parseInt(schrikkeljaartekstvak.getText());

        if ((jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                    jaartal % 400 == 0) {
            jaarstring = "" + jaartal + " is een schrikkeljaar";
            schrikkeljaar = 29;
        } else {
            jaarstring = "" + jaartal + " is geen schrikkeljaar";
            schrikkeljaar = 28;
        }
        repaint();

        }
    }
}