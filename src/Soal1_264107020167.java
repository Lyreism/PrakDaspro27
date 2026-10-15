import java.util.Scanner;

public class Soal1_264107020167 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ===== KOTAK 1: Deklarasi Variabel (Input & Proses) =====
        System.out.print("Masukkan nama penyewa : ");
        String nama = sc.nextLine();
        System.out.print("Durasi pemakaian (jam) : ");
        int durasi = sc.nextInt();
        System.out.print("Memiliki kartu anggota (Y/T): ");
        String member = sc.next();

        int tagihanKotor = 0;
        int diskon = 0;
        int totalBayar;

        // ===== KOTAK 2: Alur Pemilihan =====
        if (durasi <= 0) {
            System.out.println("Durasi tidak valid. Harus lebih dari 0 jam.");
        } else {
            if (durasi <= 2) {
                tagihanKotor = durasi * 10000;
            } else if (durasi <= 5) {
                tagihanKotor = durasi * 8500;
            } else {
                tagihanKotor = (durasi * 7000) + 5000;
            }

            if (member.equalsIgnoreCase("Y")) {
                diskon = tagihanKotor * 10 / 100;
            }
            totalBayar = tagihanKotor - diskon;

            // ===== KOTAK 3: Cetak Output =====
            System.out.println("Subtotal biaya : Rp " + tagihanKotor);
            System.out.println("Diskon keanggotaan (10%) : Rp " + diskon);
            System.out.println("Total bayar : Rp " + totalBayar);

            System.out.print("Masukkan uang pembayaran : ");
            int uang = sc.nextInt();

            if (uang >= totalBayar) {
                System.out.println("Kembalian : Rp " + (uang - totalBayar));
            } else {
                System.out.println("Uang kurang : Rp " + (totalBayar - uang));
            }
        }

        sc.close();
    }
}