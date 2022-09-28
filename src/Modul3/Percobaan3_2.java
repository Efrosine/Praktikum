package Modul3;

import java.io.*;
import java.util.Arrays;

public class Percobaan3_2 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int pertama = 0, kedua = 0, ketiga = 0;
        try {
            System.out.print("Masukkan Nilai Pertama = ");
            pertama = Integer.parseInt(reader.readLine());
            System.out.print("Masukkan Nilai Kedua = ");
            kedua = Integer.parseInt(reader.readLine());
            System.out.print("Masukkan Nilai Ketiga = ");
            ketiga = Integer.parseInt(reader.readLine());
        } catch (IOException ex) {
            System.out.println("error");
        }
        System.out.println("Nilai yang dimasukkan = " + pertama + ", " + kedua + ", " + ketiga);

        int[] niai = {pertama,kedua,ketiga};
        Arrays.sort(niai);

        System.out.println("Nilai Terbesar Adalah = " + niai[niai.length-1]+ "\nNilai Terkecil Adalah = " + niai[0]);
    }
}
