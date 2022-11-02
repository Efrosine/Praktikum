package Modul7;

import javax.swing.JOptionPane;

public class Percobaan7_3 {
    static int readINT(String s){
        return Integer.parseInt(JOptionPane.showInputDialog(s));
    }
    public int lPersegi(int p ,int l){
        int luas = p*l;
        return luas;
    }
    public double lTiga(int a, int t){
        double luas = .5d*a*t;
        return luas;
    }
    public double lLingkar(int r) {
        return Math.PI*Math.pow(r,2);
    }
    public static void main(String[] args) {
       Percobaan7_3 pc = new Percobaan7_3();
       int p = readINT("Panjang Persegi");
       int l = readINT("Lebar Persegi");
       System.out.println("Luas Persegi = "+ pc.lPersegi(p, l));

       int a = readINT("Alas Segitiga");
       int t = readINT("Tinggi Segitiga");
       System.out.println("Luas Segitiga = "+ pc.lTiga(a, t));

       int r = readINT("Jari Jari Lingkaran");
       System.out.println("Luas Lingkaran = "+ pc.lLingkar(r));
    }
}
