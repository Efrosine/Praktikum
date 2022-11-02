package Modul7.Percobaan7_1;

import java.util.Scanner;

public class coba {

    public static int rekur(int x, int y) {
        if (y == 0) {
            return 1;
        } else {
            return x * rekur(x, y - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("x");
        int x = sc.nextInt();
        System.out.println("y");
        int y = sc.nextInt();
        System.out.println(rekur(x, y));
    }
}
