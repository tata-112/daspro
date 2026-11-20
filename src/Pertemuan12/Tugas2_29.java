package Pertemuan12;

import java.util.Scanner;
/*p=29
jml pemesanan =  (2 + (29 mod 4))=3
menu ke = (29 mod 7)= 1*/
public class Tugas2_29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String []menu={"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng","Teh Tarik","Cappucino","Chocolate Ice"};
        int []harga={15000, 13000, 10000, 12000, 8000, 18000, 20000};

        System.out.println("=== Warung Sederhana ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i+1)+". "+menu[i]);
        }
        System.out.println("------------------");
        System.out.print("Nomor makanan / minuman yang ingin dipesan : ");
        int input = sc.nextInt(); 
        if(input <= menu.length){
        System.out.println("Menu tersedia");   
        
        System.out.print("Jumlah yang pesanan : ");
        int jml = sc.nextInt();       
        int total = jml*harga[input-1];
        
        System.out.println("\n=== Pemesanan ===");
        System.out.println("Harga untuk menu " +menu[input-1]+" \t: "+harga[input-1]);
        System.out.println("Jumlah pesanan\t: "+jml);
        System.out.println("Total biaya\t: " +total);
        }else{
            System.out.println("Menu tidak tersedia");
        }
        
        
    }
}
