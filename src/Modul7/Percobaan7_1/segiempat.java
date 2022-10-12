package Modul7.Percobaan7_1;

public class segiempat {
    public void segiempat(int panjang, int lebar){
        double luas,keliling;
        luas = panjang*lebar;
        System.out.println("--------------------");
        System.out.println("Panjang Segi Empat = "+panjang);
        System.out.println("Lebar Segi Emapt "+lebar);
        System.out.println("Luas Segi Empat = "+luas);
    }

    public static void main(String[] args) {
        segiempat sg = new segiempat();
        sg.segiempat(10, 5);
    }
}
