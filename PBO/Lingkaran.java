package PBO;

public class Lingkaran{
    private int radius;
    private static final double pi = 3.14;

    public Lingkaran(int radius){
        this.radius = radius;
    }
        public int getRadius(){
        return radius;
    }
    public int keliling(){
        return 2*radius*(int)pi;
    }
}