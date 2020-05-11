package J200511;

public class CircleObject {

    int radius;
    String name;

    public CircleObject() {};

    public double getArea() {
        return 3.14*radius*radius;
    }
    public static void main(String[] args) {
        CircleObject pizza;
        pizza = new CircleObject();
        pizza.radius = 10;
        pizza.name = "자바피자";
        double area = pizza.getArea();
        System.out.println(pizza.name + "의 면적은 " + area);

        CircleObject donut = new CircleObject();
        donut.radius = 2;
        donut.name = "자바도넛";
        area = donut.getArea();
        System.out.println(donut.name + "의 면적은 " + area);
    }

}