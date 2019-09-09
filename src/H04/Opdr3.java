package H04;

import java.awt.*;
import java.applet.*;

public class Opdr3 extends Applet {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {

	  // Rood
        g.setColor(Color.red);
        g.fillRect(100, 80, 90, 20);
        // Wit
        g.setColor(Color.white);
        g.fillRect(100, 100, 90, 20);
        // Blauw
        g.setColor(Color.blue);
        g.fillRect(100, 120, 90, 20);
        // zwart omring lijnen
        g.setColor(Color.black); //
        g.drawRect(100, 80, 90, 20);
        g.drawRect(100, 100, 90, 20);
        g.drawRect(100, 120, 90, 20);
        // Stok
        g.drawRect(100, 140, 10, 30);

        g.drawString("Jona Made This", 260, 260);


    }
}