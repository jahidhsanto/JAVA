package JFrame;

import javax.swing.*;

public class _1_Frame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //frame.setSize(400, 300);
        //frame.setLocationRelativeTo(null);
        //frame.setLocation(200, 50);
        frame.setBounds(200, 50, 400, 300);
        frame.setTitle("Frame_1");
        frame.setResizable(false);
    }
}
