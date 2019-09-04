package h01;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;

public class Opdr01 extends Applet {
    public void init() {
        setBackground(Color.white);


    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Jona", 50, 60);
        g.setColor(Color.red);
        g.drawString("Cameron", 30, 40);
    }
}
