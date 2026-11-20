package Pertemuan12;

import java.util.Scanner;

public class SearchNilai29 {
    /*P=29
    Percobaan 4 (key) = 50 + (29 mod 50) = 79 
    Percobaan 4 Bagian B = 20 + (29 mod 60) = 49 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jumlah elemen nilai : ");
        int []nilai = new int[sc.nextInt()];
        int key = 0;
        boolean ditemukan = false;
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Nilai : ");
            nilai[i] = sc.nextInt();
        }

        System.out.print("Key : ");
        key = sc.nextInt();
        
        System.out.println();

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key ) {
                System.out.println("Nilai "+key+" ditemukan pada indeks ke-"+i);
                ditemukan=true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Nilai "+key+" yang dicari tidak ditemukan");
        }
    }
}
