package pertemuan10;

/* P = 29
Percobaan 2 (uji tambahan, langkah 9) = (2 + (29 mod 3) = 4, 4 + (29 mod 3) = 6) 
Percobaan 2 (uji tambahan, langkah 9) = (5 + (29 mod 3) = 7, 2 + (29 mod 3) = 4) 
Percobaan 2 (Pertanyaan 2) = 4 + (29 mod 4) = 5, 6 + (29 mod 4) = 7 */
import java.util.Scanner;

public class rectangle29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris : ");
        int baris = sc.nextInt();
        System.out.print("Masukkan jumlah kolom : ");
        int kolom = sc.nextInt();

        for (int i = 1; i <= baris; i++) {  //baris
            for (int j = 1; j <= kolom; j++) {  //kolom
                System.out.print("*");    
            }
            System.out.println();  //untuk pindah baris ketika sudah 1 kolom
        }
        sc.close();
    }
}
