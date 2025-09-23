package prakt4;

public class Penumpang {
    private String ktp;
    private String nama;
    
    // Constructor berparameter
    public Penumpang(String ktp, String nama) {
        this.ktp = ktp;
        this.nama = nama;
    }
    
    // Setter dan Getter
    public void setKtp(String ktp) {
        this.ktp = ktp;
    }
    
    public String getKtp() {
        return ktp;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }
    
    // Method info()
    public String info() {
        String info = "";
        info += "Ktp: " + ktp + "\n";
        info += "Nama: " + nama + "\n";
        return info;
    }
}