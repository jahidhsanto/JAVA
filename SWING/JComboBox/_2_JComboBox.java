package JComboBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class _2_JComboBox extends JFrame {
    private Container c;
    private JComboBox cb;
    private String[] proLangualge = {"C", "C++", "JAVA", "PHP", "Python"};
    private JLabel l1;

    _2_JComboBox() {
        initComponents();
    }

    public void initComponents() {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 500, 500);
        this.setTitle("Various methods of JComboBox");

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);

        cb = new JComboBox(proLangualge);
        cb.setBounds(50, 150, 100, 50);
        cb.setEditable(true);
        c.add(cb);

        cb.removeItem("Python");
        cb.addItem("Fortram");

        cb.setSelectedIndex(3);
        cb.setSelectedItem("JAVA");

        System.out.println("Total item=" + cb.getItemCount());

        l1 = new JLabel();
        l1.setBounds(160, 150, 200, 50);
        c.add(l1);

        cb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l1.setText("You have selected: " + cb.getSelectedItem().toString());
            }
        });
    }

    public static void main(String[] args) {
        _2_JComboBox frame = new _2_JComboBox();
        frame.setVisible(true);
    }
}

