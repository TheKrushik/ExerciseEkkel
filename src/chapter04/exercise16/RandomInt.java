package chapter04.exercise16;

public class RandomInt {
    public static void main(String[] args) {
        int random;
        int randomTemp = 0;
        for (int i = 0; i < 25; i++) {
            random = (int) (Math.random()*10 + 1);
            if (randomTemp == 0){
                System.out.println(random);
            }else if (random > randomTemp) {
                System.out.println(random + " - Больше предыдущего");
            }else if (random < randomTemp){
                System.out.println(random + " - Меньше предыдущего");
            }else if (random == randomTemp){
                System.out.println(random + " - Равно с предыдущим");
            }
            randomTemp = random;
        }
    }
}
