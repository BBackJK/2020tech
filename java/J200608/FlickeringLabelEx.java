package J200608;

import java.awt.*;
import javax.swing.*;

public class FlickeringLabelEx extends JFrame {
    public FlickeringLabelEx() {
        setTitle("Flickering Label Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        FlickeringLabel fLabel = new FlickeringLabel(500, "깜빡");

        
        JLabel label = new JLabel("안깜빡");

        FlickeringLabel fLabel2 = new FlickeringLabel(300, "여기도 깜빡");

        c.add(fLabel);
        c.add(label);
        c.add(fLabel2);

        setSize(300, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FlickeringLabelEx();
    }
    
}

class FlickeringLabel extends JLabel implements Runnable {
    private long delay;

    public FlickeringLabel(long delay, String text) {
        super(text);
        this.delay = delay;
        setOpaque(true);
        Thread th = new Thread(this);
        th.start();
    }

    @Override
    public void run() {
        int n = 0;
        while(true) {
            if (n == 0) setBackground(Color.YELLOW);
            else setBackground(Color.GREEN);

            if (n == 0) n=1;
            else n = 0;

            try {
                Thread.sleep(1000);
            } catch( InterruptedException e) {
                return ;
            }
        }
    }
}