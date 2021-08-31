package JRadioButton;

import javax.swing.*;
import java.awt.*;

public class _2_JRadioButton extends JFrame {
    private Container c;
    private JRadioButton male, female;
    private ButtonGroup grp;

    _2_JRadioButton() {
        initComponents();
    }

    public void initComponents() {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(100, 50, 400, 400);
        this.setTitle("Select only one option");

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

        grp = new ButtonGroup();

        grp.add(male);
        grp.add(female);


    }

    public static void main(String[] args) {
        _2_JRadioButton frame = new _2_JRadioButton();
        frame.setVisible(true);
    }

}
