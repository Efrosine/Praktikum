package Laprak4;

public class Lingkaran extends BangunDatar {
    private double r;
    private double pi = 3.14;

    public void setR(double r) {
        this.r = r;
    }

    public double getR() {
        return this.r;
    }

    public void setHitungLuas() {
        this.luas = this.pi * this.r * this.r;
    }

    public void setHitungKeliling() {
        this.keliling = 2 * this.pi * this.r;
    }
}