package Laprak4;

public class Marketing extends Karyawan {

    public Marketing(String nama, String kota, int masaTugas, int jumlahAnak) {
        this.nama = nama;
        this.kota = kota;
        this.masaTugas = masaTugas;
        this.jumlahAnak = jumlahAnak;
        this.devisi = "Marketing";
    }

    @Override
    public int getBonus() {
        return super.getBonus() * 100000;
    }
}