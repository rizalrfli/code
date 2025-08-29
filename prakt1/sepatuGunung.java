public class sepatuGunung extends sepatu {
    public int berat;
    public boolean antiAir;

    public sepatuGunung(String merk, String warna, String bahan, int ukuran, int berat, boolean antiAir) {
        super(merk, warna, bahan, ukuran);
        this.berat = berat;
        this.antiAir = antiAir;
    }

    public void mendaki() {
        System.out.println("Sepatu gunung ini cocok untuk mendaki.");
    }
    public void bersihkan(){
        System.out.println("Membersihkan sepatu gunung.");
    }
    public void infoSepatu(){
        System.out.println("Informasi sepatu gunung:");
        System.out.println("Berat: " + berat + " gram");
        System.out.println("Anti Air: " + (antiAir ? "Ya" : "Tidak"));
        cetakInfo();
    }
}
