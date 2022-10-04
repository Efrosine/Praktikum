package Modul6;

import javax.swing.JOptionPane;

import java.text.MessageFormat;
import java.util.*;

public class Percobaan6_2 {
    public static void main(String[] args) {
        int data2[][] = { { 4, 6, 4, 2, 8, 4, 2, 10 }, { 4, 6, 4, 2, 8, 4, 2, 10 } };
        for (int a = 0; a < data2.length; a++) {
            for (int b = 0; b < data2[0].length; b++) {
                System.out.print(data2[a][b] + " ");
            }
            System.out.println();
        }

        System.out.println("\nWhile");
        int row1 = 0;
        while (row1 < data2.length) {
            int column = 0;
            while (column < data2[row1].length) {
                System.out.print(data2[row1][column] + " ");
                column++;
            }
            System.out.println();
            row1++;
        }

        System.out.println("\nDo While");
        int row2 = 0;
        do {
            int column = 0;
            do {
                System.out.print(data2[row2][column] + " ");
                column++;
            } while (column < data2[row2].length);
            System.out.println();
            row2++;
        } while (row2 < data2.length);

        int sumArr = 0, lengthArr = 0;
        for (int i = 0; i < data2.length; i++) {
            for (int j = 0; j < data2[i].length; j++) {
                sumArr += data2[i][j];
                lengthArr++;
            }
        }

        int rerata = sumArr / lengthArr;
        System.out.println("\nNilai Reratanya : " + rerata);

        int input = Integer.parseInt(JOptionPane.showInputDialog("Massukan angka : "));
        List<int[]> index = new ArrayList<>();
        for (int i = 0; i < data2.length; i++) {
            for (int j = 0; j < data2[i].length; j++) {
                if (data2[i][j] == input) {
                    int[] arr = { i, j };
                    index.add(arr);
                }
            }
        }

        System.out.println("Index dari angka : " + input);
        String sIndex = "";
        for (int[] ind : index) {
            sIndex += MessageFormat.format("{0}, ", Arrays.toString(ind));
        }
        System.out.println(sIndex);

        int convert = Integer.parseInt((JOptionPane.showInputDialog("Massukan angka pengganti : ")));
        for (int[] ind : index) {
            int rows = ind[0], columns = ind[1];
            data2[rows][columns] = convert;
        }

        System.out.println(MessageFormat.format("\nHasil pergantian angka {0} ke angka {1}", input, convert));
        for (int a = 0; a < data2.length; a++) {
            for (int b = 0; b < data2[0].length; b++) {
                System.out.print(data2[a][b] + " ");
            }
            System.out.println();
        }

        // soal d sulit di pahami
    }

}
