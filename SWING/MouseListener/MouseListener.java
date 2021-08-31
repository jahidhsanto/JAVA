package MouseListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class MouseListener extends JFrame {
    private Container c;
    private JTextField tf;
    private JTextArea ta;
    private JScrollPane scroll;

    MouseListener() {
        initComponents();
    }

    public void initComponents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 50, 500, 500);
        this.setTitle("Mouse Listener");

        c = this.getContentPane();
        c.setLayout(null);

        tf = new JTextField();
        tf.setBounds(50, 50, 150, 50);
        c.add(tf);

        ta = new JTextArea();
        ta.setBackground(Color.PINK);
        scroll = new JScrollPane(ta);
        scroll.setBounds(10, 110, 300, 300);
        c.add(scroll);

        tf.addMouseListener(new java.awt.event.MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ta.append("Mouse Clicked\n");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                ta.append("Mouse Pressed\n");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                ta.append("Mouse leased\n");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                ta.append("Mouse Entered\n");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                ta.append("Mouse Exited\n");
            }
        });
    }

    public static void main(String[] args) {
        MouseListener frame = new MouseListener();
        frame.setVisible(true);
    }
}

