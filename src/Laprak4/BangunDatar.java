package Laprak4;

public class BangunDatar {
    private String namaClass;
    public double keliling;
    public double luas;

    public String getNamaClass() {
        return namaClass;
    }

    public void setNamaClass(String namaClass) {
        this.namaClass = namaClass;
    }

    public void setHitungKeliling() {
        this.keliling = 0;
    }

    public void setHitungLuas() {
        this.luas = 0;
    }

    public double getKeliling() {
        return this.keliling;
    }

    public double getLuas() {
        return this.luas;
    }
}