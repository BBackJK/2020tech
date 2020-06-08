package J200608;

import java.awt.*;
import javax.swing.*;

class ThreadEx extends Thread {
    private JLabel timerLabel;

    public ThreadEx(JLabel timerLabel) {
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

public class MyThreadEx extends JFrame {

    public MyThreadEx() {
        setTitle("Thread를 상속받아 타이머 스레드 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JLabel timerLabel = new JLabel();
        timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
        c.add(timerLabel);

        ThreadEx th = new ThreadEx(timerLabel);

        setSize(300, 170);
        setVisible(true);

        th.start();
    }

    public static void main(String[] args) {
        new MyThreadEx();
    }
}