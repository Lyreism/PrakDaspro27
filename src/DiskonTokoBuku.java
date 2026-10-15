import java.util.Scanner;

public class DiskonTokoBuku {
    public static void main(String[] args) {
        Scanner ryuh = new Scanner(System.in);

        int P = 27;
        int diskonKamus       = 8 + (P % 5);   
        int batasKamus        = 2 + (P % 2);   
        int diskonNovel       = 5 + (P % 4);   
        int batasNovel        = 3 + (P % 2);   
        int diskonLain        = 3 + (P % 4);   
        int batasLain         = 3 + (P % 2);   

        System.out.println("=== TOKO BUKU - DISKON HARI RABU ===");
        System.out.println("Jenis buku: 1. Kamus  2. Novel  3. Lainnya");
        System.out.print("Pilih jenis buku : ");
        int jenis = ryuh.nextInt();
        System.out.print("Jumlah buku      : ");
        int jumlah = ryuh.nextInt();
        System.out.print("Harga per buku   : ");
        double harga = ryuh.nextDouble();

        int diskon = 0;

        if (jenis >= 1 && jenis <= 3 && jumlah > 0) {   
            if (jenis == 1) {                            
                diskon = diskonKamus;
                if (jumlah > batasKamus) {
                    diskon += 2;
                }
            } else if (jenis == 2) {                     
                diskon = diskonNovel;
                if (jumlah > batasNovel) {
                    diskon += 2;
                } else {
                    diskon += 1;
                }
            } else {                                     
                if (jumlah > batasLain) {
                    diskon = diskonLain;
                } else {
                    diskon = 0;
                }
            }

            double totalAwal   = jumlah * harga;
            double nilaiDiskon = totalAwal * diskon / 100;
            double totalBayar  = totalAwal - nilaiDiskon;

            System.out.println("\n--- HASIL ---");
            System.out.println("Total awal   : Rp " + totalAwal);
            System.out.println("Diskon       : " + diskon + "%");
            System.out.println("Jumlah diskon: Rp " + nilaiDiskon);
            System.out.println("Total bayar  : Rp " + totalBayar);
        } else {
            System.out.println("Input tidak valid!");
        }
    }
}