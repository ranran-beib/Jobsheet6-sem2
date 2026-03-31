public class Dosen05 {
    String kode, nama;
    boolean jenisKelamin;
    int usia;

    Dosen05(String kd, String nama, boolean jk, int usia) {
        this.kode = kd;
        this.nama = nama;
        this.jenisKelamin = jk;
        this.usia = usia;
    }

    void tampil() {
        System.out.println(kode + " " + nama + " " + usia);
    }
}