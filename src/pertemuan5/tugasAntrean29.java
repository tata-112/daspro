package pertemuan5;

import java.util.Scanner;

public class tugasAntrean29 {
    public static void main(String[] args) {
    Scanner bitha = new Scanner(System.in);

    System.out.println("=== Layanan Antrean Digital ===");
   
    System.out.print("Pilih Kode (1 - 4): ");
    int layananDipilih = bitha.nextInt();

    switch (layananDipilih) {
        case 1:
            System.out.println("Layanan Legalisir Ijazah ");
            System.out.println("Berada di loket A");
            break;
        case 2:
            System.out.println("Layanan Surat Keterangan Aktif Kuliah");
            System.out.println("Berada di loket B");
            break;
        case 3:
            System.out.println("Layanan Pembayaran UKT");
            System.out.println("Berada di loket C");
            break;
        case 4:
            System.out.println("Layanan Pengajuan Cuti Akademik");
            System.out.println("Berada di loket D");
            break;
        default:
            System.out.println("Layanan Tidak Tersedia");
            break;
    }
    }
}
