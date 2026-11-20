package Pertemuan12;

import java.util.Scanner;
/*P=29
Percobaan 2 = 60 + (29 mod 41)= 89  */
public class ArrayNilai29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int []nilaiAkhir = new int[10];
        int jmlLulus=0;
        int jmlTidakLulus=0;
        for (int i = 0; i < nilaiAkhir.length; i++) {
            
            System.out.print("Masukkan nilai mahasiswa ke "+(i+1)+": ");
            nilaiAkhir[i] = sc.nextInt();

            
        }
        String status="";
        for (int i = 0; i < nilaiAkhir.length; i++) {
            // String status=(nilaiAkhir[i] > 70) ? "Lulus" : "Tidak lulus";
            if (nilaiAkhir[i] > 70) {
                status = "LULUS";
                jmlLulus++;
            }else{
                status = "TIDAK LULUS";
                jmlTidakLulus++;
            }
            System.out.println("Mahasiswa ke-"+(i+1)+": "+nilaiAkhir[i]+"( "+status+" )");
        }
        System.out.println("jumlah Mahasiswa lulus : "+jmlLulus);
        System.out.println("jumlah Mahasiswa tidak lulus : "+jmlTidakLulus);

        // for (int i : nilaiAkhir) {
        //     System.out.print("Masukkan nilai mahasiswa ke "+(i+1)+": ");
        //     nilaiAkhir[i] = sc.nextInt();
        // }
        // String status="";
        // for (int j : nilaiAkhir) {
        //     // String status=(nilaiAkhir[i] > 70) ? "Lulus" : "Tidak lulus";
        //     if (nilaiAkhir[j] > 70) {
        //         status = "LULUS";
        //     }
        //     System.out.println("Mahasiswa ke-"+(j+1)+": "+nilaiAkhir[j]+"( "+status+" )");
        // }
    }
}
