package J200511;

public class Operator {
    public static void main(String[] args) {
        int a = 3, b = 3, c = 3;

        // 대입 연산자
        a += 3;
        b *= 3;
        c %= 2;
        System.out.println("a = "+ a + " b = " + b + " c = " + c);


        // 증감 연산자
        int d = 3;
        a = d++;
        System.out.println("a = " + a + " d = " + d); // a = 3, d = 4 
        a = ++d;
        System.out.println("a = " + a + " d = " + d); // a = 5, d = 5
        a = d--;
        System.out.println("a = " + a + " d = " + d); // a = 5, d = 4
        a = --d;
        System.out.println("a = " + a + " d = " + d); // a = 3, d = 3
    }
}