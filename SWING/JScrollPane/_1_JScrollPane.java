package JScrollPane;

import javax.swing.*;
import java.awt.*;

public class _1_JScrollPane extends JFrame {
    private Container c;
    private JTextArea ta;
    private JScrollPane scroll;

    _1_JScrollPane() {
        initComponent();
    }

    public void initComponent() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);

        ta = new JTextArea();
        ta.setFont(new Font("Arial", Font.BOLD, 20));
        ta.setWrapStyleWord(true);

        scroll = new JScrollPane(ta, JScrollPane.VERTICAL_SCROLLBAR_NEVER, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scroll.setBounds(50, 50, 300, 200);
        c.add(scroll);

    }

    public static void main(String[] args) {
        _1_JScrollPane frame = new _1_JScrollPane();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("JTextArea");
        frame.setBounds(100, 50, 500, 400);
        frame.setTitle("Line Wrapping");
    }
}
