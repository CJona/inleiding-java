package H05;

import java.applet.Applet;
import java.awt.*;

public class H05_1 extends Applet {

    int width;
    int height;




    public void init() {
        setBackground(Color.white);
        width = 100;
        height = 50;
    }

    public void paint(Graphics g) {
        g.setColor(Color.magenta);
        // Magenta om Ovaal heen
        g.fillRect(120, 50, width, height);
        // Ovaal
        g.fillOval(120, 120, width, height);
        // Taart
        g.fillArc(250, 50, width, height, 0, 45);

        g.setColor(Color.black);
        // Lijn
        g.drawLine(10, 20, 100, 20);
        g.drawString("Lijn", 40, 35);
        // Rechthoek
        g.drawRect(10, 50, width, height);
        g.drawString("Rechthoek", 25, 115);
        // afgeRonde Rechthoek
        g.drawRoundRect(10, 120, width, height, 30, 30);
        g.drawString("Afgeronde rechthoek", 0, 185);
        // ovaal in Magneta Rechthoek
        g.drawOval(120, 50, width, height);
        g.drawString("Gevulde rechthoek met ovaal", 105, 115);
        // Cirkel
        g.drawString("Cirkel", 250, 185);
        g.drawOval(240, 120, 50, height);
        // Gevulde ovaal
        g.drawString("Gevulde ovaal", 125, 185);
        // Taart
        g.drawString("Taartpunt met ovaal eromheen", 275, 115);
        g.drawOval(250, 50, width, height);

        // Naam Dikgedrukt.
        g.setColor(Color.GREEN);
        g.setFont(new Font("default", Font.BOLD, 40));
        g.drawString("Jona made this", 100, 250);


    }
}




