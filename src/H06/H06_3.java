package H06;

import java.applet.Applet;
import java.awt.*;

public class H06_3 extends Applet {
    int getalt1 = 10;
    int getalt2 = 10;



    public void init() {
        setBackground(Color.RED);
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.setFont(new Font("default", Font.BOLD, 20));
        g.drawString("" + -getalt1 + getalt2, 50, 100);
    }
}
