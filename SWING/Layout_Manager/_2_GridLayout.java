package Layout_Manager;

import javax.swing.*;
import java.awt.*;

public class _2_GridLayout extends JFrame {
    Container c;
    JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;

    _2_GridLayout() {
        initComponent();
    }

    public void initComponent() {
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

        c.setLayout(new GridLayout(3, 3));
        c.setLayout(new GridLayout(3, 3, 10, 10));

    }

    public static void main(String[] args) {
        _2_GridLayout frame = new _2_GridLayout();
        frame.setVisible(true);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}

/*
Constructors of GridLayout class
GridLayout(): creates a grid layout with one column per component in a row.
GridLayout(int rows, int columns): creates a grid layout with the given rows and columns but no gaps between the components.
GridLayout(int rows, int columns, int hgap, int vgap): creates a grid layout with the given rows and columns alongwith given horizontal and vertical gaps.
 */