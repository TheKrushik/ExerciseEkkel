package chapter03.exercise08;

import java.util.Random;

public class Long16And8 {

    public static void main(String[] args) {
        long n1 = 0x2f; //Шестнадцатиричное
        System.out.println("l1: " + Long.toBinaryString(n1));

        long n2 = 0177; //Восьмиричное
        System.out.println("l2: " + Long.toBinaryString(n2));
    }

}
