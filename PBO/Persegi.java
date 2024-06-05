package PBO;

public class Persegi{
    private int sisi;
    public Persegi(int sisi){
        this.sisi = sisi;
    }
    public int getSisi(){
        return sisi;
    }
    public int keliling(){
        return sisi + sisi + sisi + sisi;
    }
}