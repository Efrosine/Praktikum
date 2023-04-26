package Laprak4;

import javax.swing.JOptionPane;

public class MainInheritance1 {
    public static void main(String[] args) {
        String panjang, lebar;
        panjang = JOptionPane.showInputDialog("Massukan panjang persegi panjang (cm) : ");
        lebar = JOptionPane.showInputDialog("Massukan lebar persegi panjang (cm) : ");

        PersegiPanjang po = new PersegiPanjang();
        po.setNamaClass("Persegi Panjang");
        po.setPanjang(Double.parseDouble(panjang));
        po.setLebar(Double.parseDouble(lebar));
        po.setHitungKeliling();
        po.setHitungLuas();

        System.out.println("Panjang " + po.getNamaClass() + " = " + po.getPanjang() + " cm");
        System.out.println("Lebar " + po.getNamaClass() + " = " + po.getLebar() + " cm");
        System.out.println("Keliling " + po.getNamaClass() + " = " + po.getKeliling() + " cm");
        System.out.println("Luas " + po.getNamaClass() + " = " + po.getLuas() + " cm2");
    }
}