package Layout_Manager;

import javax.swing.*;
import java.awt.*;

public class _3_FlowLayout extends JFrame {
    Container c;
    JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;

    _3_FlowLayout() {
        initContainer();
    }

    public void initContainer() {
        c = this.getContentPane();

        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");
        btn7 = new JButton("7");
        btn8 = new JButton("8");
        btn9 = new JButton("9");

        c.add(btn1);
        c.add(btn2);
        c.add(btn3);
        c.add(btn4);
        c.add(btn5);
        c.add(btn6);
        c.add(btn7);
        c.add(btn8);
        c.add(btn9);

        c.setLayout(new FlowLayout());
        c.setLayout(new FlowLayout(FlowLayout.CENTER));
        c.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));

    }

    public static void main(String[] args) {
        _4_BoxLayout frame = new _4_BoxLayout();
        frame.setVisible(true);
        frame.setSize(300, 300);
        //frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
/*
FlowLayout(): creates a flow layout with centered alignment and a default 5 unit horizontal and vertical gap.
FlowLayout(int align): creates a flow layout with the given alignment and a default 5 unit horizontal and vertical gap.
FlowLayout(int align, int hgap, int vgap): creates a flow layout with the given alignment and the given horizontal and vertical gap.
 */