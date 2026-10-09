package pertemuan6;

import java.util.Scanner;

public class tugas2SeleksiAsisten29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean mahasiswaAktif;
        boolean sanksiAkademik;
        boolean sertifikatKompetensi;
        int nilaiDaspro;
        int nilaiWawancara;

        System.out.print("Apakah mahasiwa berstatus aktif? (true/false) : ");
        mahasiswaAktif = sc.nextBoolean();
        System.out.print("Apakah mahasiswa sedang mendapatkan sanksi akademik? (true/false) : ");
        sanksiAkademik = sc.nextBoolean();
        // meemriksa tahap 1
        if (mahasiswaAktif && !sanksiAkademik) {
            /*min. nilai daspro = 75 + (29%11) = 82 */
            System.out.print("Apakah anda memiliki sertifikat kompetensi pemograman? (true/false) : ");
            sertifikatKompetensi =sc.nextBoolean();
            System.out.print("Berapa niali daspro anda : ");
            nilaiDaspro = sc.nextInt();

            if (sertifikatKompetensi || nilaiDaspro >82) {
                /*nilai wawancara = 70 + (29%11) = 77 */
                System.out.print("Berapa nilai wawancara anda : ");
                nilaiWawancara = sc.nextInt();
                
                if (nilaiWawancara > 77) {
                    System.out.println("Selamat! Anda diterima menjadi asisten");
                } else {
                    System.out.println("Gagal! nilai anda kurang dari 77 setika seleksi wawancara");
                }
            } else {
                System.out.println("Gagal! Anda tidak memilki sertifikat kompetemsi pemrograman dan nilai anda kurang dari 82");
            }
        } else {
            System.out.println("Gagal! Anda bukan mahasiswa aktif atau sedang mendapatkan sanksi");
        }
        
    }
}
