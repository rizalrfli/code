package prakt4;

public class Gerbong {
    private String kode;
    private Kursi[] arrayKursi;
    
    // Constructor
    public Gerbong(String kode, int jumlah) {
        this.kode = kode;
        this.arrayKursi = new Kursi[jumlah];
        this.initKursi();
    }
    
    // Method private untuk inisialisasi kursi
    private void initKursi() {
        for (int i = 0; i < arrayKursi.length; i++) {
            this.arrayKursi[i] = new Kursi(String.valueOf(i + 1));
        }
    }
    
    // Setter dan Getter
    public void setKode(String kode) {
        this.kode = kode;
    }
    
    public String getKode() {
        return kode;
    }
    
    public Kursi[] getArrayKursi() {
        return arrayKursi;
    }
    
    // Method untuk memasukkan penumpang
    public void setPenumpang(Penumpang penumpang, int nomor) {
        if (this.arrayKursi[nomor - 1].getPenumpang() != null) {
            System.out.println("Kursi nomor " + nomor + " sudah terisi oleh penumpang lain!");
            return;
        }
        this.arrayKursi[nomor - 1].setPenumpang(penumpang);
    }
    
    // Method info()
    public String info() {
        String info = "";
        info += "Kode: " + kode + "\n";
        for (Kursi kursi : arrayKursi) {
            info += kursi.info();
        }
        return info;
    }
}