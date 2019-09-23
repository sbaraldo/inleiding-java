package h04;

import com.sun.prism.shader.FillRoundRect_Color_Loader;

import java.applet.Applet;
import java.awt.*;

public class Opdracht4_6 extends Applet {


    public void paint(Graphics g) {

        //stoplicht vorm
        g.fillRoundRect(120,80,100,200,10,10);
        //stoplicht kleur en ovalen vorm
        g.setColor(Color.red);
        g.fillOval(145,85,50,50);
        g.setColor(Color.orange);
        g.fillOval(145,150,50,50);
        g.setColor(Color.green);
        g.fillOval(145,215,50,50);






    }
}
