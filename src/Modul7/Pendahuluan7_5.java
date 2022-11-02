package Modul7;
public class Pendahuluan7_5 {

    static void Print(int angka) {
        System.out.println("Luas Lingkaran "+Lingkaran(angka));
    }

    static double Lingkaran(int jari){
        return Math.PI*Math.pow(jari, 2);
    }

    public static void main(String[] args) {
    Print(3);    
    }
}
