package JLabel;

import javax.swing.*;
import java.awt.*;

public class _4_JLabel extends JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Font style & size of JLabel");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setBounds(50, 50, 800, 600);
        frame.setLayout(null);

        JLabel l1, l2;
        Font f = new Font("Arial", Font.BOLD, 14);

        l1 = new JLabel("ENTER YOUR USERNAME: ");
        l1.setBounds(50, 50, 200, 30);
        l1.setFont(f);
        frame.add(l1);

        l2 = new JLabel("ENTER YOUR PASSWORD: ");
        l2.setBounds(50, 80, 200, 30);
        l2.setFont(f);
        frame.add(l2);

    }
}