package chapter02.home.exercise07;

public class StaticTest {
    static int i = 47;

    public static void main(String[] args) {
        Incrementable sf = new Incrementable();
        sf.increment();

        System.out.println(i);
    }
}
