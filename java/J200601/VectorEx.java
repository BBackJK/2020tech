package J200601;

import java.util.Vector;

public class VectorEx {
    public static void main(String[] args) {
        System.out.println("Hello!");

        Vector<Integer> vc = new Vector<Integer>();

        vc.add(5);
        vc.add(4);
        vc.add(-1);

        vc.add(2, 100);

        System.out.println("벡터 내의 요소 객체 수: "+ vc.size());
        System.out.println("벡터의 용량: " + vc.capacity());

        for ( int i = 0; i < vc.size() ; i ++) {
            System.out.print(vc.get(i) + "   ");
        }

        int sum = 0;

        for (int j = 0; j < vc.size() ; j++) {
            int m = vc.elementAt(j);
            sum += m;
        }

        System.out.println("벡터 요소의 합은 :" + sum);
    }
}