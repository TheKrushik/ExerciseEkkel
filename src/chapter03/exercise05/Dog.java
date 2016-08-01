package chapter03.exercise05;

public class Dog {

    String name;
    String says;


    public static void main(String[] args) {

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        dog1.name = "spot";
        dog2.name = "scruffy";
        dog1.says = "буп-буп";
        dog2.says = "гуау";

        System.out.println(dog1.name + " лает: " + dog1.says);
        System.out.println(dog2.name + " лает: " + dog2.says);

    }

}
