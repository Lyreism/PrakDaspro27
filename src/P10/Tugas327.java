package P10;
import java.util.Scanner;

public class Tugas327 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = sc.nextInt();

        if (jumlahToko < 1) {
            System.out.println("Jumlah toko minimal 1.");
        } else {
            int totalSemuaToko = 0;
            int maxBarang = -1;
            int tokoTerbanyak = 0;

            for (int toko = 1; toko <= jumlahToko; toko++) {
                System.out.println("Toko " + toko);

                int pelanggan;
                do {
                    System.out.print("  Jumlah pelanggan: ");
                    pelanggan = sc.nextInt();
                    if (pelanggan < 0) {
                        System.out.println("  Tidak boleh negatif. Ulangi input!");
                    }
                } while (pelanggan < 0);

                int totalBarangToko = 0;

                for (int p = 1; p <= pelanggan; p++) {
                    int barang;
                    do {
                        System.out.print("    Barang dibeli pelanggan " + p + ": ");
                        barang = sc.nextInt();
                        if (barang < 0) {
                            System.out.println("    Tidak boleh negatif. Ulangi input!");
                        }
                    } while (barang < 0);
                    totalBarangToko += barang;
                }

                System.out.println("Toko " + toko + " - pelanggan: " + pelanggan
                        + ", total barang: " + totalBarangToko);
                totalSemuaToko += totalBarangToko;

                if (totalBarangToko > maxBarang) {
                    maxBarang = totalBarangToko;
                    tokoTerbanyak = toko;
                }
            }

            System.out.println("==============================");
            System.out.println("Total barang seluruh toko: " + totalSemuaToko);
            System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);
        }
        sc.close();
    }
}