import java.util.Scanner;

public class Bank29 {
    public static void main(String[] args) {
        Scanner bitha = new Scanner(System.in);

        int jml_tabungan_awal, lama_menabung;
        double prosentase_bunga = 0.02;
        double bunga;
        double jml_tabungan_akhir;
        System.out.print("Masukkan jumlah tabungan awal anda :");
        jml_tabungan_awal = bitha.nextInt();
        System.out.print("Masukkan lama menabung anda :");
        lama_menabung = bitha.nextInt();
        bunga= lama_menabung*prosentase_bunga*jml_tabungan_awal;
        jml_tabungan_akhir = (bunga + jml_tabungan_awal);
        System.out.println("Bunga adalah "+ bunga);
        System.out.println("Jumlah tabungan akhir anda adalah "+ jml_tabungan_akhir);




    }
}

