public class TestBayaran {
    public static void main(String[] args) {
        // Membuat objek Manajer dan Programmer
        Manajer man = new Manajer("Agus", 800, 50);
        Programmer prog = new Programmer("Budi", 600, 30);

        // Membuat objek Bayaran untuk menghitung gaji
        Bayaran hr = new Bayaran();

        // Menghitung dan menampilkan gaji untuk Manajer dan Programmer
        System.out.println("Bayaran manajer: " + hr.hitungBayaran(man));
        System.out.println("Bayaran programmer: " + hr.hitungBayaran(prog));
    }
}
