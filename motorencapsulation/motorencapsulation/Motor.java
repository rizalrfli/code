package motorencapsulation;

public class Motor {
    private int kecepatan = 0;
    private boolean kontakOn = false;

    public void nyalakanMesin() {
        kontakOn = true;
    }

    public void matikanMesin() {
        kontakOn = false;
        kecepatan = 0;
    }

    public void tambahKecepatan() {
        if (kontakOn) {
            if (kecepatan + 5 <= 100) {
                kecepatan += 5;
            } else {
                kecepatan = 100;
                System.out.println("Kecepatan sudah maksimal (100)!");
            }
        } else {
            System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off!");
        }
    }

    public void kurangiKecepatan() {
        if (kontakOn) {
            kecepatan -= 5;
            if (kecepatan < 0) kecepatan = 0; 
        } else {
            System.out.println("Kecepatan tidak bisa berkurang karena Mesin Off!\n");
        }
    }

    public void printStatus() {
        if (kontakOn) {
            System.out.println("Kontak On");
        } else {
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan " + kecepatan + "\n");
    }
}
