package JLabel;

import javax.swing.*;

public class _3_JLabel extends JFrame {

    public static void main(String[] args) {
        _3_JLabel frame = new _3_JLabel();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setBounds(0, 0, 800, 600);
        frame.setLayout(null);
        frame.setTitle("JHS COMPANY");

        JLabel l1 = new JLabel("Lebel 1");
        l1.setBounds(50, 50, 100, 30);

        frame.add(l1);

        JOptionPane.showInputDialog(frame, "Input your name: frame");
        JOptionPane.showInputDialog(l1, "Input your name: Label");
    }
}
