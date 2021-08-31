package JButton;

import javax.swing.*;
import java.awt.*;

public class _1_JButton extends JFrame {
    private Container c;
    private JButton b1, b2;
    private Font font;

    _1_JButton() {
        initComponents();
    }

    public void initComponents() {
        c = this.getContentPane();
        c.setLayout(null);
        font = new Font("Arial", Font.BOLD, 14);

        b1 = new JButton("Submit");
        b1.setBounds(50, 50, 130, 25);
        b1.setFont(font);
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.BLACK);
        c.add(b1);

        b2 = new JButton("Clear");
        b2.setBounds(200, 50, 130, 25);
        b2.setForeground(Color.WHITE);
        b2.setBackground(Color.BLACK);
        b2.setFont(font);
        c.add(b2);

    }

    public static void main(String[] args) {
        _1_JButton frame = new _1_JButton();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setBounds(50, 50, 800, 600);
        frame.getContentPane().setBackground(Color.PINK);
        frame.setTitle("JButton");
    }
}
