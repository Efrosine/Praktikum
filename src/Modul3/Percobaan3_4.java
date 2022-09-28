package Modul3;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Percobaan3_4 {

    static class Daftar implements Comparable<Daftar> {

        String nama;
        int nilai;

        public Daftar(String nama, int nilai) {
            this.nama = nama;
            this.nilai = nilai;
        }

        public String getNama() {
            return nama;
        }

        public int getNilai() {
            return nilai;
        }

        @Override
        public int compareTo(Daftar o) {
            return this.nilai - o.nilai;
        }

    }

    public static void main(String[] args) {

        Daftar[] siswa = {
                new Daftar("Adi", 70),
                new Daftar("Budi", 65),
                new Daftar("Caca", 90),
                new Daftar("Deny", 75)
        };

        for (int i = 0; i < siswa.length; i++) {
            String huruf;
            int nilai = siswa[i].getNilai();
            if (nilai < 46) {
                huruf = "D";
            } else if (nilai < 56) {
                huruf = "C";
            } else if (nilai < 66) {
                huruf = "C+";
            } else if (nilai < 76) {
                huruf = "B";
            } else if (nilai < 86) {
                huruf = "B+";
            } else {
                huruf = "A";
            }
            System.out.println("Nama : " + siswa[i].getNama() + "\tNilai : " + huruf);
        }

        Arrays.sort(siswa);
        JOptionPane.showMessageDialog(null, "Nilai Tertinggi adalah " + siswa[siswa.length - 1].getNama() + "("
                + siswa[siswa.length - 1].getNilai() + ")");
        JOptionPane.showMessageDialog(null,
                "Nilai Terendah adalah " + siswa[0].getNama() + "(" + siswa[0].getNilai() + ")");
    }
}
