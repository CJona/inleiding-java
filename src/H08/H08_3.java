package H08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class H08_3 extends Applet {

    TextField tekstvak;
    Button knop;
    Button reset;
    String schermtext = "Vul een cijfer in de tekstvak.";

    public void init() {
        setSize(400, 200);
        tekstvak = new TextField("", 30);
        knop = new Button("Ok");
        reset = new Button("Reset");
        tekstvak.addActionListener( new TekstVakListener());
        reset.addActionListener( new ResetListener() );
        knop.addActionListener( new KnopListener() );
        add(reset);
        add(tekstvak);
        add(knop);
    }

    public void paint(Graphics g) {
        g.drawString("" + schermtext , 50, 40 );
    }


    class KnopListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            schermtext = "21% van " + tekstvak.getText() + " is: " + ( Double.parseDouble(tekstvak.getText()) * 1.19);
            tekstvak.setText("");
            repaint();
        }
    }

    class ResetListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            schermtext = "Vul een prijs in om de BTW te berekenen.";
            tekstvak.setText("");
            repaint();
        }
    }

    class TekstVakListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            schermtext = "21% BTW bij " + tekstvak.getText() + " erbij is: " + ( Double.parseDouble(tekstvak.getText()) * 1.19);
            tekstvak.setText("");
            repaint();
        }
    }
}
