package chapter02.home.exercise01;
/*
Создайте класс с полями int и char, которые не инициализируются в программе.
Выведите их значение, что бы убедится в том, что Java выполняет инициализацию по умолчанию.
*/
public class IntCharDefault {

    int i;
    char c;

    public IntCharDefault() {
        System.out.println("i: " + i);
        System.out.println("c: " + c);
    }

    public static void main(String[] args) {
        new IntCharDefault();
    }
}
