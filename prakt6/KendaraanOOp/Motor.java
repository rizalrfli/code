package prakt6.KendaraanOOp;

public class Motor extends Kendaraan {
    private int kapasitasCC;

    public Motor(String merk, int tahunProduksi, int kapasitasCC) {
        super(merk, tahunProduksi); // Memanggil constructor dari superclass (Kendaraan)
        this.kapasitasCC = kapasitasCC;
    }

    @Override
    public void jalankan() {
        System.out.println("Motor " + merk + " berjalan...");
    }

    @Override
    public void info() {
        super.info(); // Memanggil method info() dari superclass
        System.out.println("Kapasitas CC: " + kapasitasCC);
    }
}
