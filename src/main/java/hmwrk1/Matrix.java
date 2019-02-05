package hmwrk1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Matrix {

    public static void wtireToFile(int[][] matrix,String path) {
        try (FileWriter writer = new FileWriter(path)) {
            for (int i = 0; i < matrix.length; i++) {
                String text = Arrays.toString(matrix[i]);
                writer.append(text.substring(1, text.length() - 1));
                writer.append('\n');
            }
            writer.close();
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
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