package Project_Login_with_Dual_Frame;

import javax.swing.*;
import java.awt.*;

import static javax.swing.SwingConstants.CENTER;

public class _1st_Page extends JFrame {
    Container c;
    Font font;
    private ImageIcon img;
    public static JLabel l_Photo, tf_Photo, l_Name, l_F_Name, l_M_Name, l_DOB, l_Contact, l_Nationalily;
    public static JTextField tf_Name, tf_F_Name, tf_M_Name, tf_DOB, tf_Contact, tf_Nationalily;

    _1st_Page() {
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        initComponent();
    }

    public void initComponent() {
        c = this.getContentPane();
        c.setLayout(new GridLayout(7, 2, 20, 10));
        img = new ImageIcon("D:\\Java\\IntelliJ IDEA\\Swing\\src\\Login_with_Dual_Frame\\photo_2021-05-19_01-55-09.jpg");
        font = new Font("Arial", Font.PLAIN, 20);

        //Image scImage = img.getImage().getScaledInstance(tf_Photo.getWidth(), tf_Photo.getHeight(), Image.SCALE_DEFAULT);

        l_Photo = new JLabel("Profile");
        c.add(l_Photo);
        tf_Photo = new JLabel(img);
        c.add(tf_Photo);

        l_Name = new JLabel("Name");
        l_Name.setFont(font);
        l_Name.setHorizontalAlignment(CENTER);
        c.add(l_Name);
        tf_Name = new JTextField("Jahid Hassan Santo");
        tf_Name.setFont(font);
        c.add(tf_Name);

        l_F_Name = new JLabel("F_Name");
        l_F_Name.setFont(font);
        l_F_Name.setHorizontalAlignment(CENTER);
        c.add(l_F_Name);
        tf_F_Name = new JTextField("F_Name");
        tf_F_Name.setFont(font);
        c.add(tf_F_Name);

        l_M_Name = new JLabel("M_Name");
        l_M_Name.setFont(font);
        l_M_Name.setHorizontalAlignment(CENTER);
        c.add(l_M_Name);
        tf_M_Name = new JTextField("M_Name");
        tf_M_Name.setFont(font);
        c.add(tf_M_Name);

        l_DOB = new JLabel("DOB");
        l_DOB.setFont(font);
        l_DOB.setHorizontalAlignment(CENTER);
        c.add(l_DOB);
        tf_DOB = new JTextField("1997");
        tf_DOB.setFont(font);
        c.add(tf_DOB);

        l_Contact = new JLabel("Contact");
        l_Contact.setFont(font);
        l_Contact.setHorizontalAlignment(CENTER);
        c.add(l_Contact);
        tf_Contact = new JTextField("+880 1878 959101");
        tf_Contact.setFont(font);
        c.add(tf_Contact);

        l_Nationalily = new JLabel("Nationalily");
        l_Nationalily.setFont(font);
        l_Nationalily.setHorizontalAlignment(CENTER);
        c.add(l_Nationalily);
        tf_Nationalily = new JTextField("Bangladeshi");
        tf_Nationalily.setFont(font);
        c.add(tf_Nationalily);


    }

    public static void main(String[] args) {
        _1st_Page frame = new _1st_Page();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setTitle("Jahid Hassan Santo");

    }
}
