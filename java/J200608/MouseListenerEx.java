package J200608;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

import javafx.scene.paint.Color;

public class MouseListenerEx extends JFrame {
    private JLabel lb = new JLabel("Hello");

    public MouseListenerEx() {
        setTitle("마우스 이벤트 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.addMouseListener(new MyMouseListener());
        
        c.setLayout(null);
        lb.setSize(50,20);
        lb.setLocation(30, 30);

        c.add(lb);

        setSize(250,250);
        setVisible(true);
    }

    class MyMouseListener implements MouseListener {

        public void mousePressed(MouseEvent e) {
            int x = e.getX();
            int y = e.getY();
            lb.setLocation(x, y);
        }

        public void mouseReleased(MouseEvent e){};
        public void mouseClicked(MouseEvent e){
            System.out.println(e.getClickCount()); 
        };
        public void mouseEntered(MouseEvent e){
        };
        public void mouseExited(MouseEvent e){};
    }

    public static void main(String[] args) {
        new MouseListenerEx();
    }
}