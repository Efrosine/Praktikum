package Laprak4;

import javax.swing.JOptionPane;

public class CobaInput2 {
    public static void main(String[] args) {
        String nama, kota;
        nama = JOptionPane.showInputDialog("Massukan nama Anda : ");
        kota = JOptionPane.showInputDialog("Masukkan kota anda : ");
        System.out.println("Selamat datang " + nama + " dari " + kota);
        System.exit(0);
    }
}