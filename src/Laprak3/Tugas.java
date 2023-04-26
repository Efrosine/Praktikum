package Laprak3;

public class Tugas {
    int[][] matrikA, matrikB, hasilTambah;
    double[][] hasilKali;

    public int[][] getMatrikA() {
        return matrikA;
    }

    public void setMatrikA(int[][] matrikA) {
        this.matrikA = matrikA;
    }

    public int[][] getMatrikB() {
        return matrikB;
    }

    public void setMatrikB(int[][] matrikB) {
        this.matrikB = matrikB;
    }

    public int[][] getHasilTambah() {
        return hasilTambah;
    }

    public void setHasilTambah(int[][] a, int[][] b) {
        hasilTambah = a;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                hasilTambah[i][j] = a[i][j] + b[i][j];
            }
        }
    }

    public double[][] getHasilKali() {
        return hasilKali;
    }

    public void setHasilKali(int[][] data, double pengali) {
        hasilKali = new double[data.length][data[0].length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                hasilKali[i][j] = data[i][j] * pengali;
            }
        }
    }

    public void tampil(int data[][]) {
        int i, j;
        for (i = 0; i < data.length; i++) {
            for (j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void tampil(double data[][]) {
        int i, j;
        for (i = 0; i < data.length; i++) {
            for (j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}