package Modul7;

public class Pendahuluan7_6 {
    static void Countdown(int angka) {
        if (angka <= 0) {
            System.out.println("Mulai");
        } else {
            System.out.println(angka);
            Countdown(angka - 1);
        }
    }

    public static void main(String[] args) {
        Countdown(4);
    }
}
