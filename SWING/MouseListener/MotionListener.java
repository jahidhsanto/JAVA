package MouseListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;


public class MotionListener extends JFrame {
    private Container c;
    private JTextField tf;
    private JTextArea ta;

    MotionListener() {
        initComponents();
    }

    public void initComponents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 500, 400);
        this.setTitle("Mouse Motion Listener");

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);

        ta = new JTextArea();
        ta.setBounds(10, 20, 200, 200);
        c.add(ta);

        tf = new JTextField();
        tf.setBounds(220, 20, 150, 50);
        c.add(tf);


        ta.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                tf.setText("Mouse Dragged " + e.getX() + " " + e.getY());
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                tf.setText("Mouse Moved " + e.getX() + " " + e.getY());
            }
        });
    }

    public static void main(String[] args) {
        MotionListener frame = new MotionListener();
        frame.setVisible(true);
    }
}
