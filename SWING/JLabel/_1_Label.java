package JLabel;

import javax.swing.*;
import java.awt.*;

public class _1_Label extends JFrame {
    private Container c;
    private JLabel userLabel;

    _1_Label() {
        initComponents();
    }

    public void initComponents() {
        c = this.getContentPane();
        c.setBackground(Color.PINK);

        c.setLayout(null);

        userLabel = new JLabel();
        userLabel.setBounds(50, 20, 150, 50);
        userLabel.setText("ENTER YOUR USERNAME: ");

        c.add(userLabel);

    }

    public static void main(String[] args) {

        _1_Label frame = new _1_Label();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200, 50, 500, 400);
        frame.setTitle("_1_Label");


    }
}
