package UTS;

import java.util.Scanner;

public class parkirGedung29 {
    public static void main(String[] args) {
        Scanner bitha = new Scanner(System.in);

        /* p=29
        tarif per jam kode 1(motor) = 2500
          tarif per jam kode 2 (mobil) = 5500
          tarif per jam kode 3 (truk) = 10500
          B: banyak jam pertama yg dikenai harga penuh = 4
          S: batas syarat tambahan = 7 */
        System.out.print("Kode Kendaraan\t: ");
        int kode = bitha.nextInt(); bitha.nextLine();
        System.out.print("Lama Parkir\t: ");
        int lamaParkir = bitha.nextInt(); bitha.nextLine();
        System.out.print("Hari\t: ");
        String hari = bitha.nextLine();


        int biayaDasar=0;
        String layanan = "";
        double bayarLebih=0;
        int bayar1=0;
          switch (kode) {
            case 1:
                layanan ="Motor";
                biayaDasar=2500;
                if (hari.equalsIgnoreCase("senin")||hari.equalsIgnoreCase("selasa")||hari.equalsIgnoreCase("rabu")||hari.equalsIgnoreCase("kamis")||hari.equalsIgnoreCase("jumat")) {
                    if ((lamaParkir<=4)) {
                       bayar1 = 2500; 
                    } else if(lamaParkir>4 && lamaParkir<=7) {
                        bayar1 = 2500 +((lamaParkir-4)*1000);
                    }
                }else if(hari.equalsIgnoreCase("sabtu")|| hari.equalsIgnoreCase("Minggu")||lamaParkir>7){
                    bayarLebih = (2500-(2500*0.1)) +1000;                        }
                 
                     break;
            case 2:
                layanan ="Mobil";
                biayaDasar=5500;
                if (hari.equalsIgnoreCase("senin")||hari.equalsIgnoreCase("selasa")||hari.equalsIgnoreCase("rabu")||hari.equalsIgnoreCase("kamis")||hari.equalsIgnoreCase("jumat")) {
                    if ((lamaParkir<=4)) {
                       bayar1 = 5500; 
                    } else if(lamaParkir>4 && lamaParkir<=7) {
                        bayar1 = 5500 +((lamaParkir-4)*1000);
                    }
                }else if(hari.equalsIgnoreCase("sabtu")|| hari.equalsIgnoreCase("Minggu")||lamaParkir>7){
                    bayarLebih = (5500-(5500*0.1)) +1000;                        
                    }
                    
                
                break;
            case 3:
                layanan ="Truk";
                biayaDasar=10500;
                if (hari.equalsIgnoreCase("senin")||hari.equalsIgnoreCase("selasa")||hari.equalsIgnoreCase("rabu")||hari.equalsIgnoreCase("kamis")||hari.equalsIgnoreCase("jumat")) {
                    if ((lamaParkir<=4)) {
                       bayar1 = 10500;

                    } else if(lamaParkir>4 && lamaParkir<=7) {
                        bayar1 = 10500 +((lamaParkir-4)*1000);
                    }
                }else if(hari.equalsIgnoreCase("sabtu")|| hari.equalsIgnoreCase("Minggu")||lamaParkir>7){
                    bayarLebih = (10500-(10500*0.1)) +1000;                        
                    }
                    
                
                break;
                
            default:
                break;
          }
          System.out.println("layanan :"+layanan);
          System.out.println("Biaya Dasar :"+biayaDasar);
          System.out.println("tambahan :"+bayarLebih);
          System.out.println("total bayar :"+bayar1);
          
    }
}
