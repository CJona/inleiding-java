package H11;

import java.applet.Applet;
import java.awt.*;

public class H11_6 extends Applet {

    public void init() {
        setSize(400, 400);
        setBackground(Color.GREEN);
    }

    public void paint(Graphics g) {

        int x = 100;
        int y = 100;
        int groote = 100;

            for (int i = 0; i < 10; i++ ) {
                g.drawOval(x, y, groote, groote);
                x += 5;
                y += 5;
                groote -= 10;
            }
    }
}