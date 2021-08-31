package JDialog;

import javax.swing.*;

public class MessageDialog_4 {
    public static void main(String[] args) {
        int choice = JOptionPane.showConfirmDialog(null, "Choose any option", "Confirmation window", JOptionPane.YES_NO_OPTION);

        if (choice == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "You choosen Yes option");
        } else if (choice == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "You choosen No option");
        }

    }
}
