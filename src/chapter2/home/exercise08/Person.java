package chapter2.home.exercise08;

public class Person {
    static int age = 20;

    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();

        System.out.println(person1.age);
        System.out.println(person2.age);
        System.out.println(person3.age);

        person1.age++;

        System.out.println(person1.age);
        System.out.println(person2.age);
        System.out.println(person3.age);
    }
}
