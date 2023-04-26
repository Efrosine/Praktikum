package Laprak4;

import javax.swing.JOptionPane;

public class MainInheritance2 {
    public static void main(String[] args) {
        double jari = Double.parseDouble(JOptionPane.showInputDialog("Masukkan Jari-Jar Lingkaran :"));

        Lingkaran bunder = new Lingkaran();
        bunder.setNamaClass("Lingkaran");
        bunder.setR(jari);
        bunder.setHitungKeliling();
        bunder.setHitungLuas();

        System.out.println("Jari-Jari " + bunder.getNamaClass() + " = " + bunder.getR() + "cm");
        System.out.println("Keliling " + bunder.getNamaClass() + " = " + bunder.getKeliling() + "cm");
        System.out.println("Luas " + bunder.getNamaClass() + " = " + bunder.getLuas() + "cm2");
    }
}