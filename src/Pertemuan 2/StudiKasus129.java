import java.util.Scanner;

public class StudiKasus129 {
    public static void main(String[] args) {
        Scanner bitha = new Scanner(System.in);
        
        int gajiPokok;
        int tunjangan, jmlAnak;
        double tunjanganTiapBulan;
        double besarDanaPensiun, totalGajiBersih, danaPensiun = 0.1;

        System.out.print("Berapakah besar gaji pokok: ");
        gajiPokok = bitha.nextInt();
        System.out.print("Berpakah jumlah anak yang dimiliki: ");
        jmlAnak = bitha.nextInt();
        System.out.print("Jumlah tunjangan yang didapat: ");
        tunjangan = bitha.nextInt();

        tunjanganTiapBulan = tunjangan * jmlAnak;
        besarDanaPensiun = danaPensiun * gajiPokok;
        totalGajiBersih = tunjanganTiapBulan + (gajiPokok-besarDanaPensiun);

        System.out.println("Total gaji bersih yang didapatkan : "+ totalGajiBersih );





    }   
}
