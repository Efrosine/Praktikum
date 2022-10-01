package Modul4;

import java.util.Scanner;

public class Percobaan4_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Angka = ");
        int angka = scan.nextInt();
        scan.close();

        for (int i = 1;i<=angka;i++){
            for(int j = 1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("\n");

        for (int i = 0; i < angka; i++) { // baris
            for (int j = 0; j < 2; j++) { // kanan kiri
                String star = "* ";
                for (int k = 0; k < angka; k++) { // perulangan persisi
                    if (j == 0) { // jika sisi kiri
                        if (k > i)
                            star = "  ";
                    } else { // jika sisi knan
                        if((angka-k)<=i) star = "  ";
                    }
                    System.out.print(star);
                }
            }
            System.out.println("");
        }
        System.out.println("\n");

        for (int i = 0; i < angka; i++) {
            for (int j = 0; j < 2; j++){
                String star = "* ";
                for (int k = 0; k < angka; k++) {
                    if((angka-k)<=i) star = "  ";
                    System.out.print(star);
                }
            }
            System.out.println("");
        }
    }
}
