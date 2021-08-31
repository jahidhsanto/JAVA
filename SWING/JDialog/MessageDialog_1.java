package JDialog;

import javax.swing.*;

public class MessageDialog_1 {
    public static void main(String[] args) {
        ImageIcon img = new ImageIcon("turtle32.png");

        JOptionPane.showMessageDialog(null, "Wrong password");
        JOptionPane.showMessageDialog(null, "Wrong password", "Warning", 1);
        JOptionPane.showMessageDialog(null, "Welcome to JHS", "Welcome window", JOptionPane.ERROR_MESSAGE, img);
    }
}
