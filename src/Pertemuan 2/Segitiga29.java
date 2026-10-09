import java.util.Scanner;

public class Segitiga29{
    public static void main(String[] args){
    Scanner bitha = new Scanner(System.in);
    
        //input
        int alas, tinggi;
        float luas;

        System.out.print("Masukkan alas: ");
        alas = bitha.nextInt();
        System.out.print("Masukkan  tinggi: ");
        tinggi = bitha.nextInt();

        luas = alas * tinggi /2;
        System.out.println("Luas segitiga: " + luas);
        
        
    }
}