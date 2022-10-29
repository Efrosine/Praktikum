package Modul7;

import javax.swing.JOptionPane;

public class Percobaan7_3 {
    public int lPersegi(int p ,int l){
        int luas = p*l;
        return luas;
    }
    public double lTiga(int a, int t){
        double luas = .5d*a*t;
        return luas;
    }
    public double lLingkar(int r) {
        double luas = Math.PI*Math.pow(r,2);
        return luas;
    }
    public static void main(String[] args) {
       Percobaan7_3 pc = new Percobaan7_3();
       int p = Integer.parseInt(JOptionPane.showInputDialog("Panjang Persegi"));
       int l = Integer.parseInt(JOptionPane.showInputDialog("Lebar Persegi"));
       System.out.println("Luas persegi = "+ pc.lPersegi(p, l));

       int a = Integer.parseInt(JOptionPane.showInputDialog("Alas Lingkaran"));
       int t = Integer.parseInt(JOptionPane.showInputDialog("Tinggi Lingkaran"));
       System.out.println("Luas persegi = "+ pc.lTiga(a, t));

       int r = Integer.parseInt(JOptionPane.showInputDialog("Jari Jari Lingkaran"));
       System.out.println("Luas persegi = "+ pc.lLingkar(r));
    }
}
