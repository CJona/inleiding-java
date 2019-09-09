package H04;
import java.awt.*;
import java.applet.*;

public class Opdr6 extends Applet {

    public void init() {
        setBackground(Color.WHITE);
    }

    public void paint(Graphics g) {
        // Bord
        g.setColor(Color.BLACK);
        g.fillRoundRect(40, 20, 40, 80, 20, 20);
        // Paal
        g.fillRect(55, 80, 10, 100 );
        // Rood licht
        g.setColor(Color.red);
        g.fillOval(50, 25, 20, 20);
        // Oranje licht
        g.setColor(Color.orange);
        g.fillOval(50, 50, 20, 20);
        // Groen licht
        g.setColor(Color.green);
        g.fillOval(50, 75, 20, 20);

        // Handtekening
        g.setColor(Color.RED);
        g.drawString("Jona made This", 100, 250);



    }
}
