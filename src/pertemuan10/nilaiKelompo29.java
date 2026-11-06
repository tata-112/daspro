package pertemuan10;

import java.util.Scanner;
/*P=29
jumlahKelompok = (2 + (29 mod 3)) = 4 
jumlahPenilai = (3 + (29 mod 2)) = 4 */
public class nilaiKelompo29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah kelompok : ");
        int jmlKelompok = sc.nextInt();
        System.out.print("Masukkan Jumlah penilai : ");
        int jmlPenilai = sc.nextInt();

        if (jmlKelompok <= 0 || jmlPenilai <= 0) {
            System.out.println("Jumlah kelompok dan penilai harus > 0.");
        } else {
            int nomorKelompok=1;
            double rataTertinggi=-1;
            int kelompokTerbaik=0;

            while (nomorKelompok <= jmlKelompok) {
                System.out.println("Kelompok "+nomorKelompok);
                double totalNilai=0;

                for (int j = 1; j <= jmlPenilai; j++) {
                    int nilai;
                    do {
                        System.out.print(" Nilai dari penilai "+j+": ");
                        nilai =sc.nextInt();
                        if (nilai<0 || nilai >100) {
                            System.out.println("Nilai harus 0-100. Ulangi input!");
                        }
                    } while (nilai <0 || nilai>100);
                    totalNilai += nilai;
                }

                double rataNilai =totalNilai/jmlPenilai;
                System.out.println("Kelompok "+nomorKelompok+": nilai rata-rata = "+rataNilai);

                if (rataNilai>rataTertinggi) {
                    rataTertinggi =rataNilai;
                    kelompokTerbaik=nomorKelompok;
                }

                nomorKelompok++;
            }
            System.out.println("=============================");
            System.out.println("Kelompok terbaik      : "+kelompokTerbaik);
            System.out.println("Rata - rata tertinggi : "+rataTertinggi);
        }
    }
}
