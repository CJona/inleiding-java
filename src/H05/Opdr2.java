package H05;

import com.sun.org.apache.xpath.internal.operations.Variable;

import java.applet.Applet;
import java.awt.*;

public class Opdr2 extends Applet {
    int valerie;
    int hoogteXAs;





    public void init() {

        hoogteXAs = 210;
        valerie = 40;


    }



    public void paint(Graphics g) {
        // Grafiek X & Y lijntjes
        g.drawLine(30, 10, 30, 210);
        g.drawLine(30, hoogteXAs, 170, hoogteXAs);
        // Indicatie waardes
        g.drawString("0", 20, 215);
        g.drawString("20", 13, 175);
        g.drawString("40", 13, 135);
        g.drawString("60", 13, 95);
        g.drawString("80", 13, 55);
        g.drawString("100", 7, 15);
        // Valerie
        g.setColor(Color.blue);
        g.fillRect(50, hoogteXAs - valerie, 20, 80);
        g.drawString("Valerie", 40, 230);
        g.setColor(Color.black);
        g.drawRect(50, 130, 20, 80);
        // Jeroen
        g.setColor(Color.red);
        g.fillRect(90, 50, 20, 160);
        g.drawString("Jeroen", 85, 230);
        g.setColor(Color.black);
        g.drawRect(90, 50, 20, 160);
        // Hans
        g.setColor(Color.CYAN);
        g.fillRect(130, 10, 20, 200);
        g.drawString("Hans", 130, 230);
        g.setColor(Color.black);
        g.drawRect(130, 10, 20, 200);

        g.drawString("Jonathan Cameron", 250, 250 );
    }

}


