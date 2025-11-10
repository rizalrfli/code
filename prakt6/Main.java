package prakt6;
public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Milo", 2, "Oranye");
        kucing.info();
        System.out.println(); 
        System.out.println("Akses umur dari Main: " + kucing.umur); 
        System.out.println();
        Anjing anjing = new Anjing("Buddy", 5, "Kasar");
        System.out.println("Informasi Anjing:");
        anjing.info(); 
        System.out.println("Jenis Bulu: " + anjing.getJenisBulu());
    }
}