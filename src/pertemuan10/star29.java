package pertemuan10;
/* P=29
Percobaan 1 (uji tambahan)= 3 + (29 mod 5) = 7
Percobaan 1 (uji tambahan) = 9 + (29 mod 5) = 13
Percobaan 1 (Pertanyaan 1 & 2) = 4 + (29 mod 4) = 5
Percobaan 1 (Pertanyaan 3) = 10 + (29 mod 6) =15 */

import java.util.Scanner;

public class star29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n ; i++) {
            System.out.print("*");
        }
        System.out.println();
        sc.close();
    }
}
