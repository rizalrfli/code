package prakt4.tugas;
public class Perpustakaan {
    private String nama;
    private String alamat;
    private Buku[] arrayBuku;
    private Anggota[] arrayAnggota;
    private int jumlahBuku;
    private int jumlahAnggota;
    
    public Perpustakaan(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
        this.arrayBuku = new Buku[100];
        this.arrayAnggota = new Anggota[50]; 
        this.jumlahBuku = 0;
        this.jumlahAnggota = 0;
    }

    public void tambahBuku(Buku buku) {
        if (jumlahBuku < arrayBuku.length) {
            arrayBuku[jumlahBuku] = buku;
            jumlahBuku++;
            System.out.println("Buku berhasil ditambahkan: " + buku.getJudul());
        } else {
            System.out.println("Perpustakaan penuh, tidak bisa menambah buku baru!");
        }
    }
    
    public void tambahAnggota(Anggota anggota) {
        if (jumlahAnggota < arrayAnggota.length) {
            arrayAnggota[jumlahAnggota] = anggota;
            jumlahAnggota++;
            System.out.println("Anggota berhasil didaftarkan: " + anggota.getNama());
        } else {
            System.out.println("Kapasitas anggota penuh!");
        }
    }

    public Buku cariBuku(String isbn) {
        for (int i = 0; i < jumlahBuku; i++) {
            if (arrayBuku[i].getIsbn().equals(isbn)) {
                return arrayBuku[i];
            }
        }
        return null;
    }
    
    public Anggota cariAnggota(String id) {
        for (int i = 0; i < jumlahAnggota; i++) {
            if (arrayAnggota[i].getId().equals(id)) {
                return arrayAnggota[i];
            }
        }
        return null;
    }
   
    public boolean pinjamBuku(String idAnggota, String isbn) {
        Anggota anggota = cariAnggota(idAnggota);
        Buku buku = cariBuku(isbn);
        if (anggota == null) {
            System.out.println("Anggota tidak ditemukan!");
            return false;
        }
        if (buku == null) {
            System.out.println("Buku tidak ditemukan!");
            return false;
        }
        if (!buku.isTersedia()) {
            System.out.println("Buku sedang dipinjam!");
            return false;
        }
        buku.setTersedia(false);
        System.out.println("Buku '" + buku.getJudul() + "' berhasil dipinjam oleh " + anggota.getNama());
        return true;
    }
    
    public boolean kembalikanBuku(String isbn) {
        Buku buku = cariBuku(isbn);
        
        if (buku == null) {
            System.out.println("Buku tidak ditemukan!");
            return false;
        }
        
        if (buku.isTersedia()) {
            System.out.println("Buku tidak sedang dipinjam!");
            return false;
        }
        
        buku.setTersedia(true);
        System.out.println("Buku '" + buku.getJudul() + "' berhasil dikembalikan");
        return true;
    }

    public String infoPerpustakaan() {
        String info = "";
        info += "=== INFORMASI PERPUSTAKAAN ===\n";
        info += "Nama: " + nama + "\n";
        info += "Alamat: " + alamat + "\n";
        info += "Jumlah Buku: " + jumlahBuku + "\n";
        info += "Jumlah Anggota: " + jumlahAnggota + "\n";
        return info;
    }
        public String daftarBuku() {
        String info = "\n=== DAFTAR BUKU ===\n";
        for (int i = 0; i < jumlahBuku; i++) {
            info += "--- Buku " + (i + 1) + " ---\n";
            info += arrayBuku[i].info() + "\n";
        }
        return info;
    }
    
    public String daftarAnggota() {
        String info = "\n=== DAFTAR ANGGOTA ===\n";
        for (int i = 0; i < jumlahAnggota; i++) {
            info += "--- Anggota " + (i + 1) + " ---\n";
            info += arrayAnggota[i].info() + "\n";
        }
        return info;
    }
}
