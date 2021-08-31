package JButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class _3_JButton extends JFrame {
    private Container c;
    private Font f;
    private Cursor cursor;
    private JLabel l1, l2, imglabel;
    private JTextField tf1, tf2;
    private JButton btn1, btn2;
    private ImageIcon img;

    _3_JButton() {
        initComponent();
    }

    public void initComponent() {
        c = this.getContentPane();
        c.setLayout(null);
        f = new Font("Arial", Font.BOLD, 14);
        cursor = new Cursor(Cursor.HAND_CURSOR);
        img = new ImageIcon("button_noun_002_05071.jpg");

        imglabel = new JLabel(img);
        imglabel.setBounds(0, 0, 200, 200);
        c.add(imglabel);

        l1 = new JLabel("Name: ");
        l1.setBounds(200, 150, 100, 30);
        l1.setForeground(Color.WHITE);
        l1.setOpaque(true);
        l1.setBackground(Color.RED);
        l1.setFont(f);
        c.add(l1);
        l2 = new JLabel("Number: ");
        l2.setBounds(200, 200, 100, 30);
        l2.setForeground(Color.WHITE);
        l2.setOpaque(true);
        l2.setBackground(Color.RED);
        l2.setFont(f);
        c.add(l2);

        tf1 = new JTextField();
        tf1.setBounds(300, 150, 200, 30);
        tf1.setBackground(Color.WHITE);
        c.add(tf1);
        tf2 = new JTextField();
        tf2.setBounds(300, 200, 200, 30);
        tf2.setBackground(Color.WHITE);
        c.add(tf2);


        btn1 = new JButton("Submit");
        btn1.setBounds(300, 250, 100, 25);
        btn1.setBackground(Color.WHITE);
        btn1.setForeground(Color.BLACK);
        btn1.setCursor(cursor);
        c.add(btn1);
        btn2 = new JButton("Clear");
        btn2.setBounds(400, 250, 100, 25);
        btn2.setBackground(Color.WHITE);
        btn2.setForeground(Color.BLACK);
        btn2.setCursor(cursor);
        c.add(btn2);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tf1.getText().isEmpty() || tf2.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Submit again!!!");
                } else {
                    JOptionPane.showMessageDialog(null, "Successfully Submitted");
                }
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf1.setText("");
                tf2.setText("");
            }
        });

    }

    public static void main(String[] args) {
        _3_JButton frame = new _3_JButton();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setBounds(50, 50, 800, 600);
        frame.setBackground(Color.BLACK);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setTitle("JButton ActionListener");
    }

}
