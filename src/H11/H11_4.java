package H11;

import java.applet.Applet;
import java.awt.*;

public class H11_4 extends Applet {

    public void init() {
        setBackground(Color.PINK);
    }

    public void paint(Graphics g) {
        g.setFont(new Font("default",Font.BOLD, 15));
        g.drawString("tafel van 3", 50, 20);

    int x = 50;
    int y = 60;
     for (int i = 1; i < 11; i++) {

            g.drawString(i+" * 3 = "+(i*3), x, y);

            y += 20;
     }
    }
}
