package H06;

import java.applet.Applet;
import java.awt.*;

public class H06_2 extends Applet{
    //Variabelen declareren
    int uur;
    int dag;
    int jaar;


    public void init() {
        setBackground(Color.black);
        // Variabelen initialiseren
        uur = 60 * 60;
        dag = uur * 24;
        jaar = dag * 365;
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.setFont(new Font("default", Font.BOLD, 16));
        g.drawString("Seconde in een uur: " + uur, 50, 40 );
        g.drawString("Seconde in een dag: " + dag , 50, 80);
        g.drawString("Seconde in een Jaar: " + jaar, 50, 120);
    }
}
