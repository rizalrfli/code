package prakt4.tugas;

public class Pengarang {
    private String nama;
    private String negara;
    
    public Pengarang(String nama, String negara) {
        this.nama = nama;
        this.negara = negara;
    }
    public void setNama(String nama) {
        this.nama = nama;
    } 
    public String getNama() {
        return nama;
    }
    public void setNegara(String negara) {
        this.negara = negara;
    }
    public String getNegara() {
        return negara;
    }
    public String info() {
        String info = "";
        info += "Nama Pengarang: " + nama + "\n";
        info += "Negara: " + negara + "\n";
        return info;
    }
}