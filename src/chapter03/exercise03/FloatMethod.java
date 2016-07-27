package chapter03.exercise03;

public class FloatMethod {
    float c;
}

class PassObject {
    static void f(FloatMethod y) {
        y.c = 5.2f;
    }
    public static void main(String[] args) {
        FloatMethod x = new FloatMethod();
        x.c = 32.5f;
        System.out.println("1: x.c: " + x.c);
        f(x);
        System.out.println("2: x.c: " + x.c);
    }
}

