import java.util.Scanner;

public class TugasParkir27 {
    public static void main(String[] args) {
        Scanner ryuh = new Scanner(System.in);
        int jam, biaya;

        System.out.print("Masukkan lama parkir (jam): ");
        jam = ryuh.nextInt();

        if (jam <= 2) {
            biaya = 2000;
        } else {
            biaya = 2000 + (jam - 2) * 1000;
        }

        System.out.println("Total biaya parkir: Rp " + biaya);

        ryuh.close();
    }
}