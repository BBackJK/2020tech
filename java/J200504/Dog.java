package J200504;

import java.util.Scanner;

public class Dog {
    public static void main(String[] args) {
        DogObject myDog;

        Scanner sc = new Scanner(System.in);

        String StringSize;

        System.out.println("몸무게를 입력하세요:");
        StringSize = sc.next();

        sc.close();

        int NumberSize = Integer.parseInt(StringSize);


        myDog = new DogObject(NumberSize, "나비");

        myDog.bark();
    }
}

class DogObject {

    int size;
    String name;

    DogObject(int size, String name) {
        this.size = size;
        this.name = name;
    }

    void bark() {
        System.out.println("=======================");
        System.out.println("bark 실행");
        if ( this.size > 20 ) {
            System.out.println("왈왈");
        } else if (this.size > 10) {
            System.out.println("멍멍");
        } else if ( this.size > 1) {
            System.out.println("깽깽");
        }
    }
}