package H06;


import java.awt.*;
import java.applet.*;

public class H06_PO extends Applet{

    public void init() {

        setBackground(Color.black);
    }

    double cijfer1 = 5.9;
    double cijfer2 = 6.3;
    double cijfer3 = 6.9;
    double gemiddelde = (cijfer1 + cijfer2 + cijfer3) / 3;
    double gemiddeldegeheel = gemiddelde * 10;
    double gemiddeldegeheel2 = (int) gemiddeldegeheel;
    double gemiddeldegeheel3 = (double) gemiddeldegeheel2 / 10;


    public void paint(Graphics g) {

        g.setColor(Color.GREEN);
        g.drawString( " uitkomst is " + gemiddeldegeheel3, 50,20);
    }
}




