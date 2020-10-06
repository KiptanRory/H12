import java.applet.*;
import java.awt.*;

public class Opdracht1 extends Applet {
    double[] getal;
    double totaal;



    public void init() {
        getal = new double[10];

    }

    public void paint(Graphics g) {
        getal[0] = 5.7;
        getal[1] = 8.2;
        getal[2] = 2.2;
        getal[3] = 5.2;
        getal[4] = 5.6;
        getal[5] = 7.9;
        getal[6] = 1.1;
        getal[7] = 6.7;
        getal[8] = 5.8;
        getal[9] = 6.9;

        totaal = 0;

        for (int teller = 0; teller < getal.length; teller ++) {
            g.drawString("" + getal[teller], 50, 20 * teller + 20);
            totaal += getal [teller];
        }
        g.drawString("het gemiddelde =" + totaal/getal.length, 50,20 * (getal.length) + 20);
    }
}