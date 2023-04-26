package Laprak5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MahasiswaApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== Selamat Datang =====");
        System.out.print("\nMasukkan Nama Universitasmu = ");
        Mahasiswa.setNamaUniv(sc.nextLine());

        char isLooping = 'y';
        List<IMahasiswa> listMahasiswa = new ArrayList<>();

        while (isLooping == 'y') {
            String nim, nama, alamat, jurusan;
            System.out.print("NIM (3 digit akhir) = ");
            nim = sc.nextLine();
            System.out.print("Nama\t= ");
            nama = sc.nextLine();
            System.out.print("Alamat\t= ");
            alamat = sc.nextLine();
            System.out.print(
                    "Jurusan -> 61 = MATEMATIKA, 62 = BIOLOGI, 63 = KIMIA, 64 = FISIKA,65 = TEKNIK INFORMATIKA, 66 = TEKNIK ARSITEKTUR\n\t= ");
            jurusan = sc.nextLine();

            switch (jurusan) {
                case "61":
                    listMahasiswa.add(new MMatematika(nama, alamat, nim));
                    break;
                case "62":
                    listMahasiswa.add(new MBiologi(nama, alamat, nim));
                    break;
                case "63":
                    listMahasiswa.add(new MKimia(nama, alamat, nim));
                    break;
                case "64":
                    listMahasiswa.add(new MFisika(nama, alamat, nim));
                    break;
                case "65":
                    listMahasiswa.add(new MTI(nama, alamat, nim));
                    break;
                case "66":
                    listMahasiswa.add(new MTA(nama, alamat, nim));
                    break;
                default:
                    break;
            }

            System.out.print("Apakah Anda ingin memasukkan data lagi ? (y) Ya : (t) Tidak = ");
            isLooping = sc.nextLine().charAt(0);
        }
        sc.close();

        System.out.println("\n===== Data Yang Sudah Dimasukkan =====");
        for (IMahasiswa mh : listMahasiswa) {
            mh.tampil();
        }
    }
}