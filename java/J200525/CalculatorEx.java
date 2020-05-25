package J200525;

abstract class Calculator {
    public abstract int add(int a, int b);
    public abstract int subtract(int a, int b);
    public abstract double average(int[] a);
}

class Cals extends Calculator {
    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int subtract(int a, int b) {
        return a-b;
    }

    @Override
    public double average(int[] a) {
        int sum = 0;

        for(int i = 0; i < a.length ; i++) {
            sum += a[i];
        }
        double result = sum / a.length;
        return result;
    }

}

public class CalculatorEx {

    public static void main(String[] args) {
        Cals c = new Cals();

        int[] i = {1, 2, 3, 4, 5};

        System.out.println(c.add(1, 4));
        System.out.println(c.subtract(4, 1));
        System.out.println(c.average(i));
    }
}