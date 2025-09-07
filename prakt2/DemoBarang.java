public class DemoBarang {
    public static void main(String[] args){
        Barang1 brg1 = new Barang1();
        brg1.kode = "B001";
        brg1.namaBarang = "Pensil";
        brg1.hargaDasar = 5000;
        brg1.diskon = 0.1f;
        brg1.tampilData();
    }
}
