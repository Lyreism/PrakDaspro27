import java.util.Scanner;

public class TIketKereta27 {
    public static void main(String[] args) {
        Scanner ryuh = new Scanner(System.in);

        System.out.println("Masukkan kode tiket:");
        int kodetiket = ryuh.nextInt();
        int biayaDasar;

        switch (kodetiket) {
            case 1:
                biayaDasar = 200000;
                break;
            case 2:
                biayaDasar = 375000;
                break;
            case 3:
                biayaDasar = 150000;
                break;
            default:
                System.out.println("Kode tiket tidak valid.");
                ryuh.close();
                return;
        }

        System.out.println("Biaya dasar: " + biayaDasar);
        ryuh.close();
    }
}
