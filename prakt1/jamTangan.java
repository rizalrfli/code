public class jamTangan {
    public String merk, baterai, model;
    public boolean lampu;

    public jamTangan(String merk, String baterai, String model, boolean lampu) {
        this.merk = merk;
        this.baterai = baterai;
        this.model = model;
        this.lampu = lampu;
    }
    public void tunjukkanWaktu() {
        System.out.println("Menunjukkan waktu 08:00");
    }
    public void aturAlarm(){
        System.out.println("Alarm diatur.");
    }

    public void menyalakanLampu() {
        if (lampu) {
            System.out.println("Lampu sudah menyala.");
        } else {
            System.out.println("Lampu mati.");
        }
    }

    public void cetakInfo() {
        System.out.println("Merk: " + merk);
        System.out.println("Baterai: " + baterai);
        System.out.println("Model: " + model);
        System.out.println("Lampu: " + (lampu ? "Menyala" : "Mati"));
    }
}
