package pertemuan10;

public class tugas1_29 {
    public static void main(String[] args) {
        /*P = 29
        n = (6 + (29 % 5)) = 10 */

        int angka=0;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
                angka++;
            }
            System.out.println();
        }
        System.out.println("Total angka tercetak : "+angka);
    }
}
