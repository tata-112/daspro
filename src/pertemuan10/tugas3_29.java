package pertemuan10;

import java.util.Scanner;

public class tugas3_29 {
    /*P=29
    jmltoko = (2+(29%3)) = 4 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jmlToko=0;
        do{
        System.out.print("Toko : ");
        jmlToko = sc.nextInt();
        }while(jmlToko<1);
        
        int totalSemua=0;
        int barangTerbanyak=-1;
        int tokoTerbanyak=1;
        for (int i = 0; i < jmlToko; i++) {
    
            int jmlPelanggan=0;
            do {
            System.out.print("\nPelanggan toko ke "+(i+1)+": ");
            jmlPelanggan=sc.nextInt();
            } while (jmlPelanggan<0);

            int totalBarang=0;
            
            for (int j = 0; j < jmlPelanggan; j++) {
               int jmlBarang=0;
               do {
                System.out.print("Jumlah barang pelanggan ke "+(j+1)+": ");
                jmlBarang=sc.nextInt();
               } while (jmlBarang<0);
              totalBarang +=jmlBarang;
                
            }
            System.out.println("Toko "+(i+1)+" - pelanggan: "+jmlPelanggan+", total barang: "+totalBarang);
            totalSemua += totalBarang;
            
            if (totalBarang>barangTerbanyak) {
                barangTerbanyak = totalBarang;
                tokoTerbanyak=(i+1);
            }

        }
        System.out.println("\nTotal barang seluruh toko :"+totalSemua);
        System.out.println("Toko dengan barang terbanyak :"+tokoTerbanyak);
         
    }
}
