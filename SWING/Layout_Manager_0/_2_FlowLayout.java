package Layout_Manager_0;

import javax.swing.*;
import java.awt.*;

public class _2_FlowLayout extends JFrame {
    private Container c;
    private JButton btn1, btn2, btn3, btn4, btn5;
    private FlowLayout fLayout;

    _2_FlowLayout() {
        initComponents();
    }

    public void initComponents() {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 500, 500);
        this.setTitle("FlowLayout");

        c = this.getContentPane();

        fLayout = new FlowLayout(FlowLayout.LEFT);
        fLayout.setHgap(10);
        fLayout.setVgap(30);

        c.setLayout(fLayout);

        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");

        c.add(btn1);
        c.add(btn2);
        c.add(btn3);
        c.add(btn4);
        c.add(btn5);

    }

    public static void main(String[] args) {
        _2_FlowLayout frame = new _2_FlowLayout();
        frame.setVisible(true);
    }
}
