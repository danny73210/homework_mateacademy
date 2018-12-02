package hmwrk1;

public class Fibonachi {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(fibonachi(i));
        }
    }

    static int fibonachi(int n) {

        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        else
            return fibonachi(n - 1) + fibonachi(n - 2);

    }
}
