import java.util.Scanner;

public class KafeDoWhile27 {
    public static void main(String[] args) {
        Scanner ryuh = new Scanner(System.in);

        int kopi, teh, roti, totalHarga;
        String namaPelanggan;
        int hargaKopi = 12000, hargaTeh = 8000, hargaRoti = 18000;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = ryuh.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }
            System.out.print("Jumlah kopi: ");
            kopi = ryuh.nextInt();
            System.out.print("Jumlah teh: ");
            teh = ryuh.nextInt();
            System.out.print("Jumlah roti: ");
            roti = ryuh.nextInt();
            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar: Rp " + totalHarga);
            ryuh.nextLine();
        } while (true);

        System.out.println("Semua transaksi selesai.");
    }
}