import java.util.Scanner;

public class Soal3_264107020167 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ===== KOTAK 1: Deklarasi Variabel (Input & Proses) =====
        System.out.print("Masukkan nama pengguna : ");
        String nama = sc.nextLine();
        System.out.print("Apakah memiliki sanksi? (Y/T) : ");
        String sanksi = sc.nextLine();

        // ===== KOTAK 2: Alur Pemilihan (Nested IF) =====
        // Tingkat 1: Integritas
        if (sanksi.equalsIgnoreCase("T")) {

            System.out.print("Masukkan peran (Admin/Peneliti/Mhs): ");
            String role = sc.nextLine();

            // Tingkat 2: Peran Akun
            if (role.equalsIgnoreCase("Admin") || role.equalsIgnoreCase("Peneliti")) {
                // Tingkat 3A
                // ===== KOTAK 3: Cetak Output =====
                System.out.println("STATUS: Akses Server Diberikan kepada " + nama
                    + " (Hak Akses Penuh ke Terminal Konsol Utama).");

            } else if (role.equalsIgnoreCase("Mahasiswa") || role.equalsIgnoreCase("Mhs")) {
                // Tingkat 3B
                System.out.print("Masukkan IPK mahasiswa : ");
                double ipk = sc.nextDouble();
                System.out.print("Jumlah jam asisten laboratorium : ");
                int jamAsisten = sc.nextInt();

                if (ipk >= 3.25 && jamAsisten >= 20) {
                    System.out.println("STATUS: Akses Server Diberikan kepada " + nama
                        + " (Hak Akses Peneliti Muda).");
                } else {
                    System.out.println("STATUS: Ditolak. Kualifikasi akademik atau jam asisten belum cukup.");
                }

            } else {
                System.out.println("STATUS: Ditolak. Peran pengguna tidak terdaftar dalam basis data.");
            }

        } else {
            System.out.println("STATUS: Ditolak. Mahasiswa memiliki catatan pelanggaran etik aktif.");
        }

        sc.close();
    }
}