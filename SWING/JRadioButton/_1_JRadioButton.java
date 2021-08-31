package JRadioButton;

import javax.swing.*;
import java.awt.*;

public class _1_JRadioButton extends JFrame {
    private Container c;
    private JRadioButton male, female;

    _1_JRadioButton() {
        initComponents();
    }

    public void initComponents() {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(100, 50, 400, 400);
        this.setTitle("JRadioButton");

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);

        male = new JRadioButton("Male");
        male.setBounds(50, 50, 100, 50);
        male.setBackground(Color.ORANGE);
        c.add(male);

        female = new JRadioButton("Female");
        female.setBounds(160, 50, 100, 50);
        female.setBackground(Color.ORANGE);
        c.add(female);


    }

    public static void main(String[] args) {
        _1_JRadioButton frame = new _1_JRadioButton();
        frame.setVisible(true);
    }

}

/*
JRadioButton()	Creates an unselected radio button with no text.
JRadioButton(String s)	Creates an unselected radio button with specified text.
JRadioButton(String s, boolean selected)	Creates a radio button with the specified text and selected status.
 */