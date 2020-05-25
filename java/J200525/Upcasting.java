package J200525;

class Person {
    String name;
    String id;

    public Person(String name) {
        this.name = name;
    }
}

class Student extends Person {
    String grade;
    String department;

    public Student(String name) {
        super(name);
    }
}

public class Upcasting {
    public static void main(String[] args) {
        Person p;
        Student s = new Student("홍길동");

        p = s;      // 업캐스팅

        System.out.println(p.name);

        Person p1 = new Student("이재훈");
        Student s1;

        s1 = (Student)p1;   // 다운캐스팅

        System.out.println(s1.name);

        s1.grade = "A";
    }
}