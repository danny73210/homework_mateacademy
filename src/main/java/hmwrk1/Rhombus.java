package hmwrk1;

public class Rhombus {
    public static void main(String[] args) {
        int i, j, N = 11;
        int center = N / 2;
        for (i = 0; i < N; i++) {
            for (j = 0; j < N; j++) {
                if (i <= center) {
                    // top half of rombus
                    if (j >= center - i && j <= center + i)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                } else {
                    // Bottom half of rombus
                    if (j >= center + i - N + 1 && j <= center - i + N - 1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}

