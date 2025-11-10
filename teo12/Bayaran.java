public class Bayaran {
    
    // Method untuk menghitung gaji berdasarkan tipe pegawai
    public int hitungBayaran(Pegawai pg) {
        int uang = pg.getGaji();  // Ambil gaji pokok terlebih dahulu

        // Cek apakah pegawai adalah instance dari Manajer
        if (pg instanceof Manajer) {
            uang += ((Manajer) pg).getTunjangan();  // Tambahkan tunjangan untuk Manajer
        } else if (pg instanceof Programmer) {
            uang += ((Programmer) pg).getBonus();  // Tambahkan bonus untuk Programmer
        }

        return uang;  // Kembalikan total gaji
    }
}
