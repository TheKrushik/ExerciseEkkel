package chapter2.home.exercise06;

public class Storage {

    static String s = "какая-то строка";

    public static void main(String[] args) {
        Storage stor = new Storage();
        int lengthString = stor.storage(s);
        System.out.println(lengthString);
    }

    public int storage(String s){
        return s.length() * 2;
    }
}
