package JLabel;

import javax.swing.*;

public class _2_JLabel extends JFrame {
    private JLabel l1, l2;

    _2_JLabel() {
        initComponents();
    }

    public void initComponents() {

        l1 = new JLabel("ENTER YOUR USERNAME: ");
        l1.setBounds(50, 50, 100, 30);
        add(l1);

        l2 = new JLabel("ENTER YOUR PASSWORD: ");
        l2.setBounds(50, 80, 100, 30);
        add(l2);

        setLayout(null);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200, 50, 500, 400);
        setTitle("_2_JLabel");
    }

    public static void main(String[] args) {
        new _2_JLabel();

    }
}
