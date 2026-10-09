package pertemuan6;

import java.util.Scanner;

public class nestedUjianSkripsi29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pesan="";
        
        /*Syarat minimal log bimbingan Pembimbing 1 = 6 +(29 % 5) = 10 */ 
        /*Syarat minimal log bimbingan Pembimbing 2 = 3 +(29 % 3) = 5 */

        System.out.print("Apakah mahasiswa sudah  bebas kompen? ( Ya/Tidak): ");
        String bebasKompen = sc.nextLine();

        System.out.print("Masukkan jumlah log bimbingan Pembimbing 1 : ");
        int bimbingan1 = sc.nextInt();
        System.out.print("Masukkan jumlah log bimbingan Pembimbing 2 :");
        int bimbingan2 = sc.nextInt();

        // nested IF 
        if (bebasKompen.equalsIgnoreCase("Ya")) {
          if (bimbingan1 >=10 && bimbingan2 >= 5) {
            pesan = "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi";
            }else if (bimbingan1 <10 && bimbingan2 <5) {
            pesan = "gagal! Log bimbingan P1 kurang dari 10 kali dan P2 kurang dari 5 kali";
            }else if (bimbingan1 <10) {
            pesan = "Gagal! Log bimbingan 1 kurang dari 10 kali";
            }else {
            pesan = "Gagal! Log bimbingan 2 belum mencapai 5 kali";
            }
        }else{
            pesan = "Gagal! Mahasiswa masih memiliki tanggungan kompen";       
        }
        System.out.println(pesan);
    }
    
}