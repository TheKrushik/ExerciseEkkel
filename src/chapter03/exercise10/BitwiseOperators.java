package chapter03.exercise10;

public class BitwiseOperators {
    public static void display(int value) {
        System.out.println("16Bit=" + Integer.toBinaryString(value) + " Decimal=" + value);
    }

    public static void main(String[] args) {
        int i1 = 0x10101010;
        int i2 = 0x01010101;

        display(i1);
        display(i2);
    }

}
