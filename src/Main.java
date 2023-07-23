public class Main {

    public static void main(String[] args) {
        int score = 120;
        int refill = 1350;

        int bonus;
        if (refill > 1000) {
            bonus = (refill / 100);
        } else {
            bonus = 0;
        }

        System.out.println(score + refill + bonus);

    }
}