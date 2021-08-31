package JButton;

import javax.swing.*;
import java.awt.*;

public class _2_JButton extends JFrame {
    private Container c;
    private JButton b1, b2, b3;
    private Font font;
    private Cursor cursor;
    private ImageIcon img;

    _2_JButton() {
        initComponents();
    }

    public void initComponents() {
        c = this.getContentPane();
        c.setLayout(null);
        font = new Font("Arial", Font.BOLD, 14);
        cursor = new Cursor(Cursor.HAND_CURSOR);
        img = new ImageIcon(getClass().getResource("button_noun_002_05071.jpg"));

        b1 = new JButton("Submit");
        b1.setBounds(50, 50, 130, 25);
        b1.setFont(font);
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.BLACK);
        b1.setCursor(cursor);
        c.add(b1);

        b2 = new JButton("Clear");
        b2.setBounds(200, 50, 130, 25);
        b2.setForeground(Color.WHITE);
        b2.setBackground(Color.BLACK);
        b2.setCursor(cursor);
        b2.setFont(font);
        c.add(b2);

        b3 = new JButton(img);
        b3.setBounds(350, 50, 130, 25);
        b3.setCursor(cursor);
        c.add(b3);

    }

    public static void main(String[] args) {
        _2_JButton frame = new _2_JButton();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setBounds(50, 50, 800, 600);
        frame.getContentPane().setBackground(Color.PINK);
        frame.setTitle("JButton");
    }
}
