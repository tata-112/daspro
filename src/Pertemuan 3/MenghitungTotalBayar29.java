
import java.util.Scanner;

class MenghitungTotalBayar29 {
    public static void main(String[] args) {
        Scanner bitha = new Scanner(System.in);

    double harga;
    double potongan;
    double jml_harga;
    // double diskon=0.15;
    double diskon = 0.85;

    System.out.print(" Berapakah harga baju : ");
    harga= bitha.nextInt();
    potongan = diskon*harga;
    // jml_harga = harga - potongan;
    System.out.println("Jumlah yang harus anda bayar adalah Rp."+ potongan);
    }
    
}