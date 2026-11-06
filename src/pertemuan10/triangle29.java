package pertemuan10;
/*P = 29
Percobaan 3 (uji awal,langkah 3) = 2 + (29 mod 3) = 4 */
import java.util.Scanner;

public class triangle29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n : ");
        int n = sc.nextInt();
       
        int i = 1;
        // while (i <= n) {
            int j = 1;
        //     while (j <= i) {
        //         System.out.print("*");
        //         j++;
        //     }
        //     System.out.println();
        //     i++;
        // }

        i=n;
        while (i > 0) {
            j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            
            System.out.println();
            i--;
        }
        sc.close();

        

    }
}
