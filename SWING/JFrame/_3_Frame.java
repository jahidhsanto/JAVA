
package JFrame;

import javax.swing.WindowConstants;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class _3_Frame {
    private ImageIcon icon;

/*
    Frame_3() {
        initComponents();
    }

    public void initComponents() {
        icon = new ImageIcon(getClass().getResource("_6_JLabel.png"));
        this.setIconImage(icon.getImage());
    }
*/

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.setBounds(200, 50, 400, 300);
        frame.setTitle("Frame_1");
        frame.setResizable(false);
    }
}

