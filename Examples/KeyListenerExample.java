
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListenerExample extends JFrame implements KeyListener {

    JTextArea ar;
    JLabel lb;

    KeyListenerExample() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(400, 400);
        setTitle("Key Example");

        lb = new JLabel();
        lb.setBounds(20, 50, 100, 20);
        add(lb);

        ar = new JTextArea();
        ar.setBounds(20, 80, 300, 300);
        add(ar);

        ar.addKeyListener(this);

    }

    public static void main(String[] args) {
        new KeyListenerExample();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        lb.setText("Key Typed");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        lb.setText("Key Pressed");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        lb.setText("Key Released");
    }
}
