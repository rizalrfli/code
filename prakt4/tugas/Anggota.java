package prakt4.tugas;

public class Anggota {
    private String id;
    private String nama;
    private String alamat;
    private String telepon;
    public Anggota(String id, String nama, String alamat, String telepon) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public String getAlamat() {
        return alamat;
    }
    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }
    
    public String getTelepon() {
        return telepon;
    }
    public String info() {
        String info = "";
        info += "ID Anggota: " + id + "\n";
        info += "Nama: " + nama + "\n";
        info += "Alamat: " + alamat + "\n";
        info += "Telepon: " + telepon + "\n";
        return info;
    }
}