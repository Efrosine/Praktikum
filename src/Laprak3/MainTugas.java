package Laprak3;

public class MainTugas {
    public static void main(String[] args) {
        Tugas ob = new Tugas();
        System.out.println("Matrik A");
        int[][] matrixA = {
                { 1, 2 },
                { 3, 5 },
                { 6, 7 }
        };
        ob.setMatrikA(matrixA);
        ob.tampil(ob.getMatrikA());
        System.out.println("Matrik B");
        int[][] matrixB = {
                { 8, 9 },
                { 10, 11 },
                { 12, 13 }
        };
        ob.setMatrikB(matrixB);
        ob.tampil(ob.getMatrikB());
        System.out.println("Hasil Tambah");
        ob.setHasilTambah(ob.getMatrikA(), ob.getMatrikB());
        ob.tampil(ob.getHasilTambah());
        System.out.println("Hasil Kali");
        ob.setHasilKali(ob.getHasilTambah(), 0.5);
        ob.tampil(ob.getHasilKali());
    }
}