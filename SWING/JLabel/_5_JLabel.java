package JLabel;

import javax.swing.*;
import java.awt.*;

public class _5_JLabel {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Forground & Background color of JLabel");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setBounds(50, 50, 800, 600);
        frame.setLayout(null);

        JLabel H1;
        Font f_H1 = new Font("Times new roman", Font.BOLD, 36);


        H1 = new JLabel("JHS Company");
        H1.setBounds(50, 50, 400, 30);
        H1.setFont(f_H1);
        frame.add(H1);
        H1.setForeground(Color.WHITE);
        H1.setOpaque(true);
        H1.setBackground(Color.BLACK);
        H1.setToolTipText(H1.getText());

    }
}
