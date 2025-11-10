public class Manajer extends Pegawai {
    private int tunjangan;  // Tunjangan untuk Manajer

    // Konstruktor untuk Manajer
    public Manajer(String nama, int gajiPokok, int tunjangan) {
        super(nama, gajiPokok);  // Panggil konstruktor induk (Pegawai)
        this.tunjangan = tunjangan;  // Set tunjangan
    }

    public int getTunjangan() {
        return tunjangan;  // Mengembalikan tunjangan
    }

    @Override
    public int getGaji() {
        return super.getGaji();  // Mengembalikan gaji pokok dari kelas induk
    }
}
