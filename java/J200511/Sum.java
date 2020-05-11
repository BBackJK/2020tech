package J200511;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int num1, num2;

        System.out.print("첫 번째 정수를 입력해주세요: ");
        num1 = sc.nextInt();

        System.out.print("두 번째 정수를 입력해주세요: ");
        num2 = sc.nextInt();

        sc.close();

        Calculator calculator =  new Calculator(num1, num2);

        calculator.sum();
    }
}

class Calculator {
    int num1;
    int num2;
    
    Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    void sum() {
        System.out.print("두 수를 더한 값은? ");
        System.out.println(this.num1 + this.num2);
    }
    
}