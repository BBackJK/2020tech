package J200511;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름을 입력하세요: ");
        String name = sc.nextLine();

        System.out.print("도시를 입력하세요: ");
        String city = sc.nextLine();

        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt();

        sc.close();


        System.out.println("================================");
        System.out.println("나의 대한 정보");
        System.out.println("이름: " + name);
        System.out.println("도시: " + city);
        System.out.println("나이: " + age);
    }
}