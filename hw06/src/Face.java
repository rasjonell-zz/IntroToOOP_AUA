import javax.swing.*;
import java.awt.*;

public class Face extends JApplet {
    private int eyeWidth = 50;
    private int mood = -90;

    public void paint(Graphics g) {
        drawSmile(g);
        drawFace(g);
    }

    public void start() {
        mood += 90;
    }

    public void stop() {
        mood += 90;
    }

    private void drawFace(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawOval(eyeWidth, eyeWidth, 7*eyeWidth/2, 7*eyeWidth/2);
        g.drawOval(0,9*eyeWidth/4, eyeWidth, eyeWidth);
        g.drawOval(9*eyeWidth/2, 9*eyeWidth/4, eyeWidth, eyeWidth);
        g.drawOval(3*eyeWidth/2, 9*eyeWidth/4, eyeWidth, eyeWidth);
        g.drawOval(3*eyeWidth, 9*eyeWidth/4, eyeWidth, eyeWidth);
        g.fillOval(2*eyeWidth-10, 11*eyeWidth/4-10, 20,20);
        g.fillOval(7*eyeWidth/2-10, 11*eyeWidth/4-10, 20,20);
    }

    private void drawSmile(Graphics g) {
        g.drawArc(7*eyeWidth/4+eyeWidth/2, 3*eyeWidth,eyeWidth,eyeWidth,mood,-180);
    }
}
