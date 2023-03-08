
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AwtaAndSwing extends Frame {

    public static void main(String[] args) {
        JFrame f1 = new JFrame("Jframe");
        JLabel l1 = new JLabel("userName");
        f1.setSize(500, 500);
        f1.setVisible(true);
        f1.add(l1);

        f1.setLocation(1000, 100);
        f1.setDefaultCloseOperation(2);

    }
}