package JTextField;

import javax.swing.*;
import java.awt.*;

public class _1_JTextField {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTextField");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setBounds(50, 50, 800, 600);
        frame.setLayout(null);
        frame.setBackground(Color.RED);
        frame.getContentPane().setBackground(Color.RED);

        JLabel l1, l2;

        l1 = new JLabel("Input your username: ");
        l1.setBounds(50, 50, 130, 25);
        frame.add(l1);

        l2 = new JLabel("Input your password: ");
        l2.setBounds(50, 80, 130, 25);
        frame.add(l2);

        JTextField tf1, tf2;

        tf1 = new JTextField();
        tf1.setBounds(180, 50, 200, 25);
        frame.add(tf1);

        tf2 = new JTextField("Badhon");
        tf2.setBounds(180, 80, 200, 200);
        frame.add(tf2);

        Font f = new Font("Arial", Font.BOLD + Font.ITALIC, 14);
        tf1.setFont(f);
        tf2.setFont(f);

        tf1.setForeground(Color.WHITE);
        tf1.setBackground(Color.BLACK);
        tf2.setForeground(Color.WHITE);
        tf2.setBackground(Color.BLACK);

        tf2.setHorizontalAlignment(JTextField.TOP);

    }
}
