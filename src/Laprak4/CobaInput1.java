package Laprak4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CobaInput1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nama, kota;
        System.out.println("Nama Anda :");
        nama = br.readLine();
        System.out.println("");
        System.out.println("Kota Anda : ");
        kota = br.readLine();
        System.out.println("");
        System.out.println("Selamat Datang, " + nama + " dari " + kota);
    }
}