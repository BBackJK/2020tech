package J200525;

class Shape {
    public Shape next;
    public Shape() { 
        System.out.println("shape constructor");
        next = null;
    }

    public void draw() {
        System.out.println("Shape");
    }
}

class Line extends Shape {
    public void draw() {    // 메소드 오버라이딩
        System.out.println("Line");
    }
}

class Rect extends Shape {
    public void draw() {    // 메소드 오버 라이딩
        System.out.println("Rect");
    }
}

class Circle extends Shape {
    public void draw() {
        System.out.println("Circle");
    }
}

public class MethodOverridingEx {
    static void paint(Shape p) {
        p.draw();   // p가 가리키는 객체 내에 오버라이딩된 draw() 호출;
                    // 동적 바인딩    
    }

    public static void main(String[] args) {
        Line line = new Line();

        paint(line);            // Line
        paint(new Shape());     // Shape
        paint(new Line());      // Line
        paint(new Rect());      // Rect
        paint(new Circle());    // Circle
    }
}