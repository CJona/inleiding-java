package H11;

import java.applet.Applet;
import java.awt.*;

public class H11_9 extends Applet {

    @Override
    public void init() {
        setBackground(Color.PINK);
    }

    @Override
    public void paint(Graphics g) {
        // X en Y
        int x = 25;
        int y = 25;
        int grootte = 25;
            for (int kolom = 0; kolom < 8; kolom++) {
                for (int i = 0; i < 8; i++) {
                    if ((i + kolom) % 2 == 0) {

                        g.setColor(Color.CYAN);
                        g.fillRect(x, y, grootte, grootte);
                    } else {
                        g.setColor(Color.magenta);
                        g.fillRect(x, y, grootte, grootte);
                    }
                    x += 25;
                }
                x = 25;
                y += 25;
            }
    }
}



