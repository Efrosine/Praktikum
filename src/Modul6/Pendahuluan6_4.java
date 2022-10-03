package Modul6;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JOptionPane;

public class Pendahuluan6_4 {
    public static void main(String[] args) {

        int data2[][] = { { 4, 6, 4, 7, 8, 3, 2, 10 }, { 4, 6, 4, 2, 8, 8, 2, 10 } };
        int input = Integer.parseInt(JOptionPane.showInputDialog("Massukan angka :"));
        List<int[]> indexArr = new ArrayList<>();
        for (int i = 0; i < data2.length; i++) {
            for (int j = 0; j < data2[i].length; j++) {
                if (data2[i][j] == input) {
                    int[] arr = { i, j };
                    indexArr.add(arr);
                }
                ;
            }
        }

        String sIndex ="";
       for(int[] ind :indexArr){
        sIndex += MessageFormat.format("{0}, ",Arrays.toString(ind));
       }
       System.out.println(MessageFormat.format("Nilai {0} berada pada index : {1}",input,sIndex));
    }
}
