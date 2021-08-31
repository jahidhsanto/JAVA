package JPanel;

import javax.swing.*;
import java.awt.*;

public class _1_JPanel extends JFrame {

    private Container c;
    private JPanel panel1, panel2;
    private JButton btn1, btn2, btn3;


    _1_JPanel() {
        initComponents();
    }

    public void initComponents() {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 670, 500);
        this.setTitle("JPanel");

        c = this.getContentPane();
        c.setLayout(null);

        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");


        panel1 = new JPanel();
        panel1.setBounds(100, 100, 250, 300);
        panel1.setBackground(Color.RED);
        c.add(panel1);

        panel2 = new JPanel();
        panel2.setBounds(355, 100, 250, 300);
        panel2.setBackground(Color.GREEN);
        c.add(panel2);

        panel1.add(btn1);
        panel2.add(btn2);
        panel2.add(btn3);

    }

    public static void main(String[] args) {
        _1_JPanel frame = new _1_JPanel();
        frame.setVisible(true);
    }
}
