package chapter03.exercise09;

public class MaxMinFloatDouble {

    public static void main(String[] args) {
        float expMinFloat = -1.4e-45f;
        float expMaxFloat = 3.4e+38f;

        System.out.println(expMinFloat);
        System.out.println(expMaxFloat);

        double expMinDouble = -4.9e-324;
        double expMaxDouble = 1.7e+308;
        System.out.println(expMinDouble);
        System.out.println(expMaxDouble);
    }

}
