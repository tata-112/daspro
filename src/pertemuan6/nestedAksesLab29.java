package pertemuan6;

import java.util.Scanner;

public class nestedAksesLab29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean mahasiswaAktif;
        boolean sedangDisanksi;
        boolean punyaIzinDosen;
        boolean asistenLab;
        System.out.print("Apakah mahasiswa sedang aktif? (true/false) : ");
        mahasiswaAktif = sc.nextBoolean();
        System.out.print("Apakah mahasiswa sedang mendapatkan sanksi? (true/false) : ");
        sedangDisanksi = sc.nextBoolean();
        System.out.print("Apakah mahasiswa sudh memiliki izin dosen? (true/false) : ");
        punyaIzinDosen = sc.nextBoolean();
        System.out.print("Apakah mahasiswa merupakan asisten lab? (true/false) : ");
        asistenLab = sc.nextBoolean();

        if(mahasiswaAktif && (!sedangDisanksi)){
            if (punyaIzinDosen || asistenLab) {
                System.out.println("Akses laboratorium diberikan");
            }else{
                System.out.println("Akses ditolak: membutuhkan izin dosen atau status asistem lab");
            }
        }else{
            System.out.println("Akses ditolak: status mahasiswa tidak memenuhi syarat");
        }
    }
}
