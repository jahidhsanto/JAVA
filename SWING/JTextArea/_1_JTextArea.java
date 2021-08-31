package JTextArea;

import javax.swing.*;
import java.awt.*;

public class _1_JTextArea extends JFrame {
    private Container c;
    private JTextArea ta;

    _1_JTextArea() {
        initComponent();
    }

    public void initComponent() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);

        ta = new JTextArea();
        ta.setBounds(50, 50, 300, 200);
        c.add(ta);
    }

    public static void main(String[] args) {
        _2_JTextArea frame = new _2_JTextArea();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("JTextArea");
        frame.setBounds(100, 50, 500, 400);
        frame.setTitle("JTextArea");
    }
}

/*
JTextArea()	                                Creates a text area that displays no text initially.
JTextArea(String s)	                        Creates a text area that displays specified text initially.
JTextArea(int row, int column)	            Creates a text area with the specified number of rows and columns that displays no text initially.
JTextArea(String s, int row, int column)	Creates a text area with the specified number of rows and columns that displays specified text.
 */