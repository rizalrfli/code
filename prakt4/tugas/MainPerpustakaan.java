package prakt4.tugas;
public class MainPerpustakaan {
    public static void main(String[] args) {
        Perpustakaan perpus = new Perpustakaan("Perpustakaan Politeknik Negeri Malang", "Jl. Soekarno Hatta No.9 Malang");
        Pengarang pengarang1 = new Pengarang("Pramoedya Ananta Toer", "Indonesia");
        Pengarang pengarang2 = new Pengarang("Andrea Hirata", "Indonesia");
        Pengarang pengarang3 = new Pengarang("J.K. Rowling", "Inggris");

        Buku buku1 = new Buku("978-979-22-0077-4", "Bumi Manusia", pengarang1, 1980);
        Buku buku2 = new Buku("978-979-22-0078-1", "Anak Semua Bangsa", pengarang1, 1981);
        Buku buku3 = new Buku("978-979-99-0322-4", "Laskar Pelangi", pengarang2, 2005);
        Buku buku4 = new Buku("978-0-7475-3269-9", "Harry Potter and the Philosopher's Stone", pengarang3, 1997);
        
        perpus.tambahBuku(buku1);
        perpus.tambahBuku(buku2);
        perpus.tambahBuku(buku3);
        perpus.tambahBuku(buku4);

        Anggota anggota1 = new Anggota("A001", "Budi Santoso", "Jl. Merdeka No.10 Malang", "081234567890");
        Anggota anggota2 = new Anggota("A002", "Siti Nurhaliza", "Jl. Veteran No.15 Malang", "085678901234");
        Anggota anggota3 = new Anggota("A003", "Andi Wijaya", "Jl. Sukarno Hatta No.25 Malang", "087890123456");

        perpus.tambahAnggota(anggota1);
        perpus.tambahAnggota(anggota2);
        perpus.tambahAnggota(anggota3);
      
        System.out.println(perpus.infoPerpustakaan());
        System.out.println(perpus.daftarBuku());
        System.out.println(perpus.daftarAnggota());
        
        System.out.println("\n=== SIMULASI PEMINJAMAN BUKU ===");
        perpus.pinjamBuku("A001", "978-979-99-0322-4");
        perpus.pinjamBuku("A002", "978-0-7475-3269-9"); 
        perpus.pinjamBuku("A003", "978-979-99-0322-4");
    
        System.out.println("\n=== STATUS BUKU SETELAH PEMINJAMAN ===");
        System.out.println(perpus.daftarBuku());

        System.out.println("\n=== SIMULASI PENGEMBALIAN BUKU ===");
        perpus.kembalikanBuku("978-979-99-0322-4");
    
        System.out.println("\n=== MEMINJAM SETELAH DIKEMBALIKAN ===");
        perpus.pinjamBuku("A003", "978-979-99-0322-4");
      
        System.out.println("\n=== STATUS AKHIR PERPUSTAKAAN ===");
        System.out.println(perpus.infoPerpustakaan());
    }
}