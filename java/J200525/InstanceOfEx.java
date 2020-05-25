package J200525;

class Personp {};
class Students extends Personp {};
class Researcher extends Students {};
class Professor extends Researcher {};

public class InstanceOfEx {

    static void print(Personp p) {
        if(p instanceof Personp)
            System.out.println("Personp:");
        if(p instanceof Students)
            System.out.println("Students:");
        if(p instanceof Researcher)
            System.out.println("Researcher:");
        if(p instanceof Professor)
            System.out.println("Professor:");
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.print("new Student() -> \t"); print(new Students());
        System.out.print("new Researcher() -> \t"); print(new Researcher());
        System.out.print("new Professor() -> \t"); print(new Professor());

        // new Student() ->        Personp:
        // Students:   

        // new Researcher() ->     Personp:
        // Students:
        // Researcher:

        // new Professor() ->      Personp:
        // Students:
        // Researcher:
        // Professor:
    }
}