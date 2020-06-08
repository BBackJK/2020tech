package J200608;

import java.awt.*;
import javax.swing.*;

public class NullContainerEx extends JFrame{
    
    NullContainerEx() {
        setTitle("Null Container Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(null);

        JLabel la = new JLabel("Hello, Press Button!");
        la.setLocation(130, 50);
        la.setSize(200,20);
        c.add(la);

        for( int i = 0; i <= 9; i++) {
            JButton jb = new JButton(Integer.toString(i));
            jb.setLocation(i*15, i*15);
            jb.setSize(50, 20);
            c.add(jb);
        }

        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new NullContainerEx();
    }
}