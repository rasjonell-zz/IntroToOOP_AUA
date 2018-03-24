import java.awt.*;

public class Birds extends Animator {
    private char nose = '<', nose1 = '>';
    private int counter = 0;

    public void snapshot(Graphics g) {
        g.drawString("___(*)" + nose, 50, 50);
        g.drawString("\\___/", 50, 65);
        g.drawString(nose + "(*)___", 100, 50);
        g.drawString("\\___/", 115, 65);
        switch (nose, nose1) {
            case '<':
                nose++;
                nose1--;
                break;
            case '=':
                nose++;
                nose1--;
                break;
            case '>':
                nose = '<';
                nose = '>';
                break;
        }
    }
//
//    public boolean tick() {
//    }
}
