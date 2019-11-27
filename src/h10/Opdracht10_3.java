package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht10_3 extends Applet {

    TextField tekstvak;
    Label label;
    String maandstring;
    int maand;

    public void init() {

        setSize(400,400);

        tekstvak = new TextField(10);
        label = new Label("Maandnummer");
        tekstvak.addActionListener(new tekstvakListener());
        add(label);
        add(tekstvak);


    }

    public void paint(Graphics g) {

        g.drawString("" + maandstring,50,50);

    }

    class tekstvakListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            int maand = Integer.parseInt(tekstvak.getText());

            switch (maand) {
                case 1:
                    maandstring = "Januari heeft 31 dagen";
                    break;
                case 2:
                    maandstring = "Februari heeft 28 dagen";
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






}


