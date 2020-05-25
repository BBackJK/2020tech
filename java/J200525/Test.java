package J200525;

public class Test {
    public static void main(String[] args) {
        Card c1 = new Card();
        Card c2 = new Card();

        c1.kind = "heart";
        System.out.println(c1.kind);
        System.out.println(c2.kind);

    }
}

class Card {
    String kind;                // 멤버 변수 - 인스턴스 변수
    int number;                 // 멤버 변수 - 인스턴스 변수
    static int width = 100;     // 멤버 변수 - 클래스 변수    
    static int height = 120;    // 멤버 변수 - 클래스 변수

    // 클래스의 멤버 변수는 크게 인스턴스 변수와 클래스 변수로 나뉘어 진다.

    // 인터스턴스 변수는 보통 객체를 인스턴스화 ex) Card c1 = new Card(); 하고 c1.[인스턴스 변수명]으로 접근한다.

    // 그렇기 때문에 각 인스턴스 객체 마다 인스턴스 변수값은 다르다.

    // 클래스 변수는 키워드 static을 사용한 변수이며, static을 사용하면 static 변수(클래스 변수) 던지 static 메소드 던지 

    // 인스턴스화 하지 않고도 사용이 가능하다. 왜? static을 사용할 때 이미 메모리에 올라가 있기 때문이다.

    // 또한 클래스 변수(static 변수)는 인스턴스 변수와 달리 모든 인스턴스가 공통적으로 동일한 값을 공유해야 하는 상황에 사용해야 한다.

    // 이 코드에서 예를 들면 card의 가로, 세로 길이는 모든 카드(인스턴스화 된 객체들)에 대해서 같은 값을 공유해야 한다.

    // 즉, 각 인스턴스 마다 변수 값이 달라지게 되면 인스턴스 변수로 선언하고, 같은 값을 공유해야 되면 static 변수를 사용해야 한다.

}