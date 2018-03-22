import javax.swing.JApplet;
import java.awt.*;

public class Artsakh extends JApplet {

    public void init() {
        setSize(500, 300);
    }

    public void paint(Graphics g){
        g.setColor(Color.RED);
        g.fillRect(0,0,500,100);
        g.setColor(Color.BLUE);
        g.fillRect(0,100,500,100);
        g.setColor(new Color(250, 142, 0, 255));
        g.fillRect(0,200,500,100);
        g.setColor(Color.WHITE);

        for(int i = 480, j = 0; i >= 340; i -= 20, j += 20) {
            g.fillRect(i, j, 20, 20);
        }
        for(int i = 340, j = 140; i <= 500; i += 20, j += 20) {
            g.fillRect(i, j, 20, 20);
        }
    }

}
