package Project_Vowel_Counter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class VowerCounter extends JFrame {
    private Container c;
    private JLabel promptLable, vowelLable, al, el, il, ol, ul;
    private JTextArea inputTextArea;
    private JScrollPane scroll;

    int totalVowel = 0;
    int letter_a = 0;
    int letter_e = 0;
    int letter_i = 0;
    int letter_o = 0;
    int letter_u = 0;

    VowerCounter() {
        initComponents();
    }

    public void initComponents() {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 600, 500);
        this.setTitle("Counting Vowel App");

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);

        promptLable = new JLabel("Enter the Text; ");
        promptLable.setBounds(10, 20, 100, 30);
        c.add(promptLable);

        inputTextArea = new JTextArea();
        inputTextArea.setLineWrap(true);
        inputTextArea.setWrapStyleWord(true);

        scroll = new JScrollPane(inputTextArea);
        scroll.setBounds(110, 20, 450, 100);
        c.add(scroll);

        vowelLable = new JLabel();
        vowelLable.setBounds(110, 150, 150, 30);
        c.add(vowelLable);

        al = new JLabel();
        al.setBounds(110, 190, 150, 30);
        c.add(al);

        el = new JLabel();
        el.setBounds(110, 230, 150, 30);
        c.add(el);

        il = new JLabel();
        il.setBounds(110, 280, 150, 30);
        c.add(il);

        ol = new JLabel();
        ol.setBounds(110, 310, 150, 30);
        c.add(ol);

        ul = new JLabel();
        ul.setBounds(110, 350, 150, 30);
        c.add(ul);

        inputTextArea.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getSource() == inputTextArea) {
                    if (e.VK_A == e.getKeyCode()) {
                        letter_a++;
                        totalVowel++;
                    }
                    if (e.VK_E == e.getKeyCode()) {
                        letter_e++;
                        totalVowel++;
                    }
                    if (e.VK_I == e.getKeyCode()) {
                        letter_i++;
                        totalVowel++;
                    }
                    if (e.VK_O == e.getKeyCode()) {
                        letter_o++;
                        totalVowel++;
                    }
                    if (e.VK_U == e.getKeyCode()) {
                        letter_u++;
                        totalVowel++;
                    }
                }
                vowelLable.setText("Total number of vowel: " + totalVowel);
                al.setText("Total number of a: " + letter_a);
                el.setText("Total number of e: " + letter_e);
                il.setText("Total number of i: " + letter_i);
                ol.setText("Total number of o: " + letter_o);
                ul.setText("Total number of u: " + letter_u);


            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        VowerCounter frame = new VowerCounter();
        frame.setVisible(true);
    }
}
