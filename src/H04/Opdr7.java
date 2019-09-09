package H04;

import java.applet.Applet;
import java.awt.*;

public class Opdr7 extends Applet {
    public void init(){
    }

    public void paint(Graphics g) {
        setBackground(Color.BLACK);
        // Vierkant
        g.setColor(Color.GREEN);
        g.drawRoundRect(50, 50, 250, 250, 20, 20);
        // 4 puntjes in vierkant
        g.fillOval(200, 100, 55, 55);
        g.fillOval(100, 100, 55, 55);
        g.fillOval(100, 200, 55, 55);
        g.fillOval(200, 200, 55, 55);




    }
}
