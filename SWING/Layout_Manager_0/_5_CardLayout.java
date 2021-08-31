package Layout_Manager_0;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class _5_CardLayout extends JFrame implements ActionListener {
    private Container c;
    private JButton btn1, btn2, btn3, btn4, btn5;
    private CardLayout cardLayout;

    _5_CardLayout() {
        initComponents();
    }

    public void initComponents() {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 500, 500);
        this.setTitle("CardLayout");

        c = this.getContentPane();

        // BoxLayout (Container c, int axis)
        cardLayout = new CardLayout(10, 10);
//        cardLayout.setHgap(10);
//        cardLayout.setVgap(10);
        c.setLayout(cardLayout);

        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");

        c.add(btn1);
        c.add(btn2, "2nd");
        c.add(btn3);
        c.add(btn4);
        c.add(btn5);

        cardLayout.show(c, "2nd");

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        cardLayout.next(c);
    }

    public static void main(String[] args) {
        _5_CardLayout frame = new _5_CardLayout();
        frame.setVisible(true);
    }
}


