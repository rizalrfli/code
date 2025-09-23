package prakt4;

public class Kursi {
    private String nomor;
    private Penumpang penumpang;
    
    // Constructor berparameter
    public Kursi(String nomor) {
        this.nomor = nomor;
    }
    
    // Setter dan Getter
    public void setNomor(String nomor) {
        this.nomor = nomor;
    }
    
    public String getNomor() {
        return nomor;
    }
    
    public void setPenumpang(Penumpang penumpang) {
        this.penumpang = penumpang;
    }
    
    public Penumpang getPenumpang() {
        return penumpang;
    }
    
    // Method info()
    public String info() {
        String info = "";
        info += "Nomor: " + nomor + "\n";
        if (this.penumpang != null) {
            info += "Penumpang: " + penumpang.info() + "\n";
        }
        return info;
    }
}