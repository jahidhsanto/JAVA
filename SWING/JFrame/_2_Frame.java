package JFrame;

import javax.swing.*;

public class _2_Frame extends JFrame {
    _2_Frame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(50, 100, 400, 500);
        setTitle("This is a title");


    }

    public static void main(String[] args) {
        _2_Frame frame = new _2_Frame();
        frame.setVisible(true);

    }
}