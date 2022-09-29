package Modul3;

import java.io.*;
import javax.swing.JOptionPane;

public class Pendahuluan3_4 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = 0;
        int b = 0;
        try {
            System.out.print("Input Nilai a = ");
            a = Integer.parseInt(reader.readLine());
            System.out.print("Input Nilai b = ");
            b = Integer.parseInt(reader.readLine());
        } catch (IOException ex) {

        }
        int aa = Integer.parseInt(JOptionPane.showInputDialog("Input Nilai A"));
        int bb = Integer.parseInt(JOptionPane.showInputDialog("Input Nilai B"));

        System.out.println("(Buffer)Hasil penjumlahan a dan b adalah = " + (a + b));
        System.out.println("(JOption)Hasil penjumlahan aa dan bb adalah = " + (aa + bb));
    }
}