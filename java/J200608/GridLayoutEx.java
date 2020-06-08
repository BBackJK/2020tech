package J200608;

import java.awt.*;
import javax.swing.*;

public class GridLayoutEx extends JFrame {
    public GridLayoutEx() {
        setTitle("Grid Layout Example ");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GridLayout grid = new GridLayout();

        grid.setVgap(5);

        Container c = getContentPane();

        c.setLayout(grid);
        c.add(new JButton("이름"));
        c.add(new JButton(""));
        c.add(new JButton("학번"));
        c.add(new JButton(""));
        c.add(new JButton("학과"));
        c.add(new JButton(""));
        c.add(new JButton("과목"));
        c.add(new JButton(""));
        c.setSize(300, 300);
        c.setVisible(true);
    }

    public static void main(String[] args) {
        new GridLayoutEx();
    }
}