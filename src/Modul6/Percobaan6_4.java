package Modul6;

import javax.swing.JOptionPane;
import java.text.MessageFormat;
import java.util.*;

public class Percobaan6_4 {

    static void printArr(int[][] arr) {
        for (int a = 0; a < arr.length; a++) {
            for (int b = 0; b < arr[0].length; b++) {
                System.out.print(arr[a][b] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matric1 = {
                { 2, 9 }, { 1, 5 }
        };
        int[][] matric2 = {
                { 5, 17 }, { 10, 4 }
        };

        System.out.println("Matriks 1");
        printArr(matric1);
        System.out.println("\nMatriks 2");
        printArr(matric2);

        int[][] hasil = new int[2][2];

        int input = Integer.parseInt(JOptionPane.showInputDialog("Massukan angka : "));
        List<int[]> index = new ArrayList<>();
        for (int i = 0; i < matric1.length; i++) {
            for (int j = 0; j < matric1[i].length; j++) {
                if (matric1[i][j] == input) {
                    int[] arr = { i, j };
                    index.add(arr);
                }
            }
        }

        System.out.println("\nIndex dari angka : " + input);
        String sIndex = "";
        for (int[] ind : index) {
            sIndex += MessageFormat.format("{0}, ", Arrays.toString(ind));
        }
        System.out.println(sIndex);

        for (int i = 0; i < hasil.length; i++) {
            for (int j = 0; j < hasil[i].length; j++) {
                hasil[i][j] = matric1[i][j] + matric2[i][j];
            }
        }

        System.out.println("\nHasil perjumlahannya : ");
        printArr(hasil);
    }
}
