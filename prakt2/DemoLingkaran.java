public class DemoLingkaran {
    public static void main(String[] args) {
        Lingkaran l = new Lingkaran();
        l.phi = 3.14;
        l.r = 10;

        System.out.println("Nilai phi : " + l.phi);
        System.out.println("Jari-jari : " + l.r);
        System.out.println("Luas Lingkaran : " + l.hitungLuas());
        System.out.println("Keliling Lingkaran : " + l.hitungKeliling());
    }
    
}
