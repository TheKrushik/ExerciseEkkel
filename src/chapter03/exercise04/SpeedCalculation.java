package chapter03.exercise04;

public class SpeedCalculation {

    public static void main(String[] args) {
        float distance = 550;
        float time = 6;
        float speed = getSpeed(distance, time);
        System.out.println(speed + " км/ч");
    }

    public static float getSpeed(float distance, float time){
        return distance / time;
    }
}
