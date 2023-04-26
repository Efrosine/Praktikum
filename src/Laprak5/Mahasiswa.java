package Laprak5;

public class Mahasiswa {
    private static String NamaUniv;
    private String Nama, Alamat;

    protected Mahasiswa(String nama, String alamat) {
        Nama = nama;
        Alamat = alamat;
    }

    protected static String getNamaUniv() {
        return NamaUniv;
    }

    protected static void setNamaUniv(String namaUniv) {
        NamaUniv = namaUniv;
    }

    protected String getNama() {
        return Nama;
    }

    protected String getAlamat() {
        return Alamat;
    }
}