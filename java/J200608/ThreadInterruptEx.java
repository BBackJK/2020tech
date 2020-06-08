package J200608;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ThreadInterruptEx extends JFrame {
    private Thread th;

    public ThreadInterruptEx() {
        setTitle("스레드 인터럽트 에제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JLabel timerLabel = new JLabel();
        timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));

        TimerRunnable tr = new TimerRunnable(timerLabel);
        th = new Thread(tr);
        c.add(timerLabel);

        JButton btn = new JButton("Kill Timer");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                // TODO Auto-generated method stub
                th.interrupt();
                JButton btn = (JButton)e.getSource();
                btn.setEnabled(false);
            }
        });
        c.add(btn);
        setSize(300, 170);
        setVisible(true);

        th.start();

    }

    public static void main(String[] args) {
        new ThreadInterruptEx();
    }

}

class TimmerRunnable implements Runnable {
    private JLabel timerLabel;

    public TimmerRunnable(JLabel timerLabel) {
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