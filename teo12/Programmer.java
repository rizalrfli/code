public class Programmer extends Pegawai {
    private int bonus;  // Bonus untuk Programmer

    // Konstruktor untuk Programmer
    public Programmer(String nama, int gajiPokok, int bonus) {
        super(nama, gajiPokok);  // Panggil konstruktor induk (Pegawai)
        this.bonus = bonus;  // Set bonus
    }

    public int getBonus() {
        return bonus;  // Mengembalikan bonus
    }

    @Override
    public int getGaji() {
        return super.getGaji();  // Mengembalikan gaji pokok dari kelas induk
    }
}
