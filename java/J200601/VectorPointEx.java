package J200601;

import java.util.Vector;

public class VectorPointEx {
    public static void main(String[] args) {

        Vector<Point> vc = new Vector<Point>();

        // 3개의 point 객체 삽입
        vc.add(new Point(2, 3));
        vc.add(new Point(-5, 20));
        vc.add(new Point(30, -8));

        for (int i = 0; i < vc.size() ; i ++) {
            System.out.println(vc.get(i));
        }

        vc.remove(1);

        for (int i = 0; i < vc.size() ; i ++) {
            Point p = vc.get(i);
            System.out.println(p);
        }
    }
}


class Point {
    private int x, y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }
}