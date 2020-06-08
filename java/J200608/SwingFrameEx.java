package J200608;

import javax.swing.JFrame;

public class SwingFrameEx extends JFrame {
    static final int x = 300;
    static final int y = 300;

    public SwingFrameEx() {
        setTitle("Java Swing Program Example");
        setSize(x, y);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SwingFrameEx();
    }
}