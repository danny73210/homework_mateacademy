package hmwrk1;

public class ElvisTask {
    public static void main(String[] args) {

        System.out.println(check(1, 3, 1, 3));
        System.out.println(check(1, 3, 2, 5));
        System.out.println(check(1, 3, 3, 1));
        System.out.println(check(3, 1, 5, 2));

    }

    public static String check(int scoreOne, int scoreTwo, int guessOne, int guessTwo) {
        return scoreOne == guessOne && scoreTwo == guessTwo ? "QUESSED" :
                (scoreOne > guessOne && scoreTwo > guessTwo) ||
                        (scoreOne < guessOne && scoreTwo < guessTwo) ? "HALF QUESSED" : "NONE QUESSED";
    }
}
