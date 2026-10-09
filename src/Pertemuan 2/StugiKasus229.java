import java.util.Scanner;

public class StugiKasus229 {
    public static void main(String[] args) {
        Scanner bitha = new Scanner(System.in);
        
        int lebarTanah,panjangTanah, diameter;
        double luasTanah, luasTaman, luasKolamIkan, jariJari, pi = 3.14, sisaAkhir;
        int panjangSisi;
        //luas tanah awal
        System.out.print("Berapakah lebar tanah mula-mula: ");
        lebarTanah = bitha.nextInt();
        System.out.print("Berapakah panjang tanah mula-mula: ");
        panjangTanah = bitha.nextInt();
        luasTanah = panjangTanah * lebarTanah;
        //luas kolah ikan
        System.out.print("Berapakah panjang diameter kolam: ");
        diameter = bitha.nextInt();
        jariJari = diameter/2;
        luasKolamIkan = pi * jariJari * jariJari;
        //luas taman
        System.out.print("Berapakah panjang sisi taman: ");
        panjangSisi = bitha.nextInt();
        luasTaman = panjangSisi*panjangSisi;
        
        sisaAkhir = luasTanah-luasKolamIkan-luasTaman; 
    // hasil
        System.out.println("Luas tanah mula-mula adalah "+ luasTanah);
        System.out.println("Luas kolam ikan adalah "+ luasKolamIkan);
        System.out.println("Luas taman bunga adalah "+ luasTaman);
        System.out.println("Luas sisa tanah yang tidak terpakai "+ sisaAkhir);

    }
}
