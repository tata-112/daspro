package pertemuan6;

import java.util.Scanner;

public class tugas1NestedIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String kamus,novel = "";
        String diskon="";

        System.out.print("Jenis buku yang dibeli : ");
        String jenisBuku = sc.nextLine().trim();
        System.out.print("Berapa jumlah buku yang dibeli : ");
        int jmlBuku = sc.nextInt();

        switch (jenisBuku) {
            case "kamus":
            /*diskon dasar = 8 + (29 % 5) = 12% 
              jumlah buku tambahan = 2 + (29 % 2) = 3 buku*/
                if (jmlBuku > 3) {
                    diskon = "Mndapatkan diskon 12% dengan tambahan 2%";
                } else if (jmlBuku >0 && jmlBuku<=3) {
                    diskon = "Mendapatkan diskon 12%";
                }
                break;
            case "novel":
                /*diskon dasar = 5 + (29%4) = 6%
                  jumbah buku tambahan = 3 + (29%2) = 4 buku */
                if (jmlBuku > 4) {
                    diskon = "Mendapatkan diskon 6% dengan tambahan 2%";
                } else if (jmlBuku>=1 && jmlBuku<4) {
                    diskon = "Mendapatkan diskon 6% dengan tambahan 1%";
                } 
                break;
            case "!kamus,novel":
                /*diskon buku = 3 +(29%4) = 4%
                  dengan jumlah buku = 3 + (29%2) = 4 buku */
                if (jenisBuku != "kamus" && jenisBuku != "novel") {
                    if (jmlBuku> 4) {
                    diskon = "Mendapatkan diskon 4%";
                    }
                }
                break;
            default:
                System.out.println("Diskon tidak tersedia");
                break;
        }
        // System.out.println("Jumlah diskon yang diterima :"+diskon+ " %");
        System.out.println(diskon);
    }
}
