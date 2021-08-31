package KeyListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class KeyListener extends JFrame {
    private Container c;
    private JTextField tf;
    private JTextArea ta;

    KeyListener() {
        initComponents();
    }

    public void initComponents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 50, 500, 500);
        this.setTitle("KeyListener");

        c = this.getContentPane();
        c.setLayout(null);

        tf = new JTextField();
        tf.setBounds(50, 50, 150, 50);
        c.add(tf);
        ta = new JTextArea();
        ta.setBounds(10, 110, 300, 300);
        ta.setBackground(Color.PINK);
        c.add(ta);

        tf.addKeyListener(new java.awt.event.KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                ta.append("keyTyped: " + e.getKeyChar() + "\n");
            }

            @Override
            public void keyPressed(KeyEvent e) {
                ta.append("keyPressed: " + e.getKeyChar() + "\n");
            }

            @Override
            public void keyReleased(KeyEvent e) {
                ta.append("keyReleased: " + e.getKeyChar() + "\n");
            }
        });
    }

    public static void main(String[] args) {
        KeyListener frame = new KeyListener();
        frame.setVisible(true);
    }
}
