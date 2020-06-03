package J200601;

import java.util.Vector;
import java.util.Iterator;

public class IteratorEx {
    public static void main(String[] args) {
        Vector<Integer> vt = new Vector<Integer>();

        vt.add(5);
        vt.add(4);
        vt.add(-1);

        Iterator<Integer> it = vt.iterator(); 
        while(it.hasNext()) {
            int n = it.next();
            System.out.print(n+ " ");
        }

        int sum = 0;
        it = vt.iterator();
        while(it.hasNext()) {
            int n = it.next();
            sum += n;
        }

        System.out.println(sum);

        
    }
}