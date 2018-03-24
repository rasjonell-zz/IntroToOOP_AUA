import javax.swing.*;
import java.awt.*;

public class Animator extends JApplet {
    private double lag = 4;

    public void setLag(double powOf10) {
        this.lag = powOf10;
    }

    public double getLag() {
        return lag;
    }

    public boolean tick() {
        return true;
    }

    public void snapshot(Graphics g) {

    }

    public void delay() {
        for(int i=0; i<Math.pow(10, lag); i++);
    }

    public void paint(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.BLACK);
        snapshot(g);
        if(tick()) {
            delay();
            repaint();
        }
    }

}
