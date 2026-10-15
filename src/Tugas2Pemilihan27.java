import java.util.Scanner;

public class Tugas2Pemilihan27 {
    public static void main(String[] args) {
        Scanner ryuh = new Scanner(System.in);

        int jumlahSks;

        System.out.print("Masukkan jumlah SKS: ");
        jumlahSks = ryuh.nextInt();

        if (jumlahSks > 24) {
            System.out.println("Melebihi batas");
        } else {
            System.out.println("KRS valid");
        }

        ryuh.close();
    }
}