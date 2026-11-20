package Pertemuan12;

import java.util.Scanner;
/*P=29
jml = (5 + (29 mod 11)) = 12
input nilai = (29 mod 100) = 29*/
public class Tugas1_29 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Jumlah mahasiswa : ");
       int []mahasiswa =new int[sc.nextInt()];

       int total=0;
       double rata=0;
       
       String status="";

       for (int i = 0; i < mahasiswa.length; i++) {
        System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+": ");
        mahasiswa[i] = sc.nextInt();
       }    
       int tertinggi = mahasiswa[0];
       int terendah = mahasiswa[0];
       System.out.println("\n");
       for (int i = 0; i < mahasiswa.length; i++) {
        total += mahasiswa[i];
        rata = (double)total/mahasiswa.length;

        if (mahasiswa[i] > 70) {
            status = "LULUS";
        }else{
            status = "TIDAK LULUS";
        }
        if(mahasiswa[i] > tertinggi){
            tertinggi = mahasiswa[i];
        }
        if(mahasiswa[i] < terendah){
            terendah = mahasiswa[i];
        }
        System.out.println("Mahasiswa ke-"+(i+1)+": "+mahasiswa[i]+"( "+status+" )");
       }
       System.out.println("Rata-rata nilai mahasiswa\t: "+rata);
       System.out.println("Nilai tertinggi\t: "+tertinggi);
       System.out.println("Nilai terendah\t: "+terendah);
        
    }
}
