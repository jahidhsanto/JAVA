package JCheckBox;

import javax.swing.*;
import java.awt.*;

public class _1_JCheckBox extends JFrame {
    private Container c;
    private JCheckBox male, female;
    private ButtonGroup grp;

    _1_JCheckBox() {
        initComponents();
    }

    public void initComponents() {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(100, 50, 400, 400);
        this.setTitle("JCheckBox");

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);


        male = new JCheckBox("Male", true);
        male.setBounds(50, 50, 100, 50);
        male.setBackground(Color.ORANGE);
        c.add(male);

        female = new JCheckBox("Female");
        female.setBounds(160, 50, 100, 50);
        female.setBackground(Color.ORANGE);
        c.add(female);

    }

    public static void main(String[] args) {
        _1_JCheckBox frame = new _1_JCheckBox();
        frame.setVisible(true);
    }

}

/*
JJCheckBox()	Creates an initially unselected check box button with no text, no icon.
JChechBox(String s)	Creates an initially unselected check box with text.
JCheckBox(String text, boolean selected)	Creates a check box with text and specifies whether or not it is initially selected.
JCheckBox(Action a)	Creates a check box where properties are taken from the Action supplied.

 */