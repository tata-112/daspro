package pertemuan5;

import java.util.Scanner;

public class tugasparkir29 {
    public static void main(String[] args) {
    Scanner bitha = new Scanner(System.in);

    int tarifAwal = 2000, tarifTambahan = 1000;
    int lamaParkir, tambahan, lebih2jam;
    int waktuAwal = 2;

   

    System.out.println("=== Parkir Motor ===");
    System.out.print("Berapa Jam Anda Parkir : ");
    lamaParkir = bitha.nextInt();

    if (lamaParkir < waktuAwal) {
        System.out.println("Total yang harus dibayar : "+ tarifAwal);
    } else {
        lebih2jam = tarifAwal+((lamaParkir-waktuAwal)*tarifTambahan);
        System.out.println("Total yang harus dibayar : "+lebih2jam);
    }
    }
}
