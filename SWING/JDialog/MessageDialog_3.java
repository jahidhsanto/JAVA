package JDialog;

import javax.swing.*;

public class MessageDialog_3 {
    public static void main(String[] args) {

        Object[] options = {"CLICK HERE", 2, "No", 5.6, true};
        Object ob = "CLICK HERE";

        while (ob == "CLICK HERE") {
            ob = JOptionPane.showInputDialog(null, "Just pick something already!", "Mix & Match", JOptionPane.ERROR_MESSAGE, null, options, options[0]);
        }

        if (ob instanceof Integer) {
            JOptionPane.showMessageDialog(null, "You picked an Integer!", "Result", JOptionPane.INFORMATION_MESSAGE, null);
        } else if (ob instanceof String) {
            JOptionPane.showMessageDialog(null, "You picked a String!", "Result", JOptionPane.INFORMATION_MESSAGE, null);
        } else if (ob instanceof Double) {
            JOptionPane.showMessageDialog(null, "You picked a Double!", "Result", JOptionPane.INFORMATION_MESSAGE, null);
        } else if (ob instanceof Boolean) {
            JOptionPane.showMessageDialog(null, "You picked a Boolean!", "Result", JOptionPane.INFORMATION_MESSAGE, null);
        }

    }
}
