package Laprak4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainPT {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("=== Selamat Datang di PT.MOJO ===");
        System.out.print("Nama : ");
        String nama = reader.readLine();
        System.out.print("Kota : ");
        String kota = reader.readLine();
        System.out.print("Masa Tugas : ");
        int masaTugas = Integer.valueOf(reader.readLine());
        System.out.print("Jumlah Anak : ");
        int jumlahAnak = Integer.valueOf(reader.readLine());
        System.out.print("Devisi (1 = Marketing, 2 = Produksi): ");
        int devisi = Integer.valueOf(reader.readLine());

        Karyawan kw;
        if (devisi == 1)
            kw = new Marketing(nama, kota, masaTugas, jumlahAnak);
        else
            kw = new Produksi(nama, kota, masaTugas, jumlahAnak);

        System.out.println();
        System.out.println("===== Hasil Perhitungan =====");
        System.out.println("Nama : " + kw.getNama());
        System.out.println("Devisi : " + kw.getDevisi());
        System.out.println("Bonus : " + kw.getBonus());
        System.out.println("Tunjangan : " + kw.getTunjangan());
    }
}