import java.util.Scanner;

public class MenghitungLuasPersegiPanjang29 {
    public static void main(String[] args) {
      Scanner bitha = new Scanner(System.in);

    int panjang, lebar, luas;
    System.out.print("Berapakah panjang lapangan : ");
    panjang = bitha.nextInt();
    System.out.print("Berapakah luas lapangan : ");
    lebar = bitha.nextInt();

    luas = panjang * lebar;
    System.out.println("Luas lapangan persegi panjang adalah "+ luas);

    }
}
