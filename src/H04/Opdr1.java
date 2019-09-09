package H04;

import java.applet.Applet;
import java.awt.*;

public class Opdr1 extends Applet {
    public void init(){

    }
    public void paint(Graphics g) {
        g.drawLine(100, 100, 140, 100);
        g.drawLine(140, 100, 120, 70);
        g.drawLine(120, 70, 100, 100);
    }
}