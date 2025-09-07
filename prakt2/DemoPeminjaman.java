public class DemoPeminjaman {
    public static void main(String[] args) {
        Peminjaman pmj1 = new Peminjaman();
        pmj1.id = 1;
        pmj1.namaMember = "Afrizal";
        pmj1.namaGame = "Point Blank";
        pmj1.harga = 5000;
        pmj1.lamaSewa = 3;
        pmj1.tampilDataPeminjaman();
    }
}
