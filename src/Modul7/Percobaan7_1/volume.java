package Modul7.Percobaan7_1;

import java.util.Scanner;

public class volume {
    static int readINT(String s){
        Scanner sc = new Scanner(System.in);
        System.out.print(s);
        int i = sc.nextInt();
        return i;
    }
    static double vTabung(int jari,int tinggi){
        return  Math.PI*Math.pow(jari, 2)*tinggi;
    }
    static double vKerucut(int jari, int tinggi){
        return vTabung(jari, tinggi)/3d;
    }
    static double vBola(int jari){
        return Math.PI*Math.pow(jari, 3)*4/3d;
    }

    public static void main(String[] args) {
        int jTab = readINT("Jari tabung = ");
        int tTab = readINT("Tinggi tabung = ");
        System.out.println("volum tabung = "+vTabung(jTab, tTab));

        int jKer = readINT("Jari Kerucut = ");
        int tKer = readINT("Tinggi Kerucut = ");
        System.out.println("Volume Kerucut = "+vKerucut(jKer, tKer));

        int jBol = readINT("Jari Bola = ");
        System.out.println("Volume Bola = "+vBola(jBol));
    }
}
