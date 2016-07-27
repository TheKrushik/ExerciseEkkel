package chapter03.exercise02;

public class FloatClass {
    float x;

    public static void main(String[] args) {
        FloatClass f1 = new FloatClass();
        FloatClass f2 = new FloatClass();

        f1.x = 5.2f;
        f2.x = 3.5f;
        System.out.println("1: f1.x: " + f1.x + ", f2.x: " + f2.x);

        f1 = f2;
        System.out.println("2: f1.x: " + f1.x + ", f2.x: " + f2.x);

        f1.x = 9.9f;
        System.out.println("3: f1.x: " + f1.x + ", f2.x: " + f2.x);

    }
}
