package pertemuan5;

import java.util.Scanner;

public class tugas1Pemilihan29{
    public static void main(String[] args) {
        Scanner bitha = new Scanner(System.in);

        // String ukt;
        boolean uktLunas = true;
    System.out.println("---Cetak KRS SIAKAD---");
    System.out.print("Apakah UKT Sudah Lunas (true/false) ? ");
    String pesan = bitha.nextLine();
    
    //  Ternary Operator
    String ukt = (uktLunas) ? "Pembayaran tervertivikasi, Silahkan cetak KRS dan minta tanda tangan DPA": "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu";
    System.out.println(ukt);
  
    
    }
}
