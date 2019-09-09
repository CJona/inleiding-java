package H04;

import java.applet.Applet;
import java.awt.*;

public class PraktijkOpdr extends Applet {


    public class PraktijkOpd extends Applet {
    }
    public void init(){
        setBackground(Color.white);
    }
    public void paint(Graphics g) { g.setColor(Color.magenta);
        // Magenta om Ovaal heen
        g.fillRect(120, 10, 100, 50);
        // Ovaal
        g.fillOval(120, 90, 100, 50);
        // Taart
        g.fillArc(250, 10, 100, 50, 0, 45);

        g.setColor(Color.black);
        // Lijn
        g.drawLine(10, 20, 100, 20);
        g.drawString("Lijn", 40, 35);
        // Rechthoek
        g.drawRect(10, 50, 80, 50);
        g.drawString("Rechthoek", 25, 115);
        // Ronde Rechthoek
        g.drawRoundRect(10, 120, 90, 50, 30, 30);
        g.drawString("Afgeronde rechthoek", 0, 185);
        // volle Ovaal met rechthoek
        g.drawOval(120, 10, 100, 50);
        g.drawString("Gevulde rechthoek met ovaal", 105, 75);
        // Gevulde ovaal
        g.drawString("Gevulde ovaal", 125, 155);
        g.drawOval(240, 90, 50, 50);
        // Cirkel
        g.drawString("Cirkel", 245, 160);
        g.drawOval(250, 10, 100, 50);
        // Taart
        g.drawString("Taartpunt met ovaal eromheen", 275, 75);
        // Naam Dikgedrukt.
        g.setColor(Color.GREEN);
        g.setFont(new Font("default",Font.BOLD,40));
        g.drawString("Jona made this",100, 250);


    }


    }
