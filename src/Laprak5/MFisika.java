package Laprak5;

public class MFisika extends Mahasiswa implements IMahasiswa {
    final String initNim = "2264";
    private String nim;
    private String jurusan;

    protected MFisika(String nama, String alamat, String nim) {
        super(nama, alamat);
        this.nim = nim;
        this.jurusan = "Fisika";
    }

    protected String getNim() {
        return initNim + nim;
    }

    protected String getJurusan() {
        return jurusan;
    }

    @Override
    public void tampil() {
        System.out.println("NIM\t\t= " + getNim());
        System.out.println("Nama\t\t= " + super.getNama());
        System.out.println("Alamat\t\t= " + super.getAlamat());
        System.out.println("Jurusan\t\t= " + getJurusan());
        System.out.println("Universitas\t= " + getNamaUniv());
        System.out.println();
    }
}
