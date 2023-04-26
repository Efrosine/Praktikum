package Laprak4;

public class Produksi extends Karyawan {
    public Produksi(String nama, String kota, int masaTugas, int jumlahAnak) {
        this.nama = nama;
        this.kota = kota;
        this.masaTugas = masaTugas;
        this.jumlahAnak = jumlahAnak;
        this.devisi = "Produksi";
    }

    @Override
    public int getBonus() {
        return super.getBonus() * 80000;
    }
}