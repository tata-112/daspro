package pertemuan9;
import java.util.Scanner;

public class kafeDoWhile29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*PARAMETER UNIK
          P = 29
        • hargaKopi = 10000 + (29 mod 5) × 1000 = 14000 
        • hargaTeh = 5000 + (29 mod 4) × 1000 = 6000 
        • hargaRoti = 15000 + (29 mod 6) × 1000 = 20000 */

        int hargaKopi = 14000;
        int hargaTeh = 6000;
        int hargaRoti = 20000;
        int kopi,teh,roti, totalHarga;
        String namaPelanggan;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }
            System.out.print("Jumlah kopi: ");
            kopi = sc.nextInt();
            System.out.print("Jumlah teh: ");
            teh = sc.nextInt();
            System.out.print("Jumlah roti: ");
            roti = sc.nextInt();
            totalHarga = (kopi*hargaKopi)+(teh*hargaTeh)+(roti*hargaRoti);
            System.out.println("Total yang harus dibayar: Rp "+totalHarga);
            sc.nextLine();

        } while (true);
        System.out.println("Semua transaksi selesai");
    }
}
