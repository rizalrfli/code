package prakt3;

public class Anggota {
    private String nama;
    private String noKTP;
    private int limitPinjam;
    private int jumlahPinjam;
    public Anggota(String noKTP, String nama, int limitPinjam) {
        this.nama = nama;
        this.noKTP = noKTP;
        this.limitPinjam = limitPinjam;
    }
    public String getNama() {
        return nama;
    }
    public String getNoKTP() {
        return noKTP;
    }
    public int getLimitPinjam() {
        return limitPinjam;
    }
    public int getJumlahPinjam() {
        return jumlahPinjam;
    }
    public void pinjam(int uang) {
        if (jumlahPinjam + uang > limitPinjam) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit!");
        } else {
            jumlahPinjam += uang;
        }
    }
      public void angsur(int uang) {
        int minimal = (int)(0.1 * jumlahPinjam); 
        if (uang < minimal) {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
        } else {
            jumlahPinjam -= uang;
        }
    }
}
