package kuis;

import java.util.Scanner;

public class KasirMinimarket29 {
    public static void main(String[] args) {
        Scanner bitha = new Scanner(System.in);
         
        int bayar,hargaAwal, kembalian, sisaPecahan,sisaBknPecahan;
        double persen;
        int lembaran = 5000;
        int pecahan=1000, anPecahan=2000;
        
        
        System.out.print("Berapakah harga awal : ");
        hargaAwal=bitha.nextInt();

       
        System.out.print("Berapakah harga bayar : ");
        bayar=bitha.nextInt();
        kembalian= bayar-hargaAwal;
        
        System.out.println("Kembalian : "+kembalian); 


        sisaPecahan= (kembalian/lembaran);
        System.out.println("Lembar 5000 : "+sisaPecahan);

    

        sisaBknPecahan=kembalian%pecahan;
        sisaBknPecahan%= anPecahan;

        System.out.println("Sisa di bawah 5000 :"+sisaBknPecahan);

        persen = (kembalian/bayar)*100;
        System.out.println("Persen kembalian : "+persen + "%");

        // Berapakah harga awal : 20000
        // Berapakah harga bayar : 25000
        // Kembalian : 5000
        // Sisa di bawah 5000 :0
        // Persen kembalian : 0.0%

        bitha.close(); 

    }
}
