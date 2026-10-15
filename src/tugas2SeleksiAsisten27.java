import java.util.Scanner;

public class tugas2SeleksiAsistenNoPresensi {
    public static void main(String[] args) {
        Scanner ryuh = new Scanner(System.in);

        int P = 27;
        int minNilaiDasPro   = 75 + (P % 11);   // 80
        int minNilaiWawancara = 70 + (P % 11);  // 75

        System.out.println("=== SELEKSI CALON ASISTEN PRAKTIKUM ===");
        System.out.print("Nama mahasiswa                          : ");
        String nama = ryuh.nextLine();
        System.out.print("Status aktif? (1 = aktif, 0 = tidak)    : ");
        int aktif = ryuh.nextInt();
        System.out.print("Sedang sanksi akademik? (1 = ya, 0 = tidak): ");
        int sanksi = ryuh.nextInt();

        System.out.println("\n--- HASIL SELEKSI: " + nama + " ---");

        if (aktif == 1 && sanksi == 0) {
            System.out.println("Tahap 1 (administrasi): LOLOS");

            System.out.print("Nilai Dasar Pemrograman                 : ");
            double nilaiDasPro = ryuh.nextDouble();
            System.out.print("Punya sertifikat kompetensi? (1 = ya, 0 = tidak): ");
            int sertifikat = ryuh.nextInt();

            if (nilaiDasPro >= minNilaiDasPro || sertifikat == 1) {
                System.out.println("Tahap 2 (kompetensi)  : LOLOS");

                System.out.print("Nilai wawancara                         : ");
                double nilaiWawancara = ryuh.nextDouble();

                if (nilaiWawancara >= minNilaiWawancara) {
                    System.out.println("Tahap 3 (wawancara)   : LOLOS");
                    System.out.println("\nSTATUS: DITERIMA sebagai asisten praktikum.");
                } else {
                    System.out.println("Tahap 3 (wawancara)   : GAGAL");
                    System.out.println("Alasan: nilai wawancara " + nilaiWawancara
                            + " kurang dari minimal " + minNilaiWawancara + ".");
                    System.out.println("\nSTATUS: TIDAK DITERIMA.");
                }
            } else {
                System.out.println("Tahap 2 (kompetensi)  : GAGAL");
                System.out.println("Alasan: nilai Dasar Pemrograman " + nilaiDasPro
                        + " kurang dari minimal " + minNilaiDasPro
                        + " dan tidak memiliki sertifikat kompetensi.");
                System.out.println("\nSTATUS: TIDAK DITERIMA.");
            }
        } else {
            System.out.println("Tahap 1 (administrasi): GAGAL");
            if (aktif != 1 && sanksi == 1) {
                System.out.println("Alasan: mahasiswa tidak aktif dan sedang mendapat sanksi akademik.");
            } else if (aktif != 1) {
                System.out.println("Alasan: mahasiswa tidak berstatus aktif.");
            } else {
                System.out.println("Alasan: mahasiswa sedang mendapat sanksi akademik.");
            }
            System.out.println("\nSTATUS: TIDAK DITERIMA.");
        }
    }
}