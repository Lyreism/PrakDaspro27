import java.util.Scanner;

public class Soal2_264107020167 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ===== KOTAK 1: Deklarasi Variabel (Input & Proses) =====
        System.out.print("Masukkan nama mahasiswa : ");
        String nama = sc.nextLine();
        System.out.print("Pilih kode layanan (1-4) : ");
        int kodeLayanan = sc.nextInt();

        // ===== KOTAK 2 & 3: Alur Pemilihan + Cetak Output =====
        switch (kodeLayanan) {
            case 1:
                System.out.println("Tiket diterbitkan untuk " + nama
                    + ". Jalur: Pembersihan & Pasta Termal (estimasi tunggu 30 menit ke Meja 1).");
                break;

            case 2:
                System.out.print("Bawa suku cadang sendiri? (Y/T) : ");
                String bawa = sc.next();
                if (bawa.equalsIgnoreCase("Y")) {
                    System.out.println("Tiket diterbitkan untuk " + nama
                        + ". Jalur: Ganti Komponen (Biaya Jasa Rp 25.000).");
                } else if (bawa.equalsIgnoreCase("T")) {
                    System.out.println("Tiket diterbitkan untuk " + nama
                        + ". Jalur: Ganti Komponen (Paket Lengkap Rp 120.000).");
                } else {
                    System.out.println("Input tidak valid. Masukkan Y atau T.");
                }
                break;

            case 3:
                System.out.print("Pilih jenis (1=Linux JTI, 2=Dual Boot Lab) : ");
                int jenis = sc.nextInt();
                if (jenis == 1) {
                    System.out.println("Tiket diterbitkan untuk " + nama
                        + ". Jalur: Instalasi OS Linux JTI.");
                } else if (jenis == 2) {
                    System.out.println("Tiket diterbitkan untuk " + nama
                        + ". Jalur: Instalasi Dual Boot Lab.");
                } else {
                    System.out.println("Opsi sistem operasi tidak tersedia.");
                }
                break;

            case 4:
                System.out.println("Tiket diterbitkan untuk " + nama
                    + ". Jalur: Pemeriksaan Hardware Rusak (investigasi mendalam di Meja 4).");
                break;

            default:
                System.out.println("Kode layanan tidak dikenali dalam sistem.");
                break;
        }

        sc.close();
    }
}