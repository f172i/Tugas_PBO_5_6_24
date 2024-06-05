package PBO;

public class PersegiPanjang{
    private int panjang;
    private int lebar;
    public PersegiPanjang(int panjang,int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    public int getPanjang(){
        return lebar;
    }
        public int getLebar(){
        return lebar;
    }
    public int keliling(){
        return panjang + lebar + panjang + lebar;
    }
}