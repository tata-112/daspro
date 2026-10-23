package pertemuan9;
import java.util.Scanner;

public class tugas2_29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* PARAMETER UNIK
            P = 29
        • Tarif parkir mobil = 2500 + (29 mod 6) × 250 per jam = 3750 
        • Tarif parkir motor = 1500 + (29 mod 6) × 250 per jam = 2750 */

        int jenis=0,durasi,total=0,i=0;
        

        do{
            System.out.print("\nMasukkan Jenis kendaraan (1. Mobil, 2. Motor, 0. Keluar): ");
            jenis = sc.nextInt();

            if (jenis ==0 ) {
                System.out.println("Silahkan input ulang!");
                continue;
            }

            if (jenis == 1 || jenis ==2) {
                System.out.print("Masukkan Durasi: ");
                durasi= sc.nextInt();
                if (jenis == 1) {
                    total += durasi*3750;
                } else if(jenis ==2) {
                    total += durasi*2750;
                }
            } 
            System.out.println("Total pembayaran parkir : Rp"+total);
        } while(jenis != 0);
    }
}
