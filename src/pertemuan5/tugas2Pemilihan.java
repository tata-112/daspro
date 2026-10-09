package pertemuan5;

import java.util.Scanner;

public class tugas2Pemilihan {
    public static void main(String[] args) {
    Scanner bitha = new Scanner(System.in);

System.out.println("=== KRS Mahasiswa");
System.out.print("Berapa jumlah SKS anda : ");
int sks = bitha.nextInt();

if (sks<24) {
    System.out.println("KRS Valid");
} else {
    System.out.println("Melebihi batas");
}
}
}
