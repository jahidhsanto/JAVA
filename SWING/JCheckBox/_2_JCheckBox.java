package JCheckBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class _2_JCheckBox extends JFrame {
    private Container c;
    private JCheckBox male, female;
    private JLabel l1;

    _2_JCheckBox() {
        initComponents();
    }

    public void initComponents() {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(100, 50, 400, 400);
        this.setTitle("Item  listener");

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);


        male = new JCheckBox("Male");
        male.setBounds(50, 50, 100, 50);
        male.setBackground(Color.ORANGE);
        c.add(male);

        female = new JCheckBox("Female");
        female.setBounds(160, 50, 100, 50);
        female.setBackground(Color.ORANGE);
        c.add(female);

        l1 = new JLabel("You haven't selected anything");
        l1.setBounds(50, 200, 300, 30);
        c.add(l1);

        Handler handler = new Handler();
        male.addItemListener(handler);
        female.addItemListener(handler);

    }

    class Handler implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
            if (e.getSource().equals(male)) {
                l1.setText("You have selected Male");
            }
            if (e.getSource().equals(female)) {
                l1.setText("You have selected Female");
            }
        }
    }

    public static void main(String[] args) {
        _2_JCheckBox frame = new _2_JCheckBox();
        frame.setVisible(true);
    }

}
