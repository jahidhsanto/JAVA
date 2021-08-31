package JPasswordField;

import javax.swing.*;
import java.awt.*;

public class _1_JPasswordField extends JFrame {
    private Container c;
    private JPasswordField pf;
    private Font font;

    _1_JPasswordField() {
        initcComponents();
    }

    public void initcComponents() {
        c = this.getContentPane();
        c.setLayout(null);

        pf = new JPasswordField();
        pf.setBounds(50, 50, 130, 25);
        c.add(pf);

        // To set character in passwordfield
        pf.setEchoChar('*');
        font = new Font("Arial", Font.BOLD, 20);

        // To set font in JPasswordField
        pf.setFont(font);

        // Set Foreground & Background
        pf.setForeground(Color.WHITE);
        pf.setBackground(Color.BLACK);
    }

    public static void main(String[] args) {
        _1_JPasswordField frame = new _1_JPasswordField();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setBounds(50, 50, 800, 600);
        frame.getContentPane().setBackground(Color.yellow);
        frame.setTitle("JPassword Field");

    }
}
