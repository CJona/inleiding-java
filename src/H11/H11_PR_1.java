package H11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H11_PR_1 extends Applet {

        TextField input1;
        Button ok;
        int inputgetal;
        int kanstringzien = 0;

    public void init() {
        setSize(400,400);
        input1 = new TextField("", 10);
        ok = new Button("ok");
        ok.addActionListener(new OkListener());
        add(input1);
        add(ok);

    }


    public void paint(Graphics g) {
        if (kanstringzien == 1) {
            int x = 10;
            int y = 60;
            g.drawString("tafel " + inputgetal, x, y);
            for (int i = 1; i < 11; i ++) {
                y += 15;
                g.drawString( i + " x " + inputgetal + " = " + (inputgetal * i), x, y);
            }

        }
        else g.drawString("typ getal", 30, 60);
    }

    class OkListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
          inputgetal = Integer.parseInt(input1.getText());
          kanstringzien = 1;
          repaint();
        }
    }


}
