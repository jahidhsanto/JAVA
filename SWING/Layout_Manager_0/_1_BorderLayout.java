package Layout_Manager_0;

import javax.swing.*;
import java.awt.*;

public class _1_BorderLayout extends JFrame {
    private Container c;
    private JButton btn1, btn2, btn3, btn4, btn5;
    private BorderLayout bLayout;

    _1_BorderLayout() {
        initComponents();
    }

    public void initComponents() {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 500, 500);
        this.setTitle("BorderLayout");

        c = this.getContentPane();

        bLayout = new BorderLayout();
        bLayout.setHgap(10);
        bLayout.setVgap(10);

        c.setLayout(bLayout);

        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");

        c.add(btn1, BorderLayout.NORTH);
        c.add(btn2, BorderLayout.WEST);
        c.add(btn3, BorderLayout.CENTER);
        c.add(btn4, BorderLayout.EAST);
        c.add(btn5, BorderLayout.SOUTH);

    }

    public static void main(String[] args) {
        _1_BorderLayout frame = new _1_BorderLayout();
        frame.setVisible(true);
    }
}
