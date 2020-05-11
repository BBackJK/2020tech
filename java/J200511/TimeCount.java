package J200511;

public class TimeCount {
// 782초가 몇분 몇초일지
    public static void main(String[] args) {
        final int SECOND = 60;
        final int MINUTES = 60;

        int result_minutes, result_second;

        result_minutes = 782/SECOND;
        result_second = 782%MINUTES;

        System.out.println("782초는 "+ result_minutes + " 분 " + result_second + " 초 입니다.");
    }
}