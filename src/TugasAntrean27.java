import java.util.Scanner;

public class TugasAntrean27 {
    public static void main(String[] args) {
        Scanner ryuh = new Scanner(System.in);
        int kode;

        System.out.print("Masukkan kode layanan: ");
        kode = ryuh.nextInt();

        switch (kode) {
            case 1:
                System.out.println("Layanan: Legalisir Ijazah, Loket: A");
                break;
            case 2:
                System.out.println("Layanan: Surat Keterangan Aktif Kuliah, Loket: B");
                break;
            case 3:
                System.out.println("Layanan: Pembayaran UKT, Loket: C");
                break;
            case 4:
                System.out.println("Layanan: Pengajuan Cuti Akademik, Loket: D");
                break;
            default:
                System.out.println("Kode layanan tidak tersedia");
        }

        ryuh.close();
    }
}