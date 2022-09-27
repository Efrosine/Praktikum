package Modul3;

import javax.swing.JOptionPane;

public class Pendahuluan3_2 {
    public static void main(String[] args) {
        
        String nDepan = "", nBelakang = "";
        nDepan = JOptionPane.showInputDialog("Nama depan kamu");
        nBelakang = JOptionPane.showInputDialog("Nama belakang kamu");

        String msg = "Nama lengkap kamu adalah " + nDepan + " " + nBelakang;
        JOptionPane.showMessageDialog(null, msg);
    }
}
