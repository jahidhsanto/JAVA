package JComboBox;

import javax.swing.*;
import java.awt.*;

public class _1_JComboBox extends JFrame {
    private Container c;
    private JComboBox cb;
    private String[] proLangualge = {"C", "C++", "JAVA", "PHP", "Python"};

    _1_JComboBox() {
        initComponents();
    }

    public void initComponents() {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 500, 500);
        this.setTitle("JComboBox");

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);

        cb = new JComboBox(proLangualge);
        cb.setBounds(50, 150, 100, 50);
        cb.setEditable(true);
        c.add(cb);
    }

    public static void main(String[] args) {
        _1_JComboBox frame = new _1_JComboBox();
        frame.setVisible(true);
    }
}

/*
JComboBox()	                Creates a JComboBox with a default data model.
JComboBox(Object[] items)   Creates a JComboBox that contains the elements in the specified array.
JComboBox(Vector<?> items)  Creates a JComboBox that contains the elements in the specified Vector.
 */