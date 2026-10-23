package pertemuan9;
import java.util.Scanner;

public class siakadFor29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*PARAMETER UNIK
        P = 29
        • Jumlah mahasiswa (batas perulangan FOR) = 8 + (29 mod 5) = 12  
        • Batas kelulusan pada Pertanyaan no. 4 (modifikasi kode) = 55 + (29 mod 11) = 63 */

        double nilai, tertinggi = 0, terendah = 100;
        int batasKelulusan = 63, jmlLulus=0, jmlTidakLulus=0;

        for (int i = 0; i < 12; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            } 
            if (nilai < terendah) {
                terendah = nilai;
            }
            
            if (nilai > batasKelulusan) {
                jmlLulus++;
            } else {
                jmlTidakLulus++;
            }

            
        }
        System.out.println("Nilai tertinggi: "+tertinggi);
        System.out.println("Nilai terendah: "+terendah);
        System.out.println("Jumlah Mahasiswa Lulus: "+jmlLulus);
        System.out.println("Jumlah Mahasiwa Tidak lulus: "+jmlTidakLulus);

        
    }
}
