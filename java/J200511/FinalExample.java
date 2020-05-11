package J200511;

public class FinalExample {
    public static void main(String[] args) {
        final double PI = 3.141592;
        double result;

        result = CircleArea(3, PI);

        System.out.println(result);
    }

    public static double CircleArea(int r, double PI) {
        return r*r*PI;
    }
}