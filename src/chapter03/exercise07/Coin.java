package chapter03.exercise07;

import java.util.Random;

public class Coin {

    public static void main(String[] args) {
        getToss();
    }

    private static void getToss() {
        Random rand = new Random();
        boolean n;
        n = rand.nextBoolean();
        if (n) {
            System.out.println("Решка");
        }else {
            System.out.println("Орел");
        }
    }
}
