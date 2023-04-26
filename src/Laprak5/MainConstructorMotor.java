package Laprak5;

public class MainConstructorMotor {
    public static void main(String[] args) {
        String pemilik = "Ahmad Afif";
        String merk = "Honda";
        String warna = "Merah";
        ConstructorKendaraan.setPemilik(pemilik);
        System.out.println("Pemilik Kendaraan = " + ConstructorKendaraan.getPemilik());
        System.out.println("========================");

        ConstructorKendaraan ob = new ConstructorKendaraan(merk);
        ob.tampil("Merk Kendaraan = " + ob.getMerk());
        ob.tampil("Pemilik Kendaraan = " + ob.getPemilik());
        System.out.println("=========================");

        ConstructorKendaraan ob2 = new ConstructorKendaraan();
        ob2.tampil("Merk Kendaraan (instant)= " + ob2.getMerk());
        ob2.tampil("Pemilik Kendaraan (static)= " + ob2.getPemilik());
        System.out.println("=========================");

        ConstructorMotor ob3 = new ConstructorMotor(merk, warna);
        ob3.tampil("Merk Kendaraan = " + ob3.getMerk());
        ob3.tampil("Warna Motor = " + ob3.getWarna());
        ob3.tampil("Pemilik Kendaraan = " + ob3.getPemilik());
        System.out.println("=========================");

        pemilik = null;
        merk = null;
        warna = null;
        ob.hapus();
        ob = null;
        ob2 = null;
        ob3 = null;
    }
}