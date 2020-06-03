package J200601;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();

        // 키보드로부터 4개의 이름을 입력받아 al에 삽입
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 4 ; i++) {
            System.out.print("이름을 입력하세요 >> ");
            String s = sc.nextLine();
            al.add(s);
        }

        sc.close();

        for( int i = 0; i < al.size() ; i ++) {
            System.out.print(al.get(i) + " ");
        }

    }    
}