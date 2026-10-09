import java.util.Scanner;

public class StudiKasus292 {

    public static void main(String[] args){
    Scanner bitha = new Scanner(System.in);

    int banyakLembar, hargaPrint, totalBayar;
    int biayaCetak = 500;
    int jilid = 5000;

    System.out.print("Mau cetak berapa lembar? ");
    banyakLembar = bitha.nextInt();

    hargaPrint = banyakLembar * biayaCetak;
    totalBayar = hargaPrint + jilid;

    System.out.println("Total biaya yang harus dibayarkan adalah : "+ totalBayar);
    
    }
}
