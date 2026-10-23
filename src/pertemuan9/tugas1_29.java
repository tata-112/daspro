package pertemuan9;
import java.util.Scanner;

public class tugas1_29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    /*PARAMETER UNIK
    P = 29
    • Harga tiket = 40000 + (29 mod 6) × 2000 = Rp50.000 
    • Syarat diskon pertama = lebih dari (3 + (29 mod 3)) tiket = 5, dengan diskon (8 + (29 mod 5))% = 12%
    • Syarat diskon kedua = lebih dari (8 + (29 mod 4)) tiket = 9, dengan diskon (15 + (29 mod 4))% = 16% */

    int hargaTiket = 50000;
    double diskon1 = 0.12, diskon2 = 0.16,totalPenjualan =0, penjualanTiket;
    int jmlBeliTiket, totalTiket=0;

    do {
        System.out.print("\nJumlah pembelian tiket\t: ");
        jmlBeliTiket = sc.nextInt();
        if(jmlBeliTiket<0){
            System.out.println("Tidak valid. Silahakan input ulang!");
            continue;
        }

        penjualanTiket = hargaTiket*jmlBeliTiket;
        if (jmlBeliTiket > 5 && jmlBeliTiket <= 9) {
            penjualanTiket -= (penjualanTiket*diskon1);
        } else if(jmlBeliTiket > 9) {
            penjualanTiket -= (penjualanTiket*diskon2);
        }

        totalPenjualan += penjualanTiket;
        totalTiket += jmlBeliTiket;
        System.out.println("Total tiket 1 hari\t: "+ totalTiket);
        System.out.println("Total penjualan 1 hari\t: Rp "+ totalPenjualan);

    } while (true);

   
    
    }
}
