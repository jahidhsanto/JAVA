package JTable;

import javax.swing.*;
import java.awt.*;

public class _1_Jtable extends JFrame {
    Container c;
    private JLabel label;
    private Font font;
    private JTable table;
    private JScrollPane scroll;

    private String[] cols = {"ID", "Name", "GPA"};
    private String[][] rows = {
            {"201002032", "Asma Ul Husna", "3.5"},
            {"201002081", "Sayed Emon Alom", "3.5"},
            {"201002143", "Joy Munshi", "3.5"},
            {"201002152", "Sabrina Akter", "3.5"},
            {"201002214", "Raknat Jahan Aliz", "3.5"},
            {"201002352", "Bibek Chandra Dey", "3.5"},
            {"201002463", "Md. Jahid Hassan", "3.5"}
    };

    _1_Jtable() {
        initComponent();
    }

    public void initComponent() {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 750, 450);
        this.setTitle("JTable");

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);

        font = new Font("Arial", Font.BOLD, 22);

        label = new JLabel("Student Details");
        label.setBounds(250, 20, 200, 50);
        label.setFont(font);
        c.add(label);

        table = new JTable(rows, cols);
        table.setSelectionBackground(Color.PINK);
        

        scroll = new JScrollPane(table);
        scroll.setBounds(50, 80, 600, 150);
        c.add(scroll);

    }

    public static void main(String[] args) {
        _1_Jtable frame = new _1_Jtable();
        frame.setVisible(true);
    }
}
