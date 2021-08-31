package Layout_Manager;

import java.awt.*;
import javax.swing.*;

public class _4_BoxLayout extends Frame {
    JButton buttons[];

    public _4_BoxLayout() {
        buttons = new JButton[5];

        for (int i = 0; i < 5; i++) {
            buttons[i] = new JButton("Button " + (i + 1));
            add(buttons[i]);
        }

        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        setSize(400, 400);
        setVisible(true);

    }

    public static void main(String args[]) {
        _4_BoxLayout frame = new _4_BoxLayout();
    }
}
/*
BoxLayout(Container c, int axis): creates a box layout that arranges the components with the given axis.
 */