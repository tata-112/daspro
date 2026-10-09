package pertemuan5;

import java.util.Scanner;

public class pemilihanIf29 {
    public static void main(String[] args) {
        Scanner bitha = new Scanner(System.in);

        boolean uktLunas = true;
    System.out.println("---Cetak KRS SIAKAD---");
    System.out.print("Apakah UKT Sudah Lunas (true/false) ? ");
    uktLunas= bitha.nextBoolean();
    
    if(uktLunas){
        System.out.println("Pembayaran UKT tervertivikasi");
        System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
    } else{
        System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu");
    } 

    }
}
