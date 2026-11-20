package Pertemuan12;

import java.util.Scanner;
/*P=29
Percobaan 3 = 30 + (29 mod 71) = 59 */
public class ArrayRataNilai29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int []nilaiMhs = new int[10];
        int total=0;
        double rata2=0;
        int lulus=0;
        int tkdLulus=0;
         
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+": ");
            nilaiMhs[i]=sc.nextInt();
            total += nilaiMhs[i];
        }
        rata2=total/nilaiMhs.length;
        System.out.println("Total nilai : "+total);
        System.out.println("Rata-rata : "+rata2);

        String status;
        if (rata2 <70) {
            status = "PERLU PENDAMPINGAN";
        }else if (rata2>70 && rata2<85) {
            status = "BAIK";
        }else{
            status = "SANGAT BAIK";
        }

        int tertinggi=nilaiMhs[0];
        int terendah=nilaiMhs[0];
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > tertinggi) {
                tertinggi=nilaiMhs[i];
            }
            if (nilaiMhs[i]<terendah) {
                terendah=nilaiMhs[i];
            }
        // if (nilaiMhs[i] > 70) {
        //     lulus++;
        // }else{
        //     tkdLulus++;
        // }
            }
            System.out.println("Nilai tertinggi : "+tertinggi);
            System.out.println("Nilai terendah : "+terendah);
            System.out.println("Predikat kelas : "+status);
            // System.out.println("Jumlah lulus : "+lulus);
            // System.out.println("Jumlah tidak lulus : "+tkdLulus);
        }
}
