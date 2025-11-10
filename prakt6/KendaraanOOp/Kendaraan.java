package prakt6.KendaraanOOp;

public abstract class Kendaraan {
    String merk;
    int tahunProduksi;

    public Kendaraan(String merk, int tahunProduksi) {
        this.merk = merk;
        this.tahunProduksi = tahunProduksi;
    }

    public abstract void jalankan();

    public void info() {
        System.out.println("Merk: " + merk);
        System.out.println("Tahun produksi: " + tahunProduksi);
    }
}
