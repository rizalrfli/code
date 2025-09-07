public class Persegi {
    int sisi;
    public void tampilSisi() {
        System.out.println("Sisi Persegi: " + sisi + " cm");{
        }
    }
    public int luas(){
        return sisi * sisi;
    }
    public int keliling(){
        return 4 * sisi;
    }
    public void getSisi(int ss){
        sisi = ss;
    }
}
