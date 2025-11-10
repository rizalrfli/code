package prakt6.KendaraanOOp;

public class Truk extends Kendaraan {
    int kapasitasTon;

    public Truk(String merk, int tahunProduksi, int kapasitasTon) {
        super(merk, tahunProduksi);
        this.kapasitasTon = kapasitasTon;
    }

    @Override
    public void jalankan() {
        System.out.println("Truk " + merk + " berjalan...");
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Kapasitas Ton: " + kapasitasTon);
    }
    
}
