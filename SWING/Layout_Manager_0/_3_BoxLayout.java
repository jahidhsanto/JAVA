package Layout_Manager_0;

import javax.swing.*;
import java.awt.*;

public class _3_BoxLayout extends JFrame {
    private Container c;
    private JButton btn1, btn2, btn3, btn4, btn5;
    private BoxLayout box;

    _3_BoxLayout() {
        initComponents();
    }

    public void initComponents() {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 500, 500);
        this.setTitle("BoxLayout");

        c = this.getContentPane();

        // BoxLayout (Container c, int axis)
        box = new BoxLayout(c, BoxLayout.X_AXIS);
        c.setLayout(box);

        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");

        c.add(btn1);
        c.add(Box.createHorizontalStrut(20));
        c.add(btn2);
        c.add(btn3);
        c.add(btn4);
        c.add(btn5);

    }

    public static void main(String[] args) {
        _3_BoxLayout frame = new _3_BoxLayout();
        frame.setVisible(true);
    }
}
