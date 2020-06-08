package J200608;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class IndepClassActionListnerEx extends JFrame{
    public IndepClassActionListnerEx() {
        super("Action 이벤트 리스너 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();

        c.setLayout(new FlowLayout());
        JButton btn = new JButton("Action");
        btn.addActionListener(new MyActionListener());

        c.add(btn);
        setSize(350, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new IndepClassActionListnerEx();
    }
}

class MyActionListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        JButton b = (JButton) e.getSource();

        if (b.getText().equals("Action")){
            b.setText("액션");
        } else {
            b.setText("Action");
        }
    }

}