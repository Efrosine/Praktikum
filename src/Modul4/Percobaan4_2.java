package Modul4;

public class Percobaan4_2 {

    static int getPw(int num, int pow) {
        int power = num;
        for (int i = 1; i < pow; i++) {
            power *= num;
        }
        return power;
    }

    static int getFac(int num) {
        int factorial = num;
        for (int i = num; i > 1; i--) {
            factorial *= i - 1;
        }
        return factorial;
    }

    public static void main(String[] args) {
        
        System.out.println("a. 4^3+5^2 = " + (getPw(4, 3) + getPw(5, 2)));
        System.out.println("b. 5!+4! = " + (getFac(5) + getFac(4)));
        double hasil = (getPw(4, 2) + getPw(5, 1)) / 5d + getPw(4, 2);
        System.out.println("c. (4^2+5^1) / 5 + 4^2 = " + hasil);
       
    }
}
