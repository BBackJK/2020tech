package J200511;

import java.util.Scanner;

public class Coffee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("무슨 커피를 드릴까요? ");
        String coffee = sc.next();

        sc.close();

        int price = 0;

        switch(coffee){
            case "espresso":
                price = 2000;
                break;
            case "cafelatte":
            case "capuccino":
                price = 3000;
                break;
            case "americano":
                price = 2500;
                break;
            default:
                System.out.println("메뉴에 없는 주문입니다.");
        }
        
        System.out.println("주문하신 메뉴는: " + coffee);
        System.out.print("가격은: " + price);

    }
}