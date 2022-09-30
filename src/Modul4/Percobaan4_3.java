package Modul4;

import java.util.Scanner;

public class Percobaan4_3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int angka = scan.nextInt();

        if (angka == 1) System.out.println("Satu");
        else if (angka == 2) System.out.println("Dua");
        else if (angka == 3) System.out.println("Tiga");
        else if (angka == 4) System.out.println("Empat");
        else if (angka == 5) System.out.println("Lima");
        else if (angka == 6) System.out.println("Enam");
        else if (angka == 7) System.out.println("Tujuh");
        else if (angka == 8) System.out.println("Delapan");
        else if (angka == 9) System.out.println("Sembilan");
        else if (angka == 10) System.out.println("Sepuluh");
        else System.out.println("Invalid number");

        switch(angka) {
            case 1:
            System.out.println("Satu");
            break;
            case 2:
            System.out.println("Dua");
            break;
            case 3:
            System.out.println("Tiga");
            break;
            case 4:
            System.out.println("Empat");
            break;
            case 5:
            System.out.println("Lima");
            break;
            case 6:
            System.out.println("Enam");
            break;
            case 7:
            System.out.println("Tujuh");
            break;
            case 8:
            System.out.println("Delapan");
            break;
            case 9:
            System.out.println("Sembilan");
            break;
            case 10:
            System.out.println("Sepluh");
            break;
            default:
            System.out.println("Invalid Number");
        }
    }
}
