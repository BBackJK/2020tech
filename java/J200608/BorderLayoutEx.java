package J200608;

import java.awt.*;
import javax.swing.*;

public class BorderLayoutEx extends JFrame {
    public BorderLayoutEx() {
        setTitle("border layout example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();

        c.add(new JButton("Calculater"), BorderLayout.CENTER);
        c.add(new JButton("ADD"), BorderLayout.NORTH);
        c.add(new JButton("SUB"), BorderLayout.SOUTH);
        c.add(new JButton("MUL"), BorderLayout.EAST);
        c.add(new JButton("DIV"), BorderLayout.WEST);

        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BorderLayoutEx();
    }
}