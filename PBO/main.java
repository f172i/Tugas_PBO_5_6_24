package PBO;

import java.util.Scanner;

public class main{
    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        //Tampilan Persegi
        System.out.println("Masukan sisi :");
        int sisi = scan.nextInt();
        Persegi persegi = new Persegi(sisi);
        System.out.println("Keliling Persegi : " + persegi.keliling());
        
        //Tampilan Persegi Panjang
        System.out.println("Masukan Panjang :");
        int panjang = scan.nextInt();
        System.out.println("Masukan Lebar :");
        int lebar = scan.nextInt();
        PersegiPanjang persegipanjang = new PersegiPanjang(panjang, lebar);
        System.out.println("Keliling Persegi : " + persegipanjang.keliling());  

        //Tampilan Segitiga
        System.out.println("Masukan sisi :");
        sisi = scan.nextInt();
        Segitiga segitiga = new Segitiga(sisi);
        System.out.println("Keliling Segitiga : " + segitiga.keliling()); 

        //Tampilan Lingkaran
        System.out.println("Masukan Radius :");
        int radius = scan.nextInt();
        Lingkaran lingkaran = new Lingkaran(radius);
        System.out.println("Keliling Persegi : " + lingkaran.keliling());
    }
}