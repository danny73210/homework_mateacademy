package hmwrk1;

import java.util.Scanner;

public class Fibonachi {
    public static void main(String[] args) {
        for (int i = 1; i <=  10; i++) {
            System.out.println(fibonachi(i));
        }
    }

    public static int fibonachi(int n) {
        if (n <= 2) {
            return 1;
        }
        return fibonachi(n - 1) + fibonachi(n - 2);
    }
}
