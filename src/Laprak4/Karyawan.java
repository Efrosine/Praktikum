package Laprak4;

public class Karyawan {
    String nama, kota, devisi;
    int masaTugas, jumlahAnak;
    int bonus, tunjangan;

    public int getBonus() {
        return masaTugas;
    }

    public int getTunjangan() {
        return jumlahAnak * 120000;
    }

    public String getNama() {
        return nama;
    }

    public String getKota() {
        return kota;
    }

    public String getDevisi() {
        return devisi;
    }

    public int getMasaTugas() {
        return masaTugas;
    }

    public int getJumlahAnak() {
        return jumlahAnak;
    }
}