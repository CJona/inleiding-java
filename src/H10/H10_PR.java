package H10;

import sun.applet.AppletResourceLoader;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H10_PR  extends Applet {
    TextField input1;
    Button ok;
    String s;

    public void init() {
        setSize(200,110);
        setBackground(Color.black);
        input1 = new TextField("", 10);
        ok = new Button("OK");
        ok.addActionListener( new OkListener());
        add(input1);
        add(ok);
    }


    public void paint(Graphics g) {
        g.setFont(new Font("default", Font.BOLD, 14));
        g.setColor(Color.CYAN);
        g.drawString("" + s, 20, 60);
    }

    class OkListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            int tempgetal = Integer.parseInt(input1.getText());
            switch (tempgetal) {

                case 1: s = "Een "+tempgetal+" is zeer slecht."; break;
                case 2: s = "Een "+tempgetal+" is een slecht."; break;
                case 3: s = "Een "+tempgetal+" is een slecht"; break;
                case 4: s = "Een "+tempgetal+" is een onvoldoende"; break;
                case 5: s = "Een "+tempgetal+" is een matig"; break;
                case 6: s = "Een "+tempgetal+" is een voldoende"; break;
                case 7: s = "Een "+tempgetal+" is een voldoende"; break;
                case 8: s = "Een "+tempgetal+" is een Goed!"; break;
                case 9: s = "Een "+tempgetal+" is een Goed!"; break;
                case 10: s = "Een "+tempgetal+" is een Perfect!!!"; break;
                default: s = "verkeerd Cijfer"; break;
            }
                repaint();
        }
    }


}
