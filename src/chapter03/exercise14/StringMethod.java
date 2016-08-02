package chapter03.exercise14;

public class StringMethod {
    public static void main(String[] args) {


        getComprasion("Привет", "Пока");

        System.out.println("++++++++++++++++++++++++++++++");

        getComprasion("Hello", "Hello");
    }


    public static void getComprasion(String s1, String s2) {
        if (s1 == s2) {
            System.out.println("== " + true);
        }else {
            System.out.println("== " + false);
        }

        if (s1 != s2) {
            System.out.println("!= " + true);
        }else {
            System.out.println("!= " + false);
        }

        String str1 = new String(s1);
        String str2 = new String(s2);
        if (str1.equals(str2)) {
            System.out.println("equals " + true);
        }else {
            System.out.println("equals " + false);
        }

    }
}
