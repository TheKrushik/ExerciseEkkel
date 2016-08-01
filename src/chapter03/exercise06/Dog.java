package chapter03.exercise06;

public class Dog {

    String name;
    String says;


    public static void main(String[] args) {

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        dog1.name = "spot";
        dog2.name = "scruffy";
//        dog1.says = "буп-буп";
//        dog2.says = "гуау";

        dog1.name = dog2.name;

        System.out.println(dog1 == dog2);
        System.out.println(dog1.equals(dog2));

    }

}
