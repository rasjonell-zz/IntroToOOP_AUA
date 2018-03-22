import javax.swing.*;
import java.awt.*;

public class YinYang extends JApplet {
    public void init() {
        setSize(500, 500);
    }

    public void paint(Graphics g) {
        int radius = getWidth()/2;

        g.setColor(Color.BLACK);
        g.fillOval(0, 0, 2 * radius, 2 * radius);
        g.setColor(Color.WHITE);
        g.drawOval(0, 0, 2 * radius, 2 * radius);
        g.setColor(Color.WHITE);
        g.fillArc(0, 0, 2 * radius, 2 * radius, 270, 180);
        g.setColor(Color.BLACK);
        g.fillOval((radius / 2), 0, radius, radius);
        g.setColor(Color.WHITE);
        g.fillOval((radius / 2), radius, radius, radius);
        g.setColor(Color.WHITE);
        g.fillOval(radius - (radius / 4), radius / 4, radius / 2, radius / 2);
        g.setColor(Color.BLACK);
        g.fillOval(radius - (radius / 4), radius + radius / 4, radius / 2, radius / 2);
        g.drawOval(0, 0,500,500);

    }

}
