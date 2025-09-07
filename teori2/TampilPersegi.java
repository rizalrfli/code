public class TampilPersegi {
    public static void main(String[] args) {
        Persegi p = new Persegi();
        p.getSisi(5);
        p.tampilSisi();
        System.out.println("Luas Persegi: " + p.luas());
        System.out.println("Keliling Persegi: " + p.keliling());
    }
}
