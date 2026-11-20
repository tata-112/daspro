package Pertemuan12;

import java.util.Arrays;

/*P=29
Percobaan 1 = 29 ; 29+8=37 ; −(1+(29 mod 7))=-2 ; 20+(29 mod 15)=34  */
public class ArrayBilangan29 {
    public static void main(String[] args) {
        int bil[] = new int[4];
        bil[0] = 5.0;
        bil[1] = 12867;
        bil[2] = 7.5;
        bil[3] = 2000000;

        for (int i = 0; i < bil.length; i++) {
            System.out.println("Bil ["+i+"] = "+bil[i]);
        }

        for (int nilai : bil) {
            System.out.println(nilai);
        }
        
        System.out.println(Arrays.toString(bil));
    }
}
