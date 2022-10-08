package Modul7;

import java.lang.reflect.Method;

public class Pendahuluan7_4 {

    static void Print(int angka) {
        System.out.println(Kalimat()+" "+Lingkaran(angka));
    }

    static int Power(int angka) {
        return angka*angka;
    }

    static double Lingkaran(int jari){
        return Power(jari)*Math.PI;
    }

    static String Kalimat(){
        return "Luas Lingkaran ";
    }

    public static void main(String[] args) {
    Print(3);    
    }
}
