package H08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class H08_1 extends Applet {
    Button knopOK;
    Button knopReset;
    TextField tekstvak;
    String message;

    public void init() {
        setBackground(Color.yellow);
        tekstvak = new TextField(20);
        add(tekstvak);

        knopOK = new Button( "OK" );
        knopOK.addActionListener(new KnopOKlistener());
        add(knopOK);

        knopReset = new Button("Reset");
        knopReset.addActionListener(new KnopOKlistener());
        add(knopReset);

        message = "Innit fam";
    }

    public void paint(Graphics g) {
        g.drawString(message, 20, 150);    }
    class KnopOKlistener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            message = tekstvak.getText();
            repaint();
        }
    }

    class KnopResetlistener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
        tekstvak.setText(" ");
        }
    }

}



