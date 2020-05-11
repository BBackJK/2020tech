package J200511;

public class TypeChange {
    public static void main(String[] args) {
        byte b = 127;
        int i = 100;

        System.out.println(b+i);
        System.out.println(10/4);
        System.out.println(10.0/4);
        System.out.println((char)0x12340041);   // 강제 타입 변환 결과 0x41이 되며, 문자 A가 됨.
        System.out.println((byte)(b+i));
        System.out.println((int)2.9 + 1.8);
        System.out.println((int)(2.9 + 1.8));
        System.out.println((int)2.9 + (int)1.8);
    }
}