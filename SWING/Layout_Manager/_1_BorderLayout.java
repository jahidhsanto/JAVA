package Layout_Manager;

import javax.swing.*;
import java.awt.*;

public class _1_BorderLayout extends JFrame {
    Container c;
    JButton btn1, btn2, btn3, btn4, btn5;

    _1_BorderLayout() {
        initComponent();
    }

    public void initComponent() {
        c = this.getContentPane();

        JButton btn1 = new JButton("NORTH");
        JButton btn2 = new JButton("SOUTH");
        JButton btn3 = new JButton("EAST");
        JButton btn4 = new JButton("WEST");
        JButton btn5 = new JButton("CENTER");

        c.add(btn1, BorderLayout.NORTH);
        c.add(btn2, BorderLayout.SOUTH);
        c.add(btn3, BorderLayout.EAST);
        c.add(btn4, BorderLayout.WEST);
        c.add(btn5, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        _1_BorderLayout frame = new _1_BorderLayout();
        frame.setVisible(true);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}
