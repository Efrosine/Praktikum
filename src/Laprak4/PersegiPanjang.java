package Laprak4;

public class PersegiPanjang extends BangunDatar {
    private double panjang;
    private double lebar;

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public void setHitungKeliling() {
        this.keliling = 2 * (this.panjang + this.lebar);
    }

    public void setHitungLuas() {
        this.luas = this.panjang * this.lebar;
    }
}