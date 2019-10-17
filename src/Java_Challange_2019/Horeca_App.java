package Java_Challange_2019;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Horeca_App extends Applet {
    Button Fris;
    Button Bier;
    Button Wijn;
    Button Koffie;
    Button Binnen;
    Button Buiten;
    Button NieuwBestel;
    double Fristie = 2.75;
    double Biertje = 2.50 ;
    double Wijntje = 2.25 ;
    double Koffietje = 2 ;
    double Binne = 3;
    double buite = 3.75;
    double Dagwaarde;
    double  beginwaarde = 0;




    public void init() {
        // Fris & Wijn
        Fris = new Button("Fris");
        add(Fris);

        Wijn = new Button("Wijn");
        add(Wijn);

        // Bier & koffei
        Bier = new Button("Bier");
        add(Bier);

        Koffie = new Button("Koffie");
        add(Koffie);

        // binnen
        Binnen = new Button("Binn gedist.");
        add(Binnen);

        Buiten = new Button("buiten gedist.");
        add(Buiten);

        NieuwBestel = new Button("Nieuwe Bestelling");
        add(NieuwBestel);

        // ActionListener
        Fris.addActionListener( new KnopListener() );
        Bier.addActionListener( new KnopListener2() );
        Wijn.addActionListener( new KnopListener3() );
        Koffie.addActionListener( new KnopListener4() );
        Buiten.addActionListener( new KnopListener5());
        Binnen.addActionListener( new KnopListener6());
        NieuwBestel.addActionListener(new KnopListener7());



    }

    public void paint(Graphics g) {
        setBackground(Color.GREEN);
        g.drawString("Bestelling totaal: " + beginwaarde, 50, 100 );
        g.drawString("Totaal dagomzet:" + Dagwaarde, 50, 120 );


    }


    class KnopListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {

           beginwaarde += Fristie;

            repaint();
        }
    }
    class KnopListener2 implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {

            beginwaarde += Biertje;
            repaint();
        }
    }
    class KnopListener3 implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {

           beginwaarde += Wijntje;
            repaint();
        }
    }
    class KnopListener4 implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
           beginwaarde += Koffietje;
            repaint();
        }
    }
    class KnopListener5 implements ActionListener {

        public void actionPerformed(ActionEvent e) {

          beginwaarde += Binne;
            repaint();
        }
    }
    class KnopListener6 implements ActionListener {

        public void actionPerformed(ActionEvent e) {

        beginwaarde += buite;
        repaint();
        }
    }
    class KnopListener7 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            Dagwaarde += beginwaarde;
            beginwaarde = 0;
            repaint();

        }
    }

}