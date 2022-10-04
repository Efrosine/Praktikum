package Modul5;

public class Pendahuluan5_5 {
    public static void main(String[] args) {

        int data[] = { 4, 6, 4, 2, 8, 4, 2, 11 };
        int a = 0;
        System.out.print("While : ");
        while (a < data.length) {
            System.out.print(data[a] + " ");
            a++;
        }
        System.out.println("");

        int b = 0;
        System.out.print("Do While : ");
        do {
            System.out.print(data[b] + " ");
            b++;
        } while (b < data.length);
        System.out.println("");

        System.out.print("For : ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }
}
