package prakt6;
public class Hewan {
    private String nama;      // Hanya bisa diakses di dalam kelas Hewan
    protected int umur;       // Bisa diakses di dalam kelas Hewan dan subclass-nya

    public Hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public void berjalan() {
        // Atribut 'nama' bisa diakses di sini karena masih di dalam kelas Hewan
        System.out.println(nama + " berjalan...");
    }

    public void info() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
    }
}
                                                                      