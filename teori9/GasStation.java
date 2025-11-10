public class GasStation {
    public void isiBahanBakar (MobilMewah mw){
        System.out.println("Mobil mewah telah diisi pertamax...");
    }
    public void isiBahanBakar (MobilKuno mk){
        System.out.println("Mobil kuno telah diisi pertalite...");
    }
    public void isiBahanBakar(String jenisMobil, int bayar) {
        if (jenisMobil.equalsIgnoreCase("alphard")) {
            int harga = 10000;
            int liter = bayar / harga;
            System.out.println( " Mobil mewah diisi pertamax sebanyak " + liter + " liter");
        } else {
            int harga = 5000;
            int liter = bayar / harga;
            System.out.println(" Mobil kuno diisi pertalite sebanyak " + liter + " liter");
        }
    }
}
