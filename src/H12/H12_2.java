package H12;

import java.applet.Applet;
import java.awt.*;

public class H12_2 extends Applet {
    Button[] knop = new Button[25];


    public void init() {
        setBackground(Color.PINK);

        for (int i = 0; i < knop.length; i++) {
            knop[i] = new Button("knop " + (i + 1));
            add(knop[i]);
        }
    }
}
