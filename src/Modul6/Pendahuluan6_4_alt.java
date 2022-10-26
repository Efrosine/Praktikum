package Modul6;
import javax.swing.*;
public class Pendahuluan6_4_alt {
    public static void main(String[] args) {
        int data2[][] = { { 4, 6, 4, 7, 8, 3, 2, 10 }, { 4, 6, 4, 2, 8, 8, 2, 10 } };
        int input = Integer.parseInt(JOptionPane.showInputDialog("Massukan angka :"));

        System.out.print("Angka "+ input+" berada di index ");
        for(int i =0;i<data2.length;i++){
            for(int j =0;j<data2[i].length;j++){
               if(data2[i][j] == input) System.out.print("("+i+","+j+")");
            }
        }
    }
}
