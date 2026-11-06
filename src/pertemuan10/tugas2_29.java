package pertemuan10;

public class tugas2_29 {
    public static void main(String[] args) {
        /*P=29
        n = (5+(29%4)) = 6 */

        int total=0;
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                int hasilKali =i*j ;
                System.out.printf("%4d",hasilKali);
                
                total += hasilKali; 
            }
            System.out.println();
           
        }
         System.out.println("Jumlah seturuh angka : "+total);
    }
}
