package chapter04.exercise17;

public class RandomIntWhile {
    public static void main(String[] args) {
        int random;
        int randomTemp = 0;

        while (true){
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
