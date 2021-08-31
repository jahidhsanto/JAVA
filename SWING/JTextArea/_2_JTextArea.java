package JTextArea;

import javax.swing.*;
import java.awt.*;

public class _2_JTextArea extends JFrame {
    private Container c;
    private JTextArea ta;

    _2_JTextArea() {
        initComponent();
    }

    public void initComponent() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);

        ta = new JTextArea();
        ta.setBounds(50, 50, 300, 200);
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);
        c.add(ta);
    }

    public static void main(String[] args) {
        _2_JTextArea frame = new _2_JTextArea();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("JTextArea");
        frame.setBounds(100, 50, 500, 400);
        frame.setTitle("Line Wrapping");
    }
}
