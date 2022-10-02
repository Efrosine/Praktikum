package Modul5.Percobaan5_1;

import javax.swing.JOptionPane;

public class ArrayDinamisInput {

    public static void main(String[] args) {
        int data[] = new int[10];
        for (int a = 0; a < data.length; a++) {
            data[a] = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukan Element Index ke " + a));
            System.out.print("Index Ke" + a + " adalah " + data[a]);
        }
    }

}
