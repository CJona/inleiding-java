package H11;

import java.applet.Applet;
import java.awt.*;

public class H11_3 extends Applet {

    public void init() {
        setSize(500, 100);
    }

    public void paint(Graphics g) {
        int x = 10;
        int y = 20;
        int getal = 20;

        for(int i = 0; i < 10; i++) {
            x += 20;
            g.drawString(getal + "", x, y);
            getal--;
        }
    }
}
