package Laprak5;

public class ConstructorKendaraan {
    private String merk;
    private static String pemilik;

    protected ConstructorKendaraan() {
        merk = null;
    }

    protected ConstructorKendaraan(String merk) {
        this.merk = merk;
    }

    protected String getMerk() {
        return merk;
    }

    protected void setMerk(String merk) {
        this.merk = merk;
    }

    protected static String getPemilik() {
        return pemilik;
    }

    protected static void setPemilik(String pemilik) {
        ConstructorKendaraan.pemilik = pemilik;
    }

    protected void tampil(String a) {
        System.out.println(a);
        a = null;
    }

    protected void hapus() {
        merk = null;
        pemilik = null;
    }
}