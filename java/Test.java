import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class Test {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // long systemTime = System.currentTimeMillis();

        // SimpleDateFormat formatter = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss", Locale.KOREA);

        // String dTime = formatter.format(systemTime);

        // while문 밖에 있으면 currentTimeMillis()를 한번밖에 안가져와서 값이 계속 똑같음.

        while(true) {
            System.out.println("번호 선택");
            System.out.println("1. 현재 시간 출력");
            System.out.println("0. 종료");
            int menu = Integer.parseInt(sc.nextLine());

            if (menu == 1){
                System.out.println("현재 시간 출력!!");
                System.out.println();
            } else {
                System.exit(0);
                break;
            }
        }
    }
}

