public class ContohVariabel29 {
    public static void main(String[] args) {
        String hobbySaya = "Bermain petak Umpet";
        boolean apaPandai= true;
        char jenisKelamin='L';
        Byte umurSayaSekarang=20;
        double ipk = 3.24, tinggi=1.78;


        System.out.println(hobbySaya);
        System.out.println("Apakah pandai? "+ apaPandai);
        System.out.println("Jenis Kelamin "+ jenisKelamin);
        System.out.println("Umurku saat ini: "+ umurSayaSekarang);
        System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s", ipk,tinggi));
    }
}
