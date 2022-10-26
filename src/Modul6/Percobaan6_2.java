package Modul6;

import javax.swing.JOptionPane;

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

        int sumArr = 0;
        double lengthArr = 0;
        for (int i = 0; i < data2.length; i++) {
            for (int j = 0; j < data2[i].length; j++) {
                sumArr += data2[i][j];
                lengthArr++;
            }
        }

        System.out.println(sumArr);
        System.out.println(lengthArr);
        double rerata = sumArr / lengthArr;
        System.out.println("\nNilai Reratanya : " + rerata);

        int input = Integer.parseInt(JOptionPane.showInputDialog("Massukan angka : "));
        int convert = Integer.parseInt(JOptionPane.showInputDialog("Massukan angka pengganti : "));
        for (int i = 0; i < data2.length; i++) {
            for (int j = 0; j < data2[i].length; j++) {
                if (data2[i][j] == input) {
                    data2[i][j] = convert;
                }
            }
        }

        for (int i = 0; i < data2.length; i++) {
            for (int j = 0; j < data2[0].length; j++) {
                System.out.print(data2[i][j] + " ");
            }
            System.out.println();
        }

        int evenSum =0;
        for (int i = 0; i < data2.length; i++) {
            for (int j = 0; j < data2[0].length; j++) {
               if(j%2==0) evenSum += data2[i][j];
            }
        }
        System.out.println("total dari inex genap = "+evenSum);

    }

}
