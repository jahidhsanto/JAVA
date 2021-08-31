package JDialog;

import javax.swing.*;

public class MessageDialog_2 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Input your name: ");
        JOptionPane.showInputDialog("Input your name: ", "Jahid Hassan Santo");
        JOptionPane.showInputDialog(null, "Input your name: ");
        JOptionPane.showInputDialog(null, "Input your name: ", "Jahid Hassan Santo");
        JOptionPane.showInputDialog(null, "Input your name: ", "Jahid Hassan Santo", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Welcome to JHS\nMr. " + name, "Output Window", JOptionPane.PLAIN_MESSAGE);

        String[] options = {"I adore turtles", "Yes", "Maybe", "Urm...", "No", "Hate them"};
        String n = (String) JOptionPane.showInputDialog(null, "Do you like turtles??", "I like turtles", JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
        System.out.println(n);


    }
}
