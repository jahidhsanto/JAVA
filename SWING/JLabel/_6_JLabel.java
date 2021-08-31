package JLabel;

import javax.swing.*;
import java.awt.*;

public class _6_JLabel {
    public void main(String[] args) {
        JFrame frame = new JFrame("Add Image on JLabel");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setBounds(50, 50, 800, 600);
        frame.setLayout(null);

        JLabel l1;

        l1 = new JLabel("JHS COMPANY");
        frame.add(l1);
        l1.setBounds(50, 50, 400, 30);
        l1.setForeground(Color.WHITE);
        l1.setOpaque(true);
        l1.setBackground(Color.BLACK);

        JLabel imgLabel;

        ImageIcon img;

        //img = new ImageIcon(getI);



    }
}
