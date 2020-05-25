package J200525;

import java.lang.Math;

public class Lotto {

    public static void main(String[] args) {
    
        int[] a = {3, 10, 29, 40, 15};

        System.out.println("당첨 번호는 :");
        
        for(int i=0; i< a.length; i++) {
            System.out.print(a[i]+ "  ");
            if (i == a.length-1) System.out.println("");    
        }


        System.out.println("내 번호는: ");

        for(int x = 0; x < 5; x++) {
            int n = (int)(Math.random()*50+1);
            System.out.print(n+ " ");
        }
    }
}