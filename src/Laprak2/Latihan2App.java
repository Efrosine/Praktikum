package Laprak2;

public class Latihan2App {
    public void ubahAngka(int[] deret, int awal, int akhir) {
        for (int i = 0; i < deret.length; i++) {
            if (deret[i] == awal) {
                deret[i] = akhir;
            }
        }
    }

    public double[] kaliDeret(int[] deret, double angka) {
        double[] result = new double[deret.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = deret[i] * angka;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] deret = { 2, 5, 3, 4, 9, 5 };
        Latihan2 lt = new Latihan2();
        Latihan2App lp = new Latihan2App();
        lt.setDeret(deret);
        System.out.println("Deret angka");
        lt.tampil(deret);
        System.out.println("Ubah 5 jadi 1");
        lp.ubahAngka(lt.getDeret(), 5, 1);
        lt.tampil(deret);
        System.out.println("Kali setengah");
        lt.tampil(lp.kaliDeret(lt.getDeret(), 0.5));
    }
}