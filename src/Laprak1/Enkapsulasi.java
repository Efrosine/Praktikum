package Laprak1;

public class Enkapsulasi {
    private int alas, tinggi;
    private double luasSegitiga;

    public int getAlas() {
        return alas;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public void setLuasSegitiga(int alas, int tinggi) {
        luasSegitiga = 0.5 * (double) (alas * tinggi);
    }

    public double getLuasSegitiga() {
        return luasSegitiga;
    }
}