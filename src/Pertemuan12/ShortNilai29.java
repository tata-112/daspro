package Pertemuan12;

import java.util.Arrays;
/*P=29
Percobaan 4 Bagian B = 20 + (29 mod 60) = 49
{49, 49+15= 64, 49−8=41, 49+30=79, 49−20=29, 49+5=44} */
public class ShortNilai29 {
    public static void main(String[] args) {
        int[]nilai={49, 64, 41, 79, 29, 44};
        for (int i = 0; i < nilai.length - 1; i++) {
            for (int j = 0; j < nilai.length - 1 - i; j++) {
                if (nilai[j] < nilai[j+1]) {
                    int temp = nilai[j]; //nyimpen nilai sementara supaya nilai j ga ilang
                    nilai[j] = nilai[j+1]; //mengganti nilai j dengan nilai yang bar
                    nilai[j+1] = temp;  
                }
            }
        }
        System.out.println(Arrays.toString(nilai)); //ngeprint seluruh nilai
    }
}
