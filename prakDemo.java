public class prakDemo {
    public static void main(String[] args) {
        gunting gunting1 = new gunting(15, "Plastik", "Faber-Castell");
        tas tas1 = new tas("Eiger", "Hitam", 30);
        tasGunung tasGunung1 = new tasGunung("Bogabo", "Hitam", 30, true, 5);
        sepatuGunung sepatuGunung1 = new sepatuGunung("Adidas", "Hitam", "Kanvas", 42, 500, true);
        sepatu sepatu1 = new sepatu("Nike", "Putih", "Kulit", 40);
        jamTangan jamtangan1 = new jamTangan("Casio", "Hitam", "Karet", true);

        gunting1.memotong();
        gunting1.menutup();
        gunting1.cetakInfo();
        System.out.println();

        tas1.isiBarang("Buku");
        tas1.kosongkan( "Debu");
        tas1.infoTas();
        System.out.println();

        tasGunung1.cekKantong();
        tasGunung1.pasangRainCover();
        tasGunung1.isiBarang("Peta");
        tasGunung1.kosongkan("Air");
        tasGunung1.cetakInfo();
        System.out.println();

        sepatu1.pakai();
        sepatu1.lepas();
        sepatu1.cetakInfo();
        System.out.println();

        sepatuGunung1.pakai();
        sepatuGunung1.lepas();
        sepatuGunung1.mendaki();
        sepatuGunung1.bersihkan();
        sepatuGunung1.infoSepatu();
        System.out.println();
        
        jamtangan1.cetakInfo();
        jamtangan1.aturAlarm();
        jamtangan1.menyalakanLampu();
    }
}
