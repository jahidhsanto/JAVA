package JTextField;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class _2_JTextField {
    private static JTextField tf1;
    private static JTextField tf2;
    private static JTextField tf3;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Action Listener");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setBounds(50, 50, 800, 600);
        frame.getContentPane().setBackground(Color.yellow);
        frame.setLayout(null);

        JLabel l1 = new JLabel("First Name: ");
        JLabel l2 = new JLabel("Last Name: ");
        JLabel l3 = new JLabel("UserName: ");
        l1.setBounds(50, 50, 130, 25);
        l2.setBounds(50, 80, 130, 25);
        l3.setBounds(50, 110, 130, 25);
        frame.add(l1);
        frame.add(l2);
        frame.add(l3);

        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField();
        tf1.setBounds(180, 50, 200, 25);
        tf2.setBounds(180, 80, 200, 25);
        tf3.setBounds(180, 110, 200, 25);
        frame.add(tf1);
        frame.add(tf2);
        frame.add(tf3);
        tf1.setBackground(Color.BLACK);
        tf2.setBackground(Color.BLACK);
        tf3.setBackground(Color.BLACK);
        tf1.setForeground(Color.WHITE);
        tf2.setForeground(Color.WHITE);
        tf3.setForeground(Color.WHITE);


        tf1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = tf1.getText();
                if (s.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "You didn't enter anything.");
                } else {
                    JOptionPane.showMessageDialog(null, "tf1= " + s);
                }
            }
        });

        Handler handler = new Handler();
        tf2.addActionListener(handler);
        tf3.addActionListener(handler);
    }

    static class Handler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == tf2) {
                String s = tf2.getText();
                if (s.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "You didn't enter anything.");
                } else {
                    JOptionPane.showMessageDialog(null, "tf2= " + s);
                }
            } else if (e.getSource() == tf3) {
                String s = tf2.getText();
                if (s.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "You didn't enter anything.");
                } else {
                    JOptionPane.showMessageDialog(null, "tf3= " + s);
                }
            }
        }
    }
}
