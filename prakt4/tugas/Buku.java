package prakt4.tugas;

public class Buku {
    private String isbn;
    private String judul;
    private Pengarang pengarang;
    private int tahunTerbit;
    private boolean tersedia;
    public Buku(String isbn, String judul, Pengarang pengarang, int tahunTerbit) {
        this.isbn = isbn;
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
        this.tersedia = true;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }  
    public String getIsbn() {
        return isbn;
    }
    public void setJudul(String judul) {
        this.judul = judul;
    }
    public String getJudul() {
        return judul;
    }
    public void setPengarang(Pengarang pengarang) {
        this.pengarang = pengarang;
    }
    public Pengarang getPengarang() {
        return pengarang;
    }
    
    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }
    
    public int getTahunTerbit() {
        return tahunTerbit;
    }
    
    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }
    
    public boolean isTersedia() {
        return tersedia;
    }
    public String info() {
        String info = "";
        info += "ISBN: " + isbn + "\n";
        info += "Judul: " + judul + "\n";
        info += pengarang.info();
        info += "Tahun Terbit: " + tahunTerbit + "\n";
        info += "Status: " + (tersedia ? "Tersedia" : "Dipinjam") + "\n";
        return info;
    }
}
