package PBO;

public class Segitiga{
    private int sisi;

    public Segitiga(int sisi){
        this.sisi = sisi;
    }
        public int getSisi(){
        return sisi;
    }
    public int keliling(){
        return sisi + sisi + sisi;
    }
}