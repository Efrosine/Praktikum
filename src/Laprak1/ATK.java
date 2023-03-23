package Laprak1;

public class ATK {
    private String nama;
    private int stok;
    private int hargaSatuan;
    private int harga;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public int getHargaSatuan() {
        return hargaSatuan;
    }

    public void setHargaSatuan(int hargaSatuan) {
        this.hargaSatuan = hargaSatuan;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga() {
        harga = hargaSatuan * stok;
    }
}
