package JFrame;

import javax.swing.*;
import java.awt.*;

public class _4_Frame extends JFrame {
    private Container c;

    _4_Frame() {
        initComponents();
    }

    public void initComponents() {
        c = this.getContentPane();
        c.setBackground(Color.green);
        this.getContentPane().setBackground(Color.CYAN);


        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200, 50, 400, 300);
        setTitle("Frame_4");
    }

    public static void main(String[] args) {
        _4_Frame frame = new _4_Frame();


    }
}
