package H12;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;

public class H12_6 extends Applet {

    double[] getal = {0, 1, 1, 2, 3, 3, 4, 4, 5, 5, 6, 6, 6, 6, 6, 7, 8, 8, 8, 9, 9, 9, 10, 10};
    boolean gevonden;
    int teller = 0;
    String tekst = "";
    TextField tekstvak = new TextField("typ getal", 20);

    public void init() {
        setSize(500, 500);
        gevonden = false;
        tekstvak.addActionListener(new OkListener());
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString("" + tekst, 20, 50);
    }

    class OkListener implements ActionListener {
        public void actionPerformed(ActionEvent a) {
            int tempgetal = Integer.parseInt(tekstvak.getText());
            for(int i = 0; i < getal.length && gevonden == false; i++) {
                if(tempgetal == getal[i]) {
                    teller++;
                }
            }
            if( teller > 0) {
                tekst = "De waarde is " + teller + " keer gevonden";
            }
            else {
                tekst = "De waarde is niet gevonden";
            }
            repaint();
            gevonden = false;
            tekstvak.setText("");
            teller = 0;
        }
    }
}
