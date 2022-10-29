package Modul5;

import javax.swing.*;

public class Pendahuluan5_4alt {
 
    public static void main(String[] args) {
        int data[] = { 4, 6, 4, 2, 8, 4, 2, 11 };
    
        int input = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan angkanya : "));

        String index = "";
        
        for (int i = 0; i < data.length; i++) {
            if (data[i] == input){
                index += ","+i;
            }  
        }
        JOptionPane.showMessageDialog(null, "Angka "+input+" berada pada index = "+index);
    }
}
