package Pertemuan12;

public class SearchNilai29 {
    /*P=29
    Percobaan 4 (key) = 50 + (29 mod 50) = 79 
    Percobaan 4 Bagian B = 20 + (29 mod 60) = 49 */
    public static void main(String[] args) {
        int []nilai = {78, 65, 90, 55, 88, 72};
        int key = 90;
        boolean ditemukan = false;

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key ) {
                System.out.println("Nilai "+key+" ditemukan pada indeks ke-"+i);
                ditemukan=true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Nilai "+key+" tidak ditemukan");
        }
    }
}
