package Laprak1;

public class ATKApp {
    private int total;

    public int getTotal() {
        return total;
    }

    public void setTotal(ATK... barang) {
        int result = 0;
        for (ATK temp : barang) {
            result += temp.getHarga();
        }
        total = result;
    }

    static void setData(ATK barang, String nama, int stok, int harga) {
        barang.setNama(nama);
        barang.setStok(stok);
        barang.setHargaSatuan(harga);
        barang.setHarga();
    }

    static void getData(ATK barang) {
        System.out.println("Nama alat tulis :" + barang.getNama());
        System.out.println("Stok :" + barang.getStok());
        System.out.println("Harga Satuan :" + barang.getHargaSatuan());
        System.out.println("Harga " + barang.getNama() + " :" + barang.getHarga());
        System.out.println();
    }

    public static void main(String[] args) {
        ATK bolpoint = new ATK();
        ATK pensil = new ATK();
        ATK penghapus = new ATK();

        setData(bolpoint, "Bolpoint", 10, 2000);
        setData(pensil, "Pensil", 10, 1000);
        setData(penghapus, "Penghapus", 10, 500);

        getData(bolpoint);
        getData(pensil);
        getData(penghapus);

        System.out.println();

        ATKApp app = new ATKApp();
        app.setTotal(bolpoint, pensil, penghapus);
        System.out.println("Total Harga : " + app.getTotal());
    }
}
