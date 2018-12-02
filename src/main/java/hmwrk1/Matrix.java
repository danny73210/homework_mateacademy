package hmwrk1;

public class Matrix {
    public static void main(String[] args) {
        int[][] mas = {{1, 2, 3, 4, 5},
                {-2, -3, -4, -5, -6},
                {3, 4, 5, 6, 7},
                {-4, -5, -6, -7, -8},
                {5, 6, 7, 8, 9}};

        Matrix.printMatrix(mas);
        System.out.println("reflected matrix: \n");
        Matrix.reflectMatrix(mas);
        Matrix.printMatrix(mas);

    }

    public static void reflectMatrix(int[][] mas) {
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j <= i; j++) {
                int temp = mas[i][j];
                mas[i][j] = mas[j][i];
                mas[j][i] = temp;
            }
        }
    }

    public static void printMatrix(int[][] mas) {
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.print(mas[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
}