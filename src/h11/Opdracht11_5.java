package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht11_5 extends Applet {


    public void init() {

    }


    public void paint(Graphics g) {

      int teller;
      int y = 50;
      int y1 = 70;
      int x = 50;
      int x1 = 70;

      for (teller = 0; teller <5; teller++) {

          // dit is 1 vierkant
          g.drawLine(x,y,x1,y);
          g.drawLine(x1,y,x1,y1);
          g.drawLine(x,y,x,y1);
          g.drawLine(x,y1,x1,y1);

          x += 20;
          x1 += 20;
          y += 20;
          y1 += 20;
      }





    }
}
