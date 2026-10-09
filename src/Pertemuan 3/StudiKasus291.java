import java.util.Scanner;

public class StudiKasus291 {

    public static void main(String[] args) {
        Scanner bitha = new Scanner(System.in);

        int uangMuka, hargaAwalLaptop, uangKurang;
        double lamaBulan;
        double bunga = 0.02, besarBunga;
        double jmlCicilan;

        System.out.print("Berapakah harga awal laptop : ");
        hargaAwalLaptop = bitha.nextInt();
        System.out.print("Berapa jumlah uang muka yang dibayar : ");
        uangMuka = bitha.nextInt();
        System.out.print("Berapa bulan waktu untuk melunasi sisa uang  laptop : ");
        lamaBulan = bitha.nextInt();

        uangKurang = hargaAwalLaptop - uangMuka;
        besarBunga = bunga * uangKurang ;
        jmlCicilan = (uangKurang + besarBunga) / lamaBulan;
        System.out.println("Berapakah jumlah cicilan yang harus dibayar? Rp."+ jmlCicilan);

        bitha.close();
    }
}