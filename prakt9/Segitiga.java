package prakt9;

public class Segitiga {
    int sudut;

    // Method 1: Menghitung sudut jika hanya diketahui satu sudut
    int totalSudut(int sudutA) {
        sudut = 180 - sudutA;
        return sudut;
    }

    // Method 2: Overloading - menghitung sudut jika diketahui dua sudut
    int totalSudut(int sudutA, int sudutB) {
        sudut = 180 - (sudutA + sudutB);
        return sudut;
    }

    // Method 3: Menghitung keliling dengan tiga sisi
    int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

    // Method 4: Overloading - menghitung sisi miring segitiga siku-siku
    double keliling(int sisiA, int sisiB) {
        return Math.sqrt((sisiA * sisiA) + (sisiB * sisiB));
    }

    // Main method untuk uji coba
    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();

        System.out.println("Total sudut (1 sudut): " + segitiga.totalSudut(60));
        System.out.println("Total sudut (2 sudut): " + segitiga.totalSudut(60, 50));

        System.out.println("Keliling 3 sisi: " + segitiga.keliling(10, 12, 14));
        System.out.println("Sisi miring segitiga siku-siku: " + segitiga.keliling(3, 4));
    }
}
