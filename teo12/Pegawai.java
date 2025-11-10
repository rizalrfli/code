public abstract class Pegawai {
    private String nama;
    private int gajiPokok;

    // Konstruktor untuk Pegawai
    public Pegawai(String nama, int gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    public String getNama() {
        return nama;  // Mengembalikan nama
    }

    public int getGaji() {
        return gajiPokok;  // Mengembalikan gaji pokok
    }
}
