package prakt6.KendaraanOOp;

public class Mobil extends Kendaraan {
    private int jumlahPintu;

    public Mobil(String merk, int tahunProduksi, int jumlahPintu) {
        super(merk, tahunProduksi); // Memanggil constructor dari superclass (Kendaraan)
        this.jumlahPintu = jumlahPintu;
    }

    @Override
    public void jalankan() {
        System.out.println("Mobil " + merk + " berjalan...");
    }

    @Override
    public void info() {
        super.info(); // Memanggil method info() dari superclass
        System.out.println("Jumlah pintu: " + jumlahPintu);
    }
}
