package J200608;

import java.awt.*;
import javax.swing.*;

public class RunnableThreadEx extends JFrame{
    public RunnableThreadEx() {
        setTitle("Runnable Thread Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JLabel timerLabel = new JLabel();
        timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
        c.add(timerLabel);

        TimerRunnable tr = new TimerRunnable(timerLabel);
        Thread th = new Thread(tr);

        setSize(250, 150);
        setVisible(true);

        th.start();

    }

    public static void main(String[] args) {
        new RunnableThreadEx();
    }
    
}

class TimerRunnable implements Runnable {
    private JLabel timerLabel;

    public TimerRunnable(JLabel timerLabel) {
        this.timerLabel = timerLabel;
    }

    @Override
    public void run() {
        int n = 0;
        while(true) {
            timerLabel.setText(Integer.toString(n));
            n++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                return ;
            }
        }

    }

}