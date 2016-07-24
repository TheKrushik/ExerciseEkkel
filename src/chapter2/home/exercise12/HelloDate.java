package chapter2.home.exercise12;
//: object/HelloDate.java
import java.util.*;

/** Первая программа-пример книги.
 * Выводит строку и текущее число.
 * @author Брюс Эккель
 * @author www.MindView.net
 * @version 4.0
 */
public class HelloDate {
    /** Точка входа в класс и приложение
     * @param args Массив строковых аргументов
     * @throws exceptions Исключения не выдаются
     */
    public static void main(String[] args) {
        System.out.println("Привет, сегодня: ");
        System.out.println(new Date());
    }
} /* Output: (55% match)
Привет, сегодня:
Sun Jul 24 14:28:40 EEST 2016
*///:~